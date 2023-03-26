import java.util.Scanner;

// 팰린드롬인지 확인하기 (구현, 문자열)
public class No10988 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] arr = input.split("");
        String[] after_swap = swap(arr,0,arr.length-1);
        String result = "";

        for (int i=0; i< arr.length; i++) {
            result += after_swap[i];
        }

        if (input.equals(result)) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }

    static String[] swap(String[] arr, int i, int j) {
        String tmp = arr[i];
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
