import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cal = sc.nextInt();
        int row = sc.nextInt();
        sc.nextLine(); // 남아 있는 개행 제거

        int[] calX = new int[cal];
        int[] rowX = new int[row];
        char[][] arr = new char[cal][row];

        int calResult = cal;
        int rowResult = row;

        for (int i = 0; i < cal; i++) {
            arr[i] = sc.nextLine().toCharArray();
        }

        for (int i = 0; i < cal; i++) {
            for (int j = 0; j < row; j++) {
                if (arr[i][j] == 'X') {
                    calX[i] = 1;
                    rowX[j] = 1;
                }
            }
        }

        for (int i = 0; i < cal; i++) {
            if (calX[i] == 1) {
                calResult--;
            }
        }

        for (int i = 0; i < row; i++) {
            if (rowX[i] == 1) {
                rowResult--;
            }
        }

        System.out.println(Math.max(calResult, rowResult));
    }
}