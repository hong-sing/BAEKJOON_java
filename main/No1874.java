import java.util.*;
import java.io.*;

// 스택 수열    https://www.acmicpc.net/problem/1874
class No1874 {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        Stack<Integer> s = new Stack<>();

        int tmp = 1;

        for (int i=0; i<n; i++) {
            int t = Integer.parseInt(br.readLine());

            for (; tmp <= t; tmp ++) {  // 4까지 입력받고 3,4를 꺼낸 후 6을 입력 받았으면 5부터 쌓여야 하므로 tmp를 전역변수로 설정
                s.push(tmp);
                sb.append("+").append("\n");
            }

            if (s.peek()==t) {
                s.pop();
                sb.append("-").append("\n");
            } else {
                System.out.println("NO");
                System.exit(0);
            }
        }

        System.out.println(sb);
    }
}