import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Document {
    private final int priority;
    private final boolean isMine;

    public Document(int priority, boolean isMine) {
        this.priority = priority;
        this.isMine = isMine;
    }

    public int getPriority() {
        return priority;
    }

    public boolean isMine() {
        return isMine;
    }
}

class Solution {
    public int solution(int[] priorities, int location) {
        Queue<Document> queue = IntStream.range(0, priorities.length)
                .mapToObj(i -> new Document(priorities[i], i == location))
                .collect(Collectors.toCollection(LinkedList::new));

        int outCount = 0;

        while (!queue.isEmpty()) {
            Document document = queue.poll();

            if (queue.stream().anyMatch(d -> d.getPriority() > document.getPriority())) {
                queue.offer(document);
            } else {
                outCount++;
                if (document.isMine()) {
                    break;
                }
            }
        }

        return outCount;
    }
}