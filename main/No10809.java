import java.io.*;

public class No10809 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        for(int i='a'; i<='z'; i++) {
            System.out.print(s.indexOf((char)i));
            System.out.print(" ");
        }
    }
}
