import java.util.HashMap;
import java.util.Map;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> playerIndexMap = new HashMap<>();
        
        // 플레이어 배열을 순회하면서 인덱스를 매핑
        for (int i = 0; i < players.length; i++) {
            playerIndexMap.put(players[i], i);
        }
        
        // 호출된 플레이어를 순회하면서 위치를 바꾸기
        for (String calling : callings) {
            int currentIndex = playerIndexMap.get(calling);
            if (currentIndex > 0) {
                // 위치를 바꿀 수 있는 경우에만 바꾸기
                String temp = players[currentIndex];
                players[currentIndex] = players[currentIndex - 1];
                players[currentIndex - 1] = temp;
                playerIndexMap.put(players[currentIndex], currentIndex);
                playerIndexMap.put(players[currentIndex - 1], currentIndex - 1);
            }
        }
        
        return players;
    }
}
