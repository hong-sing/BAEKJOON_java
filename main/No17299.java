import java.util.*;
import java.io.*;

// 오등큰수 https://www.acmicpc.net/problem/17299
class No17299 {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] cnt = new int[1000001];
        int[] seq = new int[n];
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input);

        for (int i = 0; i < n; i++) {
            seq[i] = Integer.parseInt(st.nextToken());
            cnt[seq[i]]++;
        }

        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < n; i++) {

            while (!s.empty() && cnt[seq[s.peek()]] < cnt[seq[i]]) {
                seq[s.pop()] = seq[i];
            }
            s.push(i);
        }

        while (!s.empty()) {
            seq[s.pop()] = -1;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(seq[i]).append(" ");
        }
        System.out.println(sb);

    }
}