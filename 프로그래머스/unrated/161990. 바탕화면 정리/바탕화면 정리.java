class Solution {
    public int[] solution(String[] wallpaper) {
       
        int x1 = 100;
        int y1 = 100;
        int x2 = 0;
        int y2 = 0;
        
        for(int i = 0; i < wallpaper.length; i++){
            for(int j = 0; j < wallpaper[i].length(); j++){
                if(wallpaper[i].charAt(j) == '#'){
                    if(x1>i)
                        x1 = i;
                    if(y1>j)
                        y1 = j;
                    if(x2<i+1)
                        x2 = i+1;
                    if(y2<j+1)
                        y2 = j+1;
                }
            }
        }
        int[] answer = {x1,y1,x2,y2};
        return answer;
    }
}