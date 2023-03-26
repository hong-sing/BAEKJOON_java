import java.util.Scanner;

// ACM 호텔 (수학, 구현, 사칙연산)
class No10250 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i=0; i<t; i++) {
            int h = sc.nextInt();
            int w = sc.nextInt();
            int n = sc.nextInt();

            int floor = 0;  // 층수
            int num = 0;    // 번호
            if (n%h!=0) {
                floor = n%h;
                num = (n/h)+1;
            } else {
                floor = h;
                num = n/h;
            }

            String result = "";
            if (num<10) {
                result = floor + "0" + num;
            } else {
                result = floor + "" + num;
            }
            System.out.println(result);
        }
    }
}