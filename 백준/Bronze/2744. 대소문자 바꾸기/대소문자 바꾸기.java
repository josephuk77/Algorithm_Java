import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        StringBuilder result = new StringBuilder();

        for(char a : input.toCharArray()){
            if(a>91){
                result.append((char) (a - 32));
            }else{
                result.append((char) (a + 32));
            }
        }

        System.out.println(result);
    }
}