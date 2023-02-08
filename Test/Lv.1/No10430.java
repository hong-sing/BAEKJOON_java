import java.util.Scanner;

public class No10430 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int[] s = new int[3];
        for (int i=0; i<3; i++) {
            s[i] = scanner.nextInt();
        }
        int a = s[0];
        int b = s[1];
        int c = s[2];

        System.out.println((a+b)%c);
        System.out.println(((a%c) + (b%c)) % c);
        System.out.println((a*b)%c);
        System.out.println(((a%c) * (b%c))%c);
    }
}
