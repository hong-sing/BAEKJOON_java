import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class No15552 {
    public static void main(String args[]) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        for(int i=0; i<t; i++) {
            String s = br.readLine();
            String[] arr_s = s.split(" ");
            int a = Integer.parseInt(arr_s[0]);
            int b = Integer.parseInt(arr_s[1]);
            int sum = a + b;
            bw.write(sum+"\n");
        }
        bw.flush();
        bw.close();
    }
}
