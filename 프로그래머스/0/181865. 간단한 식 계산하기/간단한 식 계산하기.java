class Solution {
    public int solution(String binomial) {
        int answer = 0;
        String[] input = binomial.split(" ");
        if(input[1].equals("+"))
            answer = Integer.parseInt(input[0]) + Integer.parseInt(input[2]);
        else if(input[1].equals("-"))
            answer = Integer.parseInt(input[0]) - Integer.parseInt(input[2]);
        else
            answer = Integer.parseInt(input[0]) * Integer.parseInt(input[2]);
        return answer;
    }
}