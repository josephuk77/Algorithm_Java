import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 행의 개수
        int[][] arr = new int[n][20]; // 2D 배열 생성

        for (int k = 0; k < n; k++) {
            int rowNumber = sc.nextInt(); // 현재 행 번호
            for (int i = 0; i < 20; i++) {
                arr[rowNumber - 1][i] = sc.nextInt(); // 해당 행에 데이터 저장
            }
        }

        for (int k = 0; k < n; k++) {
            int count = 0;
            for(int i = 0; i < 20; i++) {
                for(int j = 0; j < i; j++) {
                    if (arr[k][i] < arr[k][j]) {
                        count++;
                    }
                }
            }
            System.out.println(k+1+" "+count);
        }


        sc.close(); // Scanner 자원 해제
    }
}