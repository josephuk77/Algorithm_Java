import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] nums = new int[N+1];
        int[] order = new int[N+2];
        
        for(int i = 1; i <= N; i++) {
        	nums[i] = sc.nextInt();
        }
        
        for(int i = 0; i < M; i++) {
        	int start = sc.nextInt();
        	int end = sc.nextInt();
        	int num = sc.nextInt();
        	
        	order[start] += num;
        	order[end+1] += num*-1;
        }
        for(int i = 1; i <= N; i++) {
        	order[i] += order[i-1];
        	nums[i] += order[i];
        }
        
        for(int i = 1; i<=N; i++) {
        	System.out.print(nums[i]+" ");
        }
        
    }
}
