import java.util.Scanner;

// 부녀회장이 될테야
class No2775 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i=0; i<t; i++) {
            int k = sc.nextInt();
            int n = sc.nextInt();

            int[][] arr = new int[k+1][n];

            for(int j=0; j<=k; j++) {
                int sum = 0;
                for(int a=0; a<n; a++) {
                    if (j==0) {
                        arr[j][a] = a+1;
                    } else {
                        sum += arr[j-1][a];
                        arr[j][a] = sum;
                    }

                }
            }
            System.out.println(arr[k][n-1]);
        }
    }
}