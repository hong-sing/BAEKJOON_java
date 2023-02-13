import java.util.Scanner;

//수 정렬하기
public class No2750 {
    public static void main(String[] args) {
        //선택 정렬
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<n; i++) {
            int min_index = i;
            for(int j=i+1; j<n; j++) {
                if(arr[min_index]>arr[j]) {
                    min_index = j;
                }
            }
            int tmp = 0;
            tmp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = tmp;
        }

        for(int i=0; i<n; i++) {
            System.out.println(arr[i]);
        }
    }
}

//삽입 정렬
class InsertionSort {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 1; i < n; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j-1] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                } else {
                    break;
                }
            }
        }

        for(int i=0; i<n; i++) {
            System.out.println(arr[i]);
        }
    }
}
