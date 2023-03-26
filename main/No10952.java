import java.io.*;

public class No10952 {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true) {
            String input = br.readLine();
            String[] arr = input.split(" ");
            int a = Integer.parseInt(arr[0]);
            int b = Integer.parseInt(arr[1]);
            int sum = a + b;
            if(sum!=0) {
                bw.write(sum + "\n");
            } else {
                break;
            }
        }
        bw.flush();
        bw.close();
    }
}
