import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String input2 = sc.nextLine();
        int count = 0;

        for(int i = 0; i<input.length(); i++){
            if(input2.length() + i < input.length()+1) {
                if (input.substring(i, i + input2.length()).equals(input2)) {
                    count++;
                    i += input2.length()-1;
                }
            }
        }

        System.out.println(count);
    }
}