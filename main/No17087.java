import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

// 숨바꼭질 6   https://www.acmicpc.net/problem/17087
public class No17087 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());

        StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
        ArrayList<Integer> list = new ArrayList<>(n);
        list.add(s);
        while (st2.hasMoreTokens()) {
            list.add(Integer.parseInt(st2.nextToken()));
        }
        Collections.sort(list);

        int[] diff = new int[list.size() - 1];
        for (int i = 0; i < list.size()-1; i++) {
            diff[i] = list.get(i+1) - list.get(i);
        }

        int answer = 0;
        if (diff.length > 1) {
            answer = gcd(diff[0], diff[1]);
        } else {
            answer = Math.abs(diff[0]);
        }

        for (int i = 2; i < diff.length; i++) {
            answer = gcd(answer, diff[i]);
        }
        System.out.println(answer);
    }

    static int gcd(int a, int b) {
        if (a % b == 0) {
            return b;
        } else {
            return gcd(b, a % b);
        }
    }
}
