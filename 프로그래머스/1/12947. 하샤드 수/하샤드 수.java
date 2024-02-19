class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int count = 0;
        String str = Integer.toString(x);
        for(int i = 0;i<str.length();i++){
            count = count + str.charAt(i)-'0';
        }
        if(x%count !=0)
            return false;
        return answer;
    }
}