import java.util.Scanner;

class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // 테스트 케이스의 수

        for (int test_case = 1; test_case <= T; test_case++) {
            int day = sc.nextInt(); // 전체 일수
            int[] price = new int[day]; // 각 날짜별 주가
            
            // 주가 입력 받기
            for (int i = 0; i < day; i++) {
                price[i] = sc.nextInt();
            }
            
            long total = 0; // 총 이익
            int max_price = 0; // 현재까지의 최대 주가
            
            // 뒤에서부터 순회하면서 최대 주가 업데이트 및 이익 계산
            for (int i = day - 1; i >= 0; i--) {
                if (price[i] > max_price) {
                    max_price = price[i]; // 최대 주가 업데이트
                } else {
                    total += (max_price - price[i]); // 이익 누적
                }
            }
            
            // 결과 출력
            System.out.println("#" + test_case + " " + total);
        }
    }
}
