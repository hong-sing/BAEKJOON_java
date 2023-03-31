import java.util.*;
import java.io.*;

// 요세푸스 문제  https://www.acmicpc.net/problem/1158
class No1158 {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Queue<Integer> q = new LinkedList<>();

        String input = br.readLine();
        String[] arr = input.split(" ");

        int n = Integer.parseInt(arr[0]);
        int k = Integer.parseInt(arr[1]);

        StringBuilder sb = new StringBuilder();
        sb.append("<");

        for (int i=1; i<=n; i++) {
            q.offer(i);
        }

        while (!q.isEmpty()) {
            for (int j=0; j<k-1; j++) {
                q.offer(q.poll());
            }
            if (q.size()!=1) {
                sb.append(q.poll()+", ");
            } else {
                sb.append(q.poll()+">");
            }

        }


        System.out.println(sb);
    }
}