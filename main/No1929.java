import java.util.Scanner;

// 소수 구하기   https://www.acmicpc.net/problem/1929
public class No1929 {
    public static void main(String[] args) {
        int MAX = 1000001;
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();


        int[] arr = new int[MAX];

        for (int i = 2; i < MAX; i++) {
            arr[i] = i;
        }

        for (int i = 2; i < MAX; i++) {
            if (arr[i]==0) continue;

            for (int j = 2*i; j < MAX; j+=i) {
                arr[j]=0;
            }
        }

        for (int i = m; i <= n; i++) {
            if (arr[i] != 0) {
                System.out.println(arr[i]);
            }
        }
    }
}
