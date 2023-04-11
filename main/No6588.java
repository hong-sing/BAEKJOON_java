import java.io.BufferedReader;
import java.io.InputStreamReader;

// 골드바흐의 추축 https://www.acmicpc.net/problem/6588
public class No6588 {
    public static void main(String[] args) throws Exception{
        int MAX = 1000001;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] num = new int[MAX];
        for (int i = 2; i < MAX; i++) {
            num[i] = i;
        }

        for (int i = 2; i < MAX; i++) {
            for (int j = 2*i; j < MAX; j+=i) {
                num[j] = 0;
            }
        }

        int n = 0;
        while ((n = Integer.parseInt(br.readLine())) != 0) {
            int b = 0;

            for (int i = 3; i <= n; i+=2) {
                if (num[i] != 0) {
                    b = n-i;
                    if (num[b] != 0) {
                        System.out.println(n + " = " + i + " + " + b);
                        break;
                    } else if (num[b]==0 && i==n) {
                        System.out.println("Goldbach's conjecture is wrong.");
                    }
                }
            }

        }
    }
}