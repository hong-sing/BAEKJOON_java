import java.util.*;
import java.io.*;

// 에디터  https://www.acmicpc.net/problem/1406
class No1406 {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String n = br.readLine();
        int m = Integer.parseInt(br.readLine());

        Stack<String> st1 = new Stack<>();
        Stack<String> st2 = new Stack<>();

        String[] arrN = n.split("");

        for (int i=0; i<arrN.length; i++) {
            st1.push(arrN[i]);
        }

        for (int i=0; i<m; i++) {
            String input = br.readLine();
            String[] arr = input.split(" ");

            if (arr[0].equals("P")) {
                st1.push(arr[1]);
            }
            if (arr[0].equals("L")) {
                if (!st1.isEmpty()) {
                    st2.push(st1.pop());
                }
            }
            if (arr[0].equals("B")) {
                if (!st1.isEmpty()) {
                    st1.pop();
                }
            }
            if (arr[0].equals("D")) {
                if (!st2.isEmpty()) {
                    st1.push(st2.pop());
                }
            }
        }

        while (!st1.isEmpty()) {
            st2.push(st1.pop());
        }

        while (!st2.isEmpty()) {
            bw.write(st2.pop());
        }
        bw.flush();
        bw.close();
    }
}

/*

처음 LinkedList로 구현한 코드
결과 : 시간 초과

class Main {

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();
        int cursor = n.length()-1;
        LinkedList<String> ll = new LinkedList<>(Arrays.asList(n.split("")));

        int m = Integer.parseInt(br.readLine());
        for (int i=0; i<m; i++) {
            String input = br.readLine();
            String[] arr = input.split(" ");

            if (arr[0].equals("P")) {
                ll.add(cursor+1, arr[1]);
                cursor++;
            }
            if (arr[0].equals("D")) {
                if (cursor!=ll.size()-1) cursor++;
            }
            if (arr[0].equals("B")) {
                if (cursor!=-1) {
                    ll.remove(cursor);
                    cursor--;
                }
            }
            if (arr[0].equals("L")) {
                if (cursor>=0) cursor--;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ll.size(); i++) {
            sb.append(ll.get(i));
        }

        System.out.println(sb);
    }

}

LinkedList로는 안되고 Stack으로 구현해야 한다는 힌트를 얻음
코드는 직접 구현했다.
참고 블로그 : https://minhamina.tistory.com/17
 */