import java.io.BufferedReader;
import java.io.InputStreamReader;

// GCD 합    https://www.acmicpc.net/problem/9613
public class No9613 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            String[] input = br.readLine().split(" ");
            long sum = 0;
            for (int j = 1; j < input.length; j++) {
                for (int k = j+1; k < input.length; k++) {
                    sum += gcd(Integer.parseInt(input[j]), Integer.parseInt(input[k]));
                }
            }
            System.out.println(sum);
        }
    }

    static int gcd(int a, int b) {
        if (a % b == 0) {
            return b;
        }
        return gcd(b, a % b);
    }
}
