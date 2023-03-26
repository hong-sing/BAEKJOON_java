import java.io.*;

public class No5597 {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] arr = new int[28];
        int cnt = 1;

        for(int i=0; i<28; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        for(int i=1; i<=30; i++) {
            for(int j=0; j<28; j++) {
                if(i==arr[j]) {
                    cnt = 1;
                    break;
                } else {
                    cnt += 1;
                }

                if(cnt==28) {
                    if(i!=arr[27]) {
                        bw.write(i+"\n");
                    }
                    cnt = 1;
                }
            }
        }
        bw.flush();
        bw.close();
    }
}
