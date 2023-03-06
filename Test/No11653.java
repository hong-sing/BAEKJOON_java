import java.util.*;

// 소인수분해
class No11653 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n==1) {
            System.out.println();
        }

        int i = 2;
        do {

            if (n%i==0) {
                System.out.println(i);
                n /= i;
            } else {
                i++;
            }

        } while (n!=1);
    }
}