import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Bridge bridge = new Bridge(bridge_length, weight);

        for (int i = 0; i < truck_weights.length; i++) {
            boolean add = bridge.addTruck(new Truck(truck_weights[i]));

            if (!add) {
                i--;
            }

            bridge.moveTrucks();
        }

        bridge.moveTrucksEnd();

        return bridge.count;
    }
}

class Bridge {
    int length;
    int weight;
    int total_weight;
    int count;
    Queue<Truck> trucks;

    public Bridge(int length, int weight) {
        this.length = length;
        this.weight = weight;
        this.total_weight = 0;
        this.count = 1;
        this.trucks = new LinkedList<>();
    }

    public boolean addTruck(Truck truck) {
        if (weight >= truck.weight + total_weight) {
            this.total_weight += truck.weight;
            trucks.offer(truck);
            return true;
        }

        return false;
    }

    public void moveTrucks() {
        if (!trucks.isEmpty()) {
            for (Truck truck : trucks) {
                truck.moveTruck();
            }

            count++;

            if (trucks.peek().location == this.length) {
                Truck outTruck = trucks.poll();
                total_weight -= outTruck.weight;
            }
        }
    }

    public void moveTrucksEnd() {
        while (!trucks.isEmpty()) {
            for (Truck truck : trucks) {
                truck.moveTruck();
            }

            count++;

            if (trucks.peek().location == this.length) {
                Truck outTruck = trucks.poll();
                total_weight -= outTruck.weight;
            }
        }
    }
}

class Truck {
    int weight;
    int location;

    public Truck(int weight) {
        this.weight = weight;
        this.location = 0;
    }

    public void moveTruck() {
        this.location++;
    }
}