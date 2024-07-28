import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        int startX = Integer.parseInt(st.nextToken());
        int startY = Integer.parseInt(st.nextToken());

        int time = Integer.parseInt(br.readLine());

        if((startX + time) / x % 2 ==1)
            System.out.print(x - (startX+time)%x);
        else
            System.out.print((startX+time)%x);
        if ((startY + time) / y % 2 ==1)
            System.out.print(" "+ (y - (startY+time)%y));
        else
            System.out.print(" "+((startY+time)%y));
    }
}