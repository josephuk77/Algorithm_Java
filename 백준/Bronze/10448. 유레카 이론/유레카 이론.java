import java.io.*;

public class Main{
    static int[] gauss;
    static boolean[] check;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        gauss = new int[45];
        check = new boolean[1001];
        for(int i=1;i<45;i++)
            gauss[i] = i*(i+1)/2;
        for(int i=1;i<1001;i++)
            search(0, i, i);
        int T = Integer.parseInt(br.readLine());
        for(int i=0;i<T;i++){
            int K = Integer.parseInt(br.readLine());
            if(check[K])
                bw.write("1\n");
            else		
                bw.write("0\n");
        }
        bw.flush();		
        bw.close();
        br.close();
    }

    static void search(int count, int cur, int index){
        if(count == 3){		
            if(cur == 0)	
                check[index] = true;
            return;
        }
        if(cur <= 0)
            return;
        for(int i=1;i<45;i++){
            if(cur < gauss[i])
                break;
            search(count+1, cur - gauss[i], index);
        }
    }
}