import java.io.*;

// 문자열 분석   https://www.acmicpc.net/problem/10820
class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = "";
        while ((input = br.readLine()) != null) {
            int small = 0;
            int big = 0;
            int num = 0;
            int blank = 0;

            for (int i=0; i<input.length(); i++) {
                if (input.charAt(i)>='a' && input.charAt(i)<='z') {
                    small++;
                } else if (input.charAt(i)>='A' && input.charAt(i)<='Z') {
                    big++;
                } else if (input.charAt(i)>='0' && input.charAt(i)<='9') {
                    num++;
                } else if (input.charAt(i)==' ') {
                    blank++;
                }
            }
            System.out.println(small+" "+big+" "+num+" "+blank);
        }

    }
}