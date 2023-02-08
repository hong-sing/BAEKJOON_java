import java.io.*;

public class No11022 {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        for(int i=1; i<=t; i++) {
            String s = br.readLine();
            String[] arr_s = s.split(" ");
            int a = Integer.parseInt(arr_s[0]);
            int b = Integer.parseInt(arr_s[1]);
            int sum = a + b;
            bw.write("Case #" + i + ": " + a + " + " + b + " = " + sum + "\n");
        }
        bw.flush();
        bw.close();
    }
}
