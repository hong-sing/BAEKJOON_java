import java.io.*;
import java.util.*;

//소트인사이드
public class No1427 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = br.readLine();
        String[] arr = input.split("");
        br.close();

        Arrays.sort(arr, Collections.reverseOrder());
        int len = arr.length;
        for(int i=0; i<len; i++) {
            bw.write(arr[i]);
        }
        bw.flush();
        bw.close();
    }
}
