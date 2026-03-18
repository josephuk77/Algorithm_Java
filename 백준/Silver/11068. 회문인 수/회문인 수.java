import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        int[] result = new int[T];

        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();

            for (int base = 2; base <= 64; base++) {
                int[] digit = new int[20];
                int num = N;   
                int k = 0;

                while (num > 0) {
                    digit[k] = num % base;
                    num /= base;
                    k++;
                }

                int isPalindrome = 1;
                for (int l = 0; l < k / 2; l++) {
                    if (digit[l] != digit[k - l - 1]) {
                        isPalindrome = 0;
                        break;
                    }
                }

                if (isPalindrome == 1) {
                    result[i] = 1;
                    break;
                }
            }
        }
        for (int i = 0; i < T; i++) {
            System.out.println(result[i]);
        }
    }
}