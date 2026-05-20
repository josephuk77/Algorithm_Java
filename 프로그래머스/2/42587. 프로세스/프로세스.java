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
        Queue<Document> queue = new LinkedList<>();

        for (int i = 0; i < priorities.length; i++) {
            queue.offer(new Document(priorities[i], i == location));
        }

        int outCount = 0;

        while (!queue.isEmpty()) {
            Document document = queue.poll();

            boolean hasHigherPriority = false;

            for (Document d : queue) {
                if (d.getPriority() > document.getPriority()) {
                    hasHigherPriority = true;
                    break;
                }
            }

            if (hasHigherPriority) {
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