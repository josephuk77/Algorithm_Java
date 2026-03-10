import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] arr = sc.nextLine().split(":");

        int[] input = new int[arr.length];

        for(int i = 0; i < arr.length; i++){
            input[i] = Integer.parseInt(arr[i]);
        }
        String[] arr2 = sc.nextLine().split(":");

        int[] input2 = new int[arr.length];

        for(int i = 0; i < arr2.length; i++){
            input2[i] = Integer.parseInt(arr2[i]);
        }
        
        int time[] = new int[3];
        
        for(int i = 0; i < 3; i++) {
        	if(input[i] > input2[i] && i == 0) {
        		time[i] = input2[i] - input[i] + 24;
        	}else if(input[i] > input2[i]) {
        		time[i] = input2[i] - input[i] + 60;
        		if(time[i - 1] == 0 && i == 1) {
        			time[i-1] = 23;
        		}
        		else if(time[i - 1] == 0 && i == 2) {
        			time[i-1] = 59;
        			if(time[i-2] == 0)
        				time[i-2] = 23;
        			else
        				time[i-2]--;
        		}else {
        			time[i -1]--;
        		}
        		
        	}else {
        	
        		time[i] = input2[i] - input[i];
        	}
        }
        if(time[0] == 0 && time[1] == 0 && time[2] == 0)
        	System.out.print("24:00:00");
        else
        	System.out.printf("%02d:%02d:%02d",time[0],time[1],time[2]);
        
        
    }
}