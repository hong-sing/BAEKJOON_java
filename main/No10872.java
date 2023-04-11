import java.util.Scanner;

// 팩토리얼 https://www.acmicpc.net/problem/10872
public class No10872 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(factorial(n));

    }
    static long factorial(int a) {
        if (a == 1 || a == 0) {
            return 1;
        }
        return a * factorial(a - 1);
    }
}
