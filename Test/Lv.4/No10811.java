import java.util.*;

// 바구니 뒤집기
class No10811{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];

        for (int i=0; i<n; i++) {
            arr[i] = i+1;
        }

        for (int a=0; a<m; a++) {
            int i = sc.nextInt()-1;
            int j = sc.nextInt()-1;
            swap(arr, i, j);
        }

        for(int a=0; a<n; a++) {
            System.out.print(arr[a] + " ");
        }
    }

    public static int[] swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;

        i++;
        j--;

        if (i<j) {
            swap(arr, i, j);
        }
        return arr;
    }
}
