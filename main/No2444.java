import java.util.Scanner;

public class No2444 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 2*n-1;

        for (int i=1; i<=row; i++) {
            // 별 갯수 늘어나는 구간
            if (i<=n) {
                // 왼쪽 부분 별 (정가운데 기준. 정가운데 포함)
                for (int j=n; 0<j; j--) {
                    if (j<=i) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                // 오른쪽 부분 별
                if (i>1) {
                    for (int j=1; j<i; j++) {
                        System.out.print("*");
                    }
                }
            } else { //별 갯수 줄어드는 구간
                // 왼쪽 부분
                for (int j=n+1; j<=2*n; j++) {
                    if (i<j) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                // 오른쪽 부분
                for (int j=2*n-1; i<j; j--) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
