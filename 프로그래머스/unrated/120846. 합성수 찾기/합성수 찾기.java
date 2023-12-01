import java.util.*;

class Solution {
    public int solution(int n) {
        return n-countPrimes(n)-1;
    }
    
    public static int countPrimes(int N) {
        boolean[] isPrime = new boolean[N + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;
        int primeCount = 0;

        for (int i = 2; i * i <= N; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= N; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        // 소수의 개수 세기
        for (boolean prime : isPrime) {
            if (prime) {
                primeCount++;
            }
        }

        return primeCount;
    }
}