import java.io.*;

public class No8958 {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        String input = "";
        int score = 0;
        int sum = 0;

        for(int i=0; i<n; i++) {
            input = br.readLine();
            for(int j=0; j<input.length(); j++) {
                if(input.charAt(j) == 'O') {
                    if(score==0) {
                        score = 1;
                        sum += score;
                    } else {
                        score += 1;
                        sum += score;
                    }
                } else {
                    score = 0;
                }
            }
            bw.write(sum+"\n");
            score = 0;
            sum = 0;
        }
        bw.flush();
        bw.close();
    }
}
