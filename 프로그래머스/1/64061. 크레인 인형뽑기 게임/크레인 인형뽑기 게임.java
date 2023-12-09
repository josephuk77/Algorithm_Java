import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Integer tmp = 0;
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0; i<moves.length;i++){
            for(int j = 0; j<board.length;j++){
                if(board[j][moves[i]-1] != 0){
                    if(tmp == board[j][moves[i]-1]){
                        answer+=2;
                        list.remove(list.size()-1);
                        if(list.size()-1>=0)
                            tmp = list.get(list.size()-1);
                    }else{
                        list.add(board[j][moves[i]-1]);
                        tmp = board[j][moves[i]-1];
                    }
                    
                    board[j][moves[i]-1] = 0;
                    break;
                }
            }
        }
        
        return answer;
    }
}