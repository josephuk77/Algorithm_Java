import java.util.*;

class Solution {
    public long solution(long n) {
        String numberStr = Long.toString(n);
         // 문자열을 문자 배열로 변환
        Character[] chars = new Character[numberStr.length()];
        for (int i = 0; i < numberStr.length(); i++) {
            chars[i] = numberStr.charAt(i);
        }

        // 배열을 정렬
        Arrays.sort(chars, Collections.reverseOrder());

        // 배열을 문자열로 결합
        StringBuilder sortedNumberStr = new StringBuilder(chars.length);
        for (Character c : chars) {
            sortedNumberStr.append(c);
        }

        // 결과 출력
        return Long.parseLong(sortedNumberStr.toString());
    }
}