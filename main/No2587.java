import java.util.Arrays;
import java.util.Scanner;

//대표값2
public class No2587 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[5];

        for(int i=0; i<5; i++) {
            num[i] = sc.nextInt();
        }

        int sum = 0;
        for(int i=0; i<5; i++) {
            sum += num[i];
        }
        int avg = sum/5;
        System.out.println(avg);
        Arrays.sort(num);
        System.out.println(num[2]);
    }
}
