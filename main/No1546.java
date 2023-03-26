import java.io.*;
import java.util.Arrays;

public class No1546 {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        double[] score = new double[n];
        String input = br.readLine();
        String[] arr = input.split(" ");

        for(int i=0; i<n; i++) {
            score[i] = Integer.parseInt(arr[i]);
        }
        Arrays.sort(score);

        double[] new_score = new double[n];
        double sum = 0;
        for(int i=0; i<n; i++) {
            new_score[i] = score[i]/score[n-1]*100;
            sum += new_score[i];
        }
        double avg = sum/n;
        bw.write(Double.toString(avg));
        bw.flush();
        bw.close();
    }
}
