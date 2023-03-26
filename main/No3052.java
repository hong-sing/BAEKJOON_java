import java.io.*;
import java.util.HashSet;

public class No3052 {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] n = new int[10];
        HashSet<Integer> set = new HashSet<>();

        for(int i=0; i<10; i++) {
            n[i] = Integer.parseInt(br.readLine());
            set.add(n[i]%42);
        }
        bw.write(String.valueOf(set.size()));
        bw.flush();
        bw.close();
    }
}
