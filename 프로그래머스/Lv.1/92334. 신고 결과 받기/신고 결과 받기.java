import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        Map<String, Set<String>> reporter = new HashMap<>();
        Map<String, Integer> count = new HashMap<>();

        for (String s : id_list) {
            reporter.put(s, new HashSet<>());
            count.put(s, 0);
        }

        for (String s : report) {
            String[] name = s.split(" ");
            if (reporter.get(name[0]).add(name[1])) {
                count.put(name[1], count.getOrDefault(name[1], 0) + 1);
            }
        }

        for (Map.Entry<String, Integer> entryCount : count.entrySet()) {
            if (entryCount.getValue() >= k) {
                for (Map.Entry<String, Set<String>> entryReporter : reporter.entrySet()) {
                    if (entryReporter.getValue().contains(entryCount.getKey())) {
                        for (int i = 0; i < id_list.length; i++) {
                            if (id_list[i].equals(entryReporter.getKey())) {
                                answer[i]++;
                            }
                        }
                    }
                }
            }
        }
        return answer;
    }
}
