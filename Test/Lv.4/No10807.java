import java.util.Scanner;

public class No10807 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];

        for(int i=0; i<n; i++) {
            num[i] = sc.nextInt();
        }
        int v = sc.nextInt();

        int count = 0;
        for(int i=0; i<n; i++) {
            if(v==num[i]) {
                count += 1;
            }
        }
        System.out.println(count);
    }
}
