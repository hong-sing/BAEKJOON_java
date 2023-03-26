import java.util.Scanner;

// 소수
class No2581 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        String divisor = "";
        String prime = "";
        for (int i=m; i<=n; i++) {
            for (int j=1; j<=i; j++) {
                if (i%j==0) divisor += j+",";
            }
            String[] arr_divisor = divisor.split(",");
            if (arr_divisor.length==2) prime += i + ",";
            divisor = "";
        }

        if (prime!="") {
            String[] arr_prime = prime.split(",");

            int sum = 0;
            for (int i=0; i<arr_prime.length; i++) {
                sum += Integer.parseInt(arr_prime[i]);
            }
            System.out.println(sum);
            System.out.println(arr_prime[0]);
        } else {
            System.out.println("-1");
        }

    }
}