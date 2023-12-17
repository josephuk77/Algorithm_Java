class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        for(int i = left; i<=right;i++){
            if(countDivisors(i)%2==0)
                answer+=i;
            else
                answer-=i;
        }
        return answer;
    }
    
    public static int countDivisors(int n) {
        int count = 0;
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                count++; // i는 약수입니다.
                if (i != n / i) {
                    count++; // n / i도 약수입니다 (단, i의 제곱이 n이 아닐 때만).
                }
            }
        }
        return count;
    }
}