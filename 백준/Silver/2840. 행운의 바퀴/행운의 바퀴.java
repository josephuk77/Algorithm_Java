import java.util.*;

class Main
{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        char[] tire = new char[N];
        Arrays.fill(tire,'?');
        int count = 0;
        
        for(int i = 0; i < K; i++) {
        	int roll = sc.nextInt();
        	String input = sc.next();
        	count += roll;
        	
        	if(tire.length <= count)
        		count %= tire.length;
        	if(tire[count] == '?' || tire[count] == input.charAt(0)) {
        		tire[count] = input.charAt(0);
        	}else {
        		tire[0] = '!';
        		break;
        	}
        	int dupl = 0;
        	for(char t : tire) {
        		if(t == input.charAt(0)) {
        			dupl++;
        		}
        		if(dupl > 1) {
        			tire[0] = '!';
            		break;
        		}
        	}
        }
        if(tire[0] == '!' )
        	System.out.print("!");
        else {
        	for(int i = count; i >=0; i--) {
        		System.out.print(tire[i]);
        	}for(int i = tire.length-1; i>count; i--) {
        		System.out.print(tire[i]);
        	}
        }
        	
    }
}