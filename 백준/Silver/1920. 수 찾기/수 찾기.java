import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        Set<Integer> nums = new HashSet<>();
        for(int i = 0; i < N; i++) {
        	nums.add(sc.nextInt());
        }
        
        int M = sc.nextInt();
        int[] result = new int[M];
        int[] A = new int[M];
        
        for(int i = 0; i < M; i++) {
        	A[i] = sc.nextInt();
        }
        
        for(int i = 0; i<M;i++) {
        	if(nums.contains(A[i]))
        		result[i] = 1;
        	else
        		result[i] = 0;
        	System.out.println(result[i]);
        }
        
        
        
    }
}
