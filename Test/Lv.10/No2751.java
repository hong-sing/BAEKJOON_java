import java.io.*;
import java.util.*;

//수 정렬하기2
public class No2751 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        int[] num = new int[n];
        for(int i=0; i<n; i++) {
            num[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(num);

        for(int i=0; i<n; i++) {
            bw.write(num[i]+"\n");
        }
        bw.flush();
        bw.close();
    }
}
