import java.util.*;

public class Main {

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	String input = sc.nextLine();
    	char[] result = new char[input.length()];
    	
    	for(int i = 0; i < input.length(); i++) {
    		if(input.charAt(i) >91)
    			result[i] = (char) (input.charAt(i) - ('a' - 'A'));
    		else
    			result[i] = (char) (input.charAt(i) + ('a' - 'A'));
    	}
        System.out.print(result);
    }

}