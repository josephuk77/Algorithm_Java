class Solution {
    public int[][] solution(int[][] arr) {
        int leng = 0;
        if(arr.length < arr[0].length)
            leng = arr[0].length;
        else
            leng = arr.length;
        
        int[][] answer = new int[leng][leng];
        
        for(int i = 0; i < leng; i++){
            for(int j = 0; j < leng; j++) {
                if(i < arr.length && j < arr[i].length){
                    answer[i][j] = arr[i][j];
                }
            }
        }
        return answer;
    }
}