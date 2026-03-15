import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();
        sc.nextLine();
        
        int[] result = new int[tc];
        
        for(int i = 0; tc > i; i++) {
        	String[] inputString = sc.nextLine().split(" ");

        	int count = 0;
        	int[] input = new int[20];
        	int index = -1;
        	for(int j = 0; j < 20; j++) {
        		int tmp = Integer.parseInt(inputString[j+1]);
        		
        		for(int k = j-1; k >= 0; k--) {
        			
        			if(tmp < input[k])
        				index = k;
        		}
        		if(index != -1) {
        			count += j - index;
        			insertElement(input, j, index, tmp);
        		}else {
        			input[j] = tmp;
        		}
        		index = -1;
        	}
        	result[i] = count;
        	
        }
        
        for(int i = 0; tc > i; i++) {
        	System.out.println(i+1 +" "+result[i]);
        }
    }
    
    public static boolean insertElement(int[] arr, int arrCount, int idx, int val) {
    	if (idx > arrCount || arrCount >= arr.length)
    		return false;
    	for (int i = arrCount; i > idx; i-- )
    		arr[i] = arr[i-1];
    	arr[idx] = val;
    	return true;
    }
}