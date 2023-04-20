import java.util.Scanner;
// 1로 만들기   https://www.acmicpc.net/problem/1463
public class No1463 {

    static int[] d = new int[1000001];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 2; i <= n; i++) {
            // 1을 뺀다
            d[i] = d[i-1] + 1;

            // 2로 나누어 떨어지면, 2로 나눈다.
            if (i % 2 == 0) {
                d[i] = Math.min(d[i], d[i / 2] + 1);
            }
            //3으로 나누어 떨어지면, 3으로 나눈다.
            if (i % 3 == 0) {
                d[i] = Math.min(d[i], d[i / 3] + 1);
            }
        }
        System.out.println(d[n]);
    }
}
