import java.util.Scanner;

// 최소공배수    https://www.acmicpc.net/problem/1934
public class No1934 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            System.out.println(A*B/gcd(A,B));
        }
    }

    static int gcd(int a, int b) {
        if (a % b == 0) {
            return b;
        }
        return gcd(b, a % b);
    }
}
