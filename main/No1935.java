import java.io.*;
import java.util.*;

// 후위 표기식2  https://www.acmicpc.net/problem/1935
class No1935 {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        String sik = br.readLine();
        Stack<Double> s = new Stack<>();

        double[] num = new double[n];
        int j = 0;
        for (int i=0; i<n; i++) {
            num[i] = Integer.parseInt(br.readLine());
        }

        for (int i=0; i<sik.length(); i++) {
            if(sik.charAt(i)=='+') {
                double b = s.pop();
                double a = s.pop();
                s.push(a+b);
            } else if(sik.charAt(i)=='-') {
                double b = s.pop();
                double a = s.pop();
                s.push(a-b);
            } else if(sik.charAt(i)=='*') {
                double b = s.pop();
                double a = s.pop();
                s.push(a*b);
            } else if(sik.charAt(i)=='/') {
                double b = s.pop();
                double a = s.pop();
                s.push(a/b);
            } else {
                s.push(num[sik.charAt(i)-'A']);
            }
        }

        double answer = s.pop();
        System.out.println(String.format("%.2f", answer));
    }
}