class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        int tmp= 0;
        while(n/a!=0){
            tmp = n%a;
            answer = answer+ (n/a) *b;
            n = b* (n/a)+tmp;
            tmp = 0;
        }
        return answer;
    }
}