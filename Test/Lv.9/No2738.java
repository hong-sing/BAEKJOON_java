import java.util.*;

//행렬 덧셈
public class No2738 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        int[][] a = new int[n*2][m];
        int[][] c = new int[n][m];

        for(int i=0, size=n*2; i<size; i++) {
            String input = sc.nextLine();
            String[] arr = input.split(" ");

            for(int j=0; j<m; j++) {
                a[i][j] = Integer.parseInt(arr[j]);
            }

        }

        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                c[i][j] = a[i][j] + a[i+n][j];
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }

    }
}