import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int[] count = new int[10001];
        for(int i = 0; i < n; i++) {
            count[Integer.parseInt(br.readLine())]++;
        }
        for(int i = 1; i <= 10000; i++) {
            for(int j = 0; j < count[i]; j++) {
                bw.write(i + "\n");
            }
        }
        bw.flush();
    }
}