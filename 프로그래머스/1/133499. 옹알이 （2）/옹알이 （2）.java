class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        for(int i = 0; i<babbling.length;i++){
            if(babbling[i].contains("yeye")||babbling[i].contains("ayaaya")||babbling[i].contains("woowoo")||babbling[i].contains("mama"))
                continue;
            while(babbling[i].contains("ye")||babbling[i].contains("aya")||babbling[i].contains("woo")||babbling[i].contains("ma")){
                babbling[i] = babbling[i].replaceFirst("ye", " ");
                babbling[i] = babbling[i].replaceFirst("aya", " ");
                babbling[i] = babbling[i].replaceFirst("woo", " ");
                babbling[i] = babbling[i].replaceFirst("ma", " ");
            }
            babbling[i] = babbling[i].replaceAll("\\s", "");
            if(babbling[i].equals(""))
                answer++;
            
        }
        
        return answer;
    }
}