import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        Time[] time = new Time[N];
        for(int i = 0; i < N; i++) {
        	time[i] = new Time(sc.nextInt(), sc.nextInt());
        }
        Arrays.sort(time);
        int result = 0;
        int endTime = 0;
        for(Time t: time) {
        	if(t.startTime >= endTime) {
        		result++;
        		endTime = t.endTime;
        	}
        }
        System.out.println(result);
    }
}

class Time implements Comparable<Time>{
	int startTime;
	int endTime;
	
	public Time(int startTime, int endTime) {
		this.startTime = startTime;
		this.endTime = endTime;
	}

	@Override
	public int compareTo(Time o) {
		// TODO Auto-generated method stub
		if(this.endTime == o.endTime)
			return this.startTime - o.startTime;
		return  this.endTime - o.endTime;
	}
	
	
}