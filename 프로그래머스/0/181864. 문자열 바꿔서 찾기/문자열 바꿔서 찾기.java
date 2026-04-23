class Solution {
    public int solution(String myString, String pat) {
        String s = "";
        for(int i = 0; i < pat.length();i++){
            if(pat.charAt(i) == 'A')
                s+=(char)(pat.charAt(i) + 1);
            else
                s+=(char)(pat.charAt(i) - 1);
        }
        if(myString.contains(s))
            return 1;
        else
            return 0;
    }
}