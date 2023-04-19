import java.io.BufferedReader;
import java.io.InputStreamReader;

// 8진수 2진수  https://www.acmicpc.net/problem/1212
class No1212 {
    public static void main(String[] args) throws Exception {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();

        for (int i = 0; i < input.length(); i++) {
            int target = input.charAt(i) - '0';
            String s = Integer.toBinaryString(target);
            if (s.length() == 3) {
                sb.append(s);
            } else if (s.length() == 2 && i != 0) {
                sb.append(0).append(s);
            } else if (s.length() == 1 && i != 0) {
                sb.append(0).append(0).append(s);
            } else
                sb.append(s);
        }

        System.out.println(sb);
    }
}