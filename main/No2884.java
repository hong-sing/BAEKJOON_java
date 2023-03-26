import java.util.Scanner;

public class No2884 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();

        if(h==0) {
            h = 24;
        }
        int sec = h*60 + m;
        int alm = sec - 45;
        h = alm/60;
        m = alm%60;
        if(h==24) {
            h = 0;
        }
        System.out.println(h + " " + m);
    }
}
