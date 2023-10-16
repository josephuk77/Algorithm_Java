class Solution {
    public int solution(int[] num_list) {
        int odd = 0;
        int even = 0;
        for(int i=0; i<num_list.length; i= i+2){
            even = even+num_list[i];
        }
        for(int i=1; i<num_list.length; i= i+2){
            odd = odd+num_list[i];
        }
        if(odd>even)
            return odd;
        else
            return even;
    }
}