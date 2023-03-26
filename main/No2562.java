import java.io.*;

public class No2562 {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] n = new int[9];

        for(int i=0; i<9; i++) {
            n[i] = Integer.parseInt(br.readLine());
        }

        int max = n[0];
        int idx = 1;
        for(int i=0; i<8; i++) {
            if(max<n[i+1]) {
                max = n[i+1];
                idx = i+2;
            }
        }
        bw.write(max + "\n" + idx);
        bw.flush();
        bw.close();
    }
}
