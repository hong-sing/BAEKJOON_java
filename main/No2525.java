import java.util.Scanner;

public class No2525 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        int time = sc.nextInt();

        int min = h * 60 + m;
        int cook = min + time;
        h = cook/60;
        m = cook%60;
        if(h>23) {
            h -= 24;
        }
        System.out.println(h + " " + m);
    }
}
