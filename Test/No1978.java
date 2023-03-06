import java.util.*;

// 소수 찾기
class No1978 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cnt = 0;

        for (int i=0; i<n; i++) {
            int num = sc.nextInt();
            String divisor = "";
            for (int j=1; j<=num; j++) {
                if (num%j==0) {
                    divisor += j+",";
                }
            }
            String[] arr_divisor = divisor.split(",");
            if (arr_divisor.length==2) cnt++;
        }
        System.out.println(cnt);
    }
}