import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        sc.nextLine();
        String result = "";
        
        for(int i = 0; i < T; i++) {
        	String[] input = sc.nextLine().split(" ");
        	int min = 100;
            int sum = 0;
            
            for(int j = 0; j < input.length; j++) {
            	int num = Integer.parseInt(input[j]);
            	if(num % 2 == 0) {
            		sum+=num;
            		if(num<min) {
            			min = num;
            		}
            	}
            }
            result = result + sum + " " + min + "\n";
            
        }
        System.out.println(result);
        		
    }
}