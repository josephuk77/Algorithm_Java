class Solution {
    public int solution(String[] spell, String[] dic) {
        int count = 0;
        for(int i = 0; i<dic.length;i++){
            for(int j = 0; j<spell.length;j++){
                dic[i] = dic[i].replaceFirst(spell[j],"");
                if(dic[i].equals("") && j!=spell.length-1)
                    dic[i] = "1";
            }         
            if(dic[i].equals(""))
                count++;
        }
        if(count == 1)
            return 1;
        
        return 2;
    }
}