import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 카드 구매하기 2    https://www.acmicpc.net/problem/16194
public class No16194 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] p = new int[n+1];
        int[] d = new int[n+1];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            p[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.fill(d, 10001);
        d[0] = 0;
        d[1] = p[1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                d[i] = Math.min(d[i], d[i - j] + p[j]);
            }
        }
        System.out.println(d[n]);
    }

}
