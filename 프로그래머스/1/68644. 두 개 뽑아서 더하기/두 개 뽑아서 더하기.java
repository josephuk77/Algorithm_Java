import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0;i<numbers.length-1;i++){
            for(int j = i + 1; j<numbers.length;j++){
                int tmp = numbers[i]+numbers[j];
                if(!list.contains(tmp)){
                    list.add(tmp);
                }
            }
        }
        
        Collections.sort(list); // list를 오름차순으로 정렬
        
        int[] answer = new int[list.size()]; // list의 크기로 새 배열 초기화
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i); // list의 원소를 answer 배열에 복사
        }
        
        return answer;
    }
}