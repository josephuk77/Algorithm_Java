class Solution {
    public String solution(String s) {
        String answer = "";
        char[] charArray = s.toCharArray();
        int i = 0; // i 값을 초기화

        // charArray는 이제 문자 하나씩을 갖는 배열입니다.
        for (char c : charArray) {
            if (c != ' ') {
                if (i % 2 == 0)
                    answer += Character.toUpperCase(c);
                else
                    answer += Character.toLowerCase(c);
                i++; // 문자가 공백이 아닐 때만 i를 증가
            } else {
                i = 0; // 문자가 공백일 때 i를 다시 0으로 설정
                answer += " ";
            }
        }

        return answer;
    }
}