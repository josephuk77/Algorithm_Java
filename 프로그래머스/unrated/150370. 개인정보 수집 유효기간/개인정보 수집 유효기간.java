import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        List<Integer> list = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        
        int ty = Integer.parseInt(today.substring(0,4));
        int tm = Integer.parseInt(today.substring(5,7));
        int td = Integer.parseInt(today.substring(8,10));
        
        for(int i = 0; i<terms.length; i++){
            map.put(terms[i].substring(0,1),Integer.parseInt(terms[i].substring(2)));
        }
        for(int j = 0; j<privacies.length;j++){
            int y = Integer.parseInt(privacies[j].substring(0,4));
            int m = Integer.parseInt(privacies[j].substring(5,7));
            int d = Integer.parseInt(privacies[j].substring(8,10));
            char p = privacies[j].charAt(11);
            
            Integer pm = map.get(String.valueOf(p));
            System.out.print(pm+"  ");
           if (pm != null) {
                m += pm;
                if (m > 12 && m%12 !=0) {
                    y = y + m / 12;
                    m = m % 12;
                }else if(m>12 && m%12==0){
                    y = y + (m / 12-1);
                    m = 12;
                }
                if (ty > y) {
                    list.add(j +1);
                } else if (ty == y && tm > m) {
                    list.add(j +1);
                } else if (ty == y && tm == m && td >= d) {
                    list.add(j +1);
                }
            }

        }
        int[] answer = list.stream().mapToInt(i->i).toArray();
        
        return answer;
    }
}