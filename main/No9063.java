import java.util.Arrays;
import java.util.Scanner;

// 대지  https://www.acmicpc.net/problem/9063
class No9063 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] x = new int[n];
        int[] y = new int[n];

        for (int i=0; i<n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        // 이렇게 했을 때 936ms / 각 메서드에 Arrays.sort 넣었을 때 944ms
//        Arrays.sort(x);
//        Arrays.sort(y);

        if (n<2) {
            System.out.println(0);
        }

        if (n>=2) {
            int area = (maxX(x) - minX(x)) * (maxY(y) - minY(y));
            System.out.println(area);
        }
    }

    static int maxX(int[] x) {
        Arrays.sort(x);
        int max = x[x.length-1];
        return max;
    }

    static int minX(int[] x) {
        Arrays.sort(x);
        int min = x[0];
        return min;
    }

    static int maxY(int[] y) {
        Arrays.sort(y);
        int max = y[y.length-1];
        return max;
    }

    static int minY(int[] y) {
        Arrays.sort(y);
        int min = y[0];
        return min;
    }
}