import java.io.*;
import java.util.Arrays;


public class No10818 {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        String[] arr = s.split(" ");
        int[] num = new int[n];

        for(int i=0; i<n; i++) {
            num[i] = Integer.parseInt(arr[i]);
        }
        Arrays.sort(num);
        bw.write(num[0] + " " + num[n-1]);
        bw.flush();
        bw.close();
    }
}
