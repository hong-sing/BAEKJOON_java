import java.util.Scanner;

public class No1110 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int condition = n;
        int sum = 0;
        int count = 0;

        do {
            sum = n/10 + n%10;
            String new_num = Integer.toString(n%10) + sum%10;
            count += 1;
            n = Integer.parseInt(new_num);
        } while(n!=condition);
        System.out.println(count);
    }
}
