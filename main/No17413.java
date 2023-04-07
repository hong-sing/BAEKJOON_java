import java.util.*;
import java.io.*;

// 단어 뒤집기 2 https://www.acmicpc.net/problem/17413
class No17413 {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        Stack<Character> s = new Stack<>();

        // 태그 안밖 구분 (false면 밖, true면 안)
        boolean flag = false;

        for (int i = 0; i < input.length(); i++) {

            if (input.charAt(i) == '<') {   // 태그 안
                flag = true;
                while (!s.isEmpty()) {
                    System.out.print(s.pop());
                }
                System.out.print("<");
            } else if (input.charAt(i) == '>') {    // 태그 밖
                flag = false;
                System.out.print(">");
            } else if (!flag) { // 태그 밖
                if (input.charAt(i) == ' ') {   // 공백을 만나면
                    while (!s.isEmpty()) {
                        System.out.print(s.pop());  // 스택 다 출력
                    }
                    System.out.print(' ');
                }
                if (input.charAt(i) != ' ') {
                    s.add(input.charAt(i));
                }
            } else if (flag) {  // 태그 안
                System.out.print(input.charAt(i));
            }
        }
        while (!s.isEmpty()) {
            System.out.print(s.pop());
        }

    }
}