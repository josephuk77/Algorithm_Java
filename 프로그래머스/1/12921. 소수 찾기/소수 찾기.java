class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i = 2; i <= n; i++)
        {
            if(isPrime(i))
                answer++;
        }
        return answer;
    }
    
    // 소수인지 판별하는 메소드
    public static boolean isPrime(int number) {
        // 1은 소수가 아니므로 false 반환
        if (number <= 1) {
            return false;
        }
        // 2부터 number의 제곱근까지 나누어보기
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                // 나누어떨어지는 수가 있으면 소수가 아님
                return false;
            }
        }
        // 나누어떨어지는 수가 없으면 소수임
        return true;
    }
}

