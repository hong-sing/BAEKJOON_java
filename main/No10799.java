import java.util.*;
import java.io.*;

// 쇠막대기 https://www.acmicpc.net/problem/10799
class No10799 {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        Stack<Character> s = new Stack();
        int count = 0;

        // 연속으로 ')'가 나오는지 체크. 연속으로 나오면 true
        boolean flag = false;

        for (int i=0; i<input.length(); i++) {
            if (input.charAt(i)=='(') {
                flag = false;
                s.add(input.charAt(i));
            } else {
                if (flag) { // ')'가 연속으로 나왔다면, 다 잘린 막대가 있음
                    s.pop();
                    count ++;   // 막대 끝부분은 1개
                } else {
                    s.pop();
                    count += s.size();
                }
                flag = true;
            }
        }
        System.out.println(count);
    }
}