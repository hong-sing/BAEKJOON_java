import java.io.BufferedReader;
import java.io.InputStreamReader;

public class No1152 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        if(input.isBlank()) {
            System.out.println(0);
        } else {
            input = input.trim();
            String[] arr = input.split(" ");
            System.out.println(arr.length);
        }
    }
}
