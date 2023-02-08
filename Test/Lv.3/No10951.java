import java.io.*;

public class No10951 {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = "";

        while((input = br.readLine()) != null){
            String[] arr = input.split(" ");
            int a = Integer.parseInt(arr[0]);
            int b = Integer.parseInt(arr[1]);
            int sum = a + b;
            bw.write(sum + "\n");
        }
        bw.flush();
        bw.close();
    }
}
