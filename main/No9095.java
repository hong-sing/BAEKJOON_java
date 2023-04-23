import java.io.BufferedReader;
import java.io.InputStreamReader;

// 1, 2, 3 더하기  https://www.acmicpc.net/problem/9095
public class No9095 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            int[] d = new int[11];
            d[1] = 1;
            d[2] = 2;
            d[3] = 4;
            for (int j = 4; j <= n ; j++) {
                d[j] = d[j - 1] + d[j - 2] + d[j - 3];
            }
            System.out.println(d[n]);
        }
    }
}
