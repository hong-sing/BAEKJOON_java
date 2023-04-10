import java.io.*;
import java.util.StringTokenizer;

// 네 수  https://www.acmicpc.net/problem/10824
class No10824 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        String first = st.nextToken() + st.nextToken();
        String second = st.nextToken() + st.nextToken();

        Long ab = Long.parseLong(first);
        Long cd = Long.parseLong(second);

        System.out.println(ab+cd);
    }
}