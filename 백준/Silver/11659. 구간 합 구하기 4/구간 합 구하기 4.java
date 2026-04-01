import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] nums = new int[N];
        int sum = 0;
   
        
        for(int i = 0; i < N; i++) {
        	sum += sc.nextInt();
        	nums[i] = sum;
        }
        for(int j = 0; j < M; j++) {
        	int start = sc.nextInt();
        	int end = sc.nextInt();
        	if(end == 1 && start == end) {
        		System.out.println(nums[end-1]);
        	}else if(start != 1) {
        		System.out.println(nums[end-1] - nums[start-2]);
        	}else {
        		System.out.println(nums[end-1]);
        	}
        }
    }
}
