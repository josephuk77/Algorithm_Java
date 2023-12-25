class Solution {
    public long solution(long n) {
        long answer;
        double resultDouble = Math.pow(n, 0.5);

        // 소수 부분이 있는지 확인
        boolean isInteger = resultDouble == Math.floor(resultDouble) && !Double.isInfinite(resultDouble);

        if(isInteger){
            answer = (long)Math.pow(resultDouble + 1, 2);
        } else {
            answer = -1;
        }
        return answer;
    }
}