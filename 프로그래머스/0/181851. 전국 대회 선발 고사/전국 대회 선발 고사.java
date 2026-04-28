class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        int j = 1;

        for (int i = 0; i < 3; i++) {
            for (int index = 0; index < rank.length; index++) {
                if (rank[index] == j) {
                    if (attendance[index]) {
                        if (i == 0) {
                            answer += 10000 * index;
                        } else if (i == 1) {
                            answer += 100 * index;
                        } else {
                            answer += index;
                        }
                    } else {
                        i--;
                    }

                    j++;
                    break;
                }
            }
        }

        return answer;
    }
}