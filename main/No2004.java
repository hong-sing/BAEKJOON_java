import java.util.Scanner;

// 조합 0의 개수 https://www.acmicpc.net/problem/2004
public class No2004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long m = sc.nextInt();
        long r = n - m;

        long fivePowerCnt = fivePower(n) - fivePower(m) - fivePower(r);
        long twoPowerCnt = twoPower(n) - twoPower(m) - twoPower(r);

        System.out.println(Math.min(fivePowerCnt, twoPowerCnt));

    }

    static int fivePower(long a) {
        int cnt = 0;
        while (a >= 5) {
            cnt += a/5;
            a /= 5;
        }
        return cnt;
    }

    static int twoPower(long a) {
        int cnt = 0;
        while (a >= 2) {
            cnt += a/2;
            a /= 2;
        }
        return cnt;
    }
}
