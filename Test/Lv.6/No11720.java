import java.io.*;

//숫자의 합
public class No11720 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        String[] arr = s.split("");
        int[] num = new int[n];
        int sum = 0;

        for(int i=0; i<n; i++) {
            num[i] = Integer.parseInt(arr[i]);
            sum += num[i];
        }
        System.out.println(sum);
        br.close();
    }
}

