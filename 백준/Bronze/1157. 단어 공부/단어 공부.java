import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] input = sc.nextLine().toLowerCase().toCharArray();
        int[] count = new int[26];
        int result = 0, tmp = 0;
        
        for(char c : input) {
        	count[c-'a']++;
        }

        for(int i = 0; i < count.length; i++) {
        	if(tmp < count[i]) {
        		result = i;
        		tmp = count[i];
        	}else if(tmp == count[i]) {
        		result = -1;
        	}
        }

        if(result == -1)
        	System.out.println("?");
        else
        	System.out.println((char)('A' + result));
        
    }
}