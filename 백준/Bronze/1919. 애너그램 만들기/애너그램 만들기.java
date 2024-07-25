import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String input2 = sc.nextLine();
        int count = 0;
        char[] arr = input2.toCharArray();

        for(char a : input.toCharArray()){
            for(int i = 0; i<arr.length; i++){
                if(a == arr[i]){
                    count++;
                    arr[i] = ' ';
                    break;
                }
            }
        }
        int result = input.length() + input2.length() - 2 * count;
        System.out.println(result);
    }
}