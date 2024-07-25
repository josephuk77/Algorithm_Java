import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String upper = input.toUpperCase();
        int[] arr = getAlphabetCount(upper);

        int index = findMaxIndex(arr);

        if(index == '?')
            System.out.print("?");
        else 
            System.out.print((char)(index+'A'));
    }

    private static int findMaxIndex(int[] arr) {
        int max = 0;
        int index = 0;
        int same = -1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
                index = i;
            }
        }
        for (int j : arr) {
            if (j == max) {
                same++;
            }
        }
        if(same == 0)
            return index;
        else
            return '?';
    }

    public static int[] getAlphabetCount(String str){
        int[] arr = new int[26];
        for(char a : str.toCharArray()){
            arr[a - 'A']++;
        }
        return arr;
    }
}