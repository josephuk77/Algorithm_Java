class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int att = 0;
        int hp = health;
        int count =0;
        for(int i = 0; i<=attacks[attacks.length-1][0];i++){
            if(hp<health&&att>0)
                hp+=bandage[1];
            if(hp<health&& att == bandage[0]){
                hp+=bandage[2];
                att = 0;
            }
            if(hp>health)
                hp=health;
            if(attacks[count][0] == i){
                hp -= attacks[count][1];
                count++;
                att = 0;
            }else
                att++;
            if(hp<=0)
                return -1;
        }
        return hp;
    }
}