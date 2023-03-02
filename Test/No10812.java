import java.util.*;

// 바구니 순서 바꾸기
public class No10812 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];

        for (int i=0; i<n; i++) {
            arr[i] = i+1;
        }

        for (int i=0; i<m; i++) {
            int begin = sc.nextInt();
            int end = sc.nextInt();
            int mid = sc.nextInt();
            rotate(arr, begin,end, mid);
        }

        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    static int[] rotate(int[] arr, int begin, int end, int mid) {
        int mid_idx = mid - 1;
        int begin_idx = begin - 1;
        int end_idx = end - 1;

        for (int i=end_idx; mid_idx<=i; i--) {
            for (int j=end_idx; begin_idx<j; j--) {
                int tmp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = tmp;
            }
        }
        return arr;
    }
}
