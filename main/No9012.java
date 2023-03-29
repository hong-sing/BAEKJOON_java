import java.util.*;
import java.io.*;

// 괄호   https://www.acmicpc.net/problem/9012
class No9012 {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ;
        int t = Integer.parseInt(br.readLine());

        for (int i=0; i<t; i++) {
            String input = br.readLine().trim();
            Stack s = new Stack();
            for (int j=0; j<input.length(); j++) {
                char p = input.charAt(j);
                if (p=='(') {
                    s.push(p);
                } else {
                    if (s.isEmpty()) {
                        s.push('(');
                        break;
                    } else {
                        s.pop();
                    }
                }

            }
            if (s.isEmpty()) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }
    }
}