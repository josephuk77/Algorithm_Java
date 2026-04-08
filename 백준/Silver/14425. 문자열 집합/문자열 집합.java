import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        Set<String> S = new HashSet<>();
        int result = 0;
        
        for(int i = 0; i < N; i++) {
        	S.add(sc.next());
        }
        for(int i = 0; i < M; i++) {
        	if(S.contains(sc.next()))
        		result++;
        }
        System.out.print(result);
    }
}
