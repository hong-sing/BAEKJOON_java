import java.util.Scanner;

//손익분기점
public class No1712 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(c-b==0) {
            System.out.println(-1);
        } else {
            int x = a/(c-b) + 1;
            if(x<0) {
                System.out.println(-1);
            } else {
                System.out.println(x);
            }
        }
    }
}
