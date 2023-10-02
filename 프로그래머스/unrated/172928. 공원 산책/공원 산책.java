class Solution {
    public int[] solution(String[] park, String[] routes) {
        int x=0;
        int y=0;
        
        for(int i = 0; i<park.length; i++){
            for(int j = 0; j<park[i].length(); j++){
                if(park[i].charAt(j)=='S'){
                    x=j;
                    y=i;
                }
            }
        }
        
        for(int k=0; k<routes.length; k++){
            char w = routes[k].charAt(0);
            int c = Character.getNumericValue(routes[k].charAt(2));
            
            if(w == 'E' && x+c<park[0].length()){
                int tmp = x;
                for(int i=0; i<c;i++){
                    if(park[y].charAt(1+x)!='X'){
                        x += 1;
                    }else{
                        x=tmp;
                        break;
                    }
                }
            }else if(w=='S'&& y+c<park.length){
                int tmp =y;
                for(int i=1; i<=c;i++){
                    if(park[y+1].charAt(x)!='X'){
                        y += 1;
                    }else{
                        y=tmp;
                        break;
                    }
                }
            }else if(w=='W' && x-c>=0){
                int tmp = x;
                for(int i=1; i<=c;i++){
                    if(park[y].charAt(x-1)!='X'){
                        x -= 1;
                    }else{
                        x=tmp;
                        break;
                    }
                }
            }else if(w=='N' && y-c>=0){
                int tmp = y;
                for(int i=1; i<=c;i++){
                    if(park[y-1].charAt(x)!='X'){
                        y -= 1;
                    }else{
                        y=tmp;
                        break;
                    }
                }
            }
            
        }
        int[] answer = {y,x};
        return answer;
    }

}