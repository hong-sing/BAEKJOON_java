import java.util.Scanner;

// 삼각형 외우기  https://www.acmicpc.net/problem/10101
class No10101 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (isEquilateral(a,b,c)) {
            System.out.println("Equilateral");
        } else if (!is180(a,b,c)) {
            System.out.println("Error");
        } else if (isIsosceles(a,b,c)) {
            System.out.println("Isosceles");
        } else if (isScalene(a,b,c)) {
            System.out.println("Scalene");
        }

    }

    static boolean isEquilateral(int a, int b, int c) {
        return a==60 && b==60 && c==60;
    }

    static boolean isIsosceles(int a, int b, int c) {
        return a==b || b==c || a==c;
    }

    static boolean isScalene(int a, int b, int c) {
        return a!=b && b!=c && a!=c;
    }

    static boolean is180(int a, int b, int c) {
        return a+b+c==180;
    }
}