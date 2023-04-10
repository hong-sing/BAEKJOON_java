import java.io.*;

// ROT13    https://www.acmicpc.net/problem/11655
class No11655 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) >= 'A' && input.charAt(i) <= 'Z') {
                char ch = input.charAt(i);
                ch = (char) (ch + 13);
                if (ch > 'Z') {
                    ch = (char) (ch - 26);
                }
                sb.append(ch);
            } else if (input.charAt(i) >= 'a' && input.charAt(i) <= 'z') {
                char ch = input.charAt(i);
                ch = (char) (ch + 13);
                if (ch > 'z') {
                    ch = (char) (ch - 26);
                }
                sb.append(ch);
            } else {
                sb.append(input.charAt(i));
            }
        }
        System.out.println(sb);
    }
}