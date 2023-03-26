import java.util.Scanner;

//분수찾기
public class No1193 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 1;
        int y = 1;

        int mx = -1;
        int my = 1;

        for(int i=1; i<n; i++) {
            if(mx == -1 && my == 1) {
                x -= 1;
                y += 1;
                if(x<1 || y<1) {
                    x += 1;
                    mx = 1;
                    my = -1;
                }
            } else {
                x += 1;
                y -= 1;
                if(x<1 || y<1) {
                    y += 1;
                    mx = -1;
                    my = 1;
                }
            }

        }
        System.out.println(x+"/"+y);
    }
}
