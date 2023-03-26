import java.util.*;

// 삼각형과 세 변  https://www.acmicpc.net/problem/5073
class No5073 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if (isExit(a,b,c)) break;

            if (isInvalid(a,b,c)) {
                System.out.println("Invalid");
            } else if (isEquilateral(a,b,c)) {
                System.out.println("Equilateral");
            } else if (isIsosceles(a,b,c)) {
                System.out.println("Isosceles");
            } else if (isScalene(a,b,c)) {
                System.out.println("Scalene");
            }

        }
    }

    static boolean isInvalid(int a, int b, int c) {
        int[] arr = {a,b,c};
        Arrays.sort(arr);
        return arr[2] >= arr[0] + arr[1];
    }

    static boolean isEquilateral(int a, int b, int c) {
        return a==b && b==c && c==a;
    }

    static boolean isIsosceles(int a, int b, int c) {
        return a==b || b==c || c==a;
    }

    static boolean isScalene(int a, int b, int c) {
        return a!=b && b!=c && a!=c;
    }

    static boolean isExit(int a, int b, int c) {
        return a==0 && b==0 && c==0;
    }
}