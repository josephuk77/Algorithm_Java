import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        
        String ans = "";
        
        for(int i = 0; i < T; i++) {
        	int H = sc.nextInt();
            int W = sc.nextInt();
            int N = sc.nextInt();
            
            int hight = N%H == 0?H:N%H;
            
            int width = N%H == 0?N/H:N/H+1;
            ans += hight;
            if(width<10)
            	ans += ("0"+width);
            else
            	ans += width;
            ans+="\n";
        }
        System.out.println(ans);
    }
}