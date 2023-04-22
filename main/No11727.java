import java.util.Scanner;

// 2×n 타일링 2    https://www.acmicpc.net/problem/11727
public class No11727 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] d = new int[1001];
        d[1] = 1;
        d[2] = 3;

        for (int i = 3; i <= n; i++) {
            d[i] = (d[i - 1] + d[i - 2] * 2) % 10007;
        }
        System.out.println(d[n]);
    }
}
