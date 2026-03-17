import java.util.*;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	int N = sc.nextInt();
    	int B = sc.nextInt();
    	
    	char[] result = new char[30];
    	Arrays.fill(result,' ');
    	int i = 0;
    	
    	while(N > 0) {
    		if(N % B== 0) {
    			result[i] = '0';
    			i++;
    			N /= B;
    		}else {
    			int tmp = N % B;
    			if(tmp > 9) {
    				result[i] = (char) ('A' + tmp - 10);
    			}else {
    				result[i] = (char) (tmp + '0');
    			}
    			i++;
    			N -= tmp;
    			N /= B;
    		}
    		
    	}
    	for(int j = 29; j >= 0; j--) {
			if(result[j] != ' ')
				System.out.print(result[j]);
    	}
       
    }
}