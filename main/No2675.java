import java.io.*;

public class No2675 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());

        for(int i=0; i<t; i++) {
            String input = br.readLine();
            String[] arr = input.split(" ");
            int r = Integer.parseInt(arr[0]);
            String s = arr[1];
            for(int j=0; j<s.length(); j++) {
                for(int k=0; k<r; k++) {
                    char p = s.charAt(j);
                    System.out.print(p);
                }
            }
            System.out.println();
        }
        br.close();
    }
}
