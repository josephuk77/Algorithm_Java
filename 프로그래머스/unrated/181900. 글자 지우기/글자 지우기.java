class Solution {
    public String solution(String my_string, int[] indices) {
        String tmp = " ";
        for(int i=0; i<indices.length;i++){
            if(indices[i]==0){
                my_string = " "+my_string.substring(1);
            }else if(my_string.length() == indices[i]+1){
                my_string = my_string.substring(0,my_string.length()-1)+" ";
            }
            else{
                tmp = my_string.substring(indices[i]+1);
                my_string = my_string.substring(0,indices[i]) +" "+ tmp;
            }
            
        }
        
        return my_string.replace(" ", "");
    }
}