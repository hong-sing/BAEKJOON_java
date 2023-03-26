import java.util.*;

public class No2908 {
    public static int swap(int num) {
        int a = num/100;
        int b = (num/10)%10;
        int c = num%10;
        int tmp = 0;

        tmp = a;
        a = c;
        c = tmp;

        int new_num = a*100 + b*10 + c;

        return new_num;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int result = (swap(a) > swap(b)) ? swap(a) : swap(b);
        System.out.println(result);
    }
}