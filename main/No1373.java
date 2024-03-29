import java.io.BufferedReader;
import java.io.InputStreamReader;

// 2진수 8진수  https://www.acmicpc.net/problem/1373
public class No1373 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String n = br.readLine();

        // 세자리씩 끊었을 때 한 자리만 남았을 경우
        if(n.length() % 3 == 1)
            sb.append(n.charAt(0));

        // 세자리씩 끊었을 때 두 자리만 남았을 경우
        if(n.length() % 3 == 2)
            sb.append((n.charAt(0) - '0') * 2 + (n.charAt(1) - '0'));

        // 나머지 경우
        for(int i = n.length() % 3; i < n.length(); i+=3) {
            sb.append((n.charAt(i) - '0') * 4 + (n.charAt(i+1) - '0') * 2
                    + (n.charAt(i+2) - '0'));
        }
        System.out.println(sb);


    }
}