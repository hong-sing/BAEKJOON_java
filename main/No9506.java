import java.util.Scanner;

// 약수들의 합
class No9506 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int n = sc.nextInt();

            if (n==-1) break;

            String divisor = "";
            for (int i=1, j=0; i<=n; i++) {
                if (n%i==0) {
                    divisor += i+",";
                }
            }

            String[] arr_divisor = divisor.split(",");
            int size = arr_divisor.length;
            int sum = 0;
            for (int i=0; i<size-1; i++) {
                sum += Integer.parseInt(arr_divisor[i]);
            }//for

            if (n==sum) {
                String result = n + " = ";
                for (int i=0; i<size-1; i++) {
                    if (i<size-2) {
                        result += arr_divisor[i] + " + ";
                    } else {
                        result += arr_divisor[i];
                    }
                }//for
                System.out.println(result);
            } else {
                System.out.println(n + " is NOT perfect.");
            }//if

        }//while
    }//main
}