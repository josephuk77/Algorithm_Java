import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int Q = sc.nextInt();
        int[] nums = new int[N+1];
        int sum = 0;
        int xor = 0;
   
        
        for(int i = 1; i < N+1; i++) {
        	sum ^= sc.nextInt();
        	nums[i] = sum;
        }
        for(int j = 0; j < Q; j++) {
        	int start = sc.nextInt();
        	int end = sc.nextInt();
        	xor ^= (nums[end] ^ nums[start-1]);
        }
        System.out.println(xor);
    }
}
