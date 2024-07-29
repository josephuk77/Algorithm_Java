import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        int x = sc.nextInt();

        char[][] arr = new char[y][x];
        char[] xArr = new char[x];
        char[] yArr = new char[y];

        for(int i = 0; i < y; i++){
            String str = sc.next();
            for(int j = 0; j < x; j++){
                arr[i][j] = str.charAt(j);
            }
        }

        for(int i = 0; i < y; i++){
            for(int j = 0; j < x; j++){
                if(arr[i][j] == 'X'){
                    xArr[j] = 'X';
                    yArr[i] = 'X';
                }
            }
        }
        int xCount = 0;
        int yCount = 0;
        for(int i = 0; i < y; i++){
            if(yArr[i] != 'X'){
                yCount++;
            }
        }
        for(int i = 0; i < x; i++){
            if(xArr[i] != 'X'){
                xCount++;
            }
        }
        System.out.println(Math.max(xCount, yCount));
    }
}