import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

// 접미사 배열   https://www.acmicpc.net/problem/11656
class No11656 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < input.length(); i++) {
            list.add(input.substring(i));
        }
        Collections.sort(list);
        for (String e : list) {
            System.out.println(e);
        }
    }
}