import java.io.*;

// 알파벳 개수   https://www.acmicpc.net/problem/10808
class No10808 {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        int[] cnt = new int[26];

        for (int i=0; i<input.length(); i++) {
            cnt[input.charAt(i)-'a']++;
        }

        StringBuilder sb = new StringBuilder();
        for (int i=0; i<cnt.length; i++) {
            sb.append(cnt[i]+" ");
        }
        System.out.println(sb);
    }
}