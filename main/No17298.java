import java.util.*;
import java.io.*;

// 오큰수 https://www.acmicpc.net/problem/17298
class No17298 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input, " ");

        int[] seq = new int[n];
        for (int i = 0; i < n; i++) {
            seq[i] = Integer.parseInt(st.nextToken());
        }
        Stack<Integer> s = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!s.empty() && seq[s.peek()] < seq[i]) {
                seq[s.pop()] = seq[i];
            }
            s.push(i);
        }

        while (!s.empty()) {
            seq[s.pop()] = -1;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(seq[i]).append(' ');
        }
        System.out.println(sb);
    }

//    https://st-lab.tistory.com/196  계속 시간초과가 나와서 참고한 블로그



// 시간 초과
//    public static void main(String args[]) throws Exception{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
////        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        StringBuilder sb = new StringBuilder();
//
//        int n = Integer.parseInt(br.readLine());
//
//        Stack<Integer> s1 = new Stack<>();
//        Stack<Integer> s2 = new Stack<>();
//
//        String input = br.readLine();
//        StringTokenizer st = new StringTokenizer(input, " ");
//        while (st.hasMoreTokens()) {
//            int A = Integer.parseInt(st.nextToken());
//            s1.add(A);
//        }
//
//        for (int i=0; i<n; i++) {
//            s2.add(s1.pop());
//        }
//
//        int e = 0;
//        while (!s1.isEmpty() || !s2.isEmpty()) {
//            if (s1.isEmpty()) {
//                e = s2.pop();
//            }
//
//            if (s1.isEmpty() && s2.isEmpty()) {
////                System.out.print("-1");
////                bw.write("-1");
//                sb.append("-1");
//                break;
//            }
//
//            if (!s1.isEmpty() && s2.isEmpty()) {
////                System.out.print("-1 ");
////                bw.write("-1");
//                sb.append("-1 ");
//                while (!s1.isEmpty()) {
//                    s2.add(s1.pop());
//                }
//                e = s2.pop();
//            }
//
//
//            if (e < s2.peek()) {
////                System.out.print(s2.peek()+" ");
////                bw.write(s2.peek()+"");
//                sb.append(s2.peek() + " ");
//                if (!s1.isEmpty()) {
//                    s2.add(s1.pop());
//                }
//            } else {
//                s1.add(s2.pop());
//            }
//
//        }
////        System.out.print(sb);
//    }
}