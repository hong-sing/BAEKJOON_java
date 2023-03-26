import java.util.Scanner;

// 약수 구하기
class No2501 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String result = "";

        for (int i=1, j=0; i<=n; i++) {
            if (n%i==0) {
                result += i+",";
            }
        }
        String[] arr = result.split(",");

        if (arr.length<k) {
            System.out.println("0");
        } else {
            System.out.println(arr[k-1]);
        }
    }
}