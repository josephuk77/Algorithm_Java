class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int res1=0;
        int res2=0;
        if(arr1.length>arr2.length)
            return 1;
        else if(arr1.length<arr2.length)
            return -1;
        else{
            for(int i =0;i<arr1.length;i++){
                res1+=arr1[i];
                res2+=arr2[i];
            }
            if(res1>res2)
                return 1;
            else if(res1<res2)
                return -1;
            else
                return 0;
        }
    }
}