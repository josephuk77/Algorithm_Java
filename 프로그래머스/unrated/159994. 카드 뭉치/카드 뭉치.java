class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "";
        int tmp1 = 0;
        int tmp2 = 0;
        for(int i = 0; i<goal.length; i++){
            if(tmp1<cards1.length && cards1[tmp1].equals(goal[i]))
                tmp1++;
            else if(tmp2<cards2.length && cards2[tmp2].equals(goal[i]))
                tmp2++;
            else
                return "No";
        }
        return "Yes";
    }
}