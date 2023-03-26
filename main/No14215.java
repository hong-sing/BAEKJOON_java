import java.util.Arrays;
import java.util.Scanner;

// 세 막대     https://www.acmicpc.net/problem/14215
class No14215 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {sc.nextInt(), sc.nextInt(), sc.nextInt()};

        Arrays.sort(arr);

        if (!isMakeTriangle(arr)) {
            arr = reduceLength(arr);
        }

        System.out.println(arr[0]+arr[1]+arr[2]);

    }

    static boolean isMakeTriangle(int[] arr) {
        int a = arr[0];
        int b = arr[1];
        int c = arr[2];

        return a + b > c;
    }

    static int[] reduceLength(int[] arr) {
        int a = arr[0];
        int b = arr[1];
        int c = arr[2];
        while (a + b <= c) {
            c--;
        }
        arr[2] = c;
        return arr;
    }
}