import java.util.Scanner;

// 최대공약수와 최소공배수 https://www.acmicpc.net/problem/2609
public class No2609 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b =sc.nextInt();

        int gcd = gcd(a, b);
        System.out.println(gcd);
        System.out.println(a*b/gcd);
    }

    static int gcd(int a, int b) {
        if (a % b == 0) {
            return b;
        }
        return gcd(b, a % b);
    }

}
