import java.util.*;
import java.io.*;

// 스택   https://www.acmicpc.net/problem/10828
// Scanner 쓰니까 시간초과 뜸
class No10828 {
    static ArrayList<Integer> list = new ArrayList<>();

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i=0; i<n; i++) {
            String input = br.readLine();
            String[] arr = input.split(" ");

            if (arr[0].equals("push")) push(Integer.parseInt(arr[1]));
            if (arr[0].equals("pop")) bw.write(pop()+"\n");
            if (arr[0].equals("size")) bw.write(size(list)+"\n");
            if (arr[0].equals("empty")) bw.write(empty(list)+"\n");
            if (arr[0].equals("top")) bw.write(top(list)+"\n");
        }

        bw.flush();
        bw.close();
    }

    static void push(Integer x) {
        list.add(x);
    }

    static Integer pop() {
        int size = list.size();
        if (size==0) return -1;
        int _top = list.get(size-1);
        list.remove(size-1);
        return _top;
    }

    static int size(List list) {
        return list.size();
    }

    static int empty(List list) {
        int _size = list.size();
        if (_size==0) return 1;
        return 0;
    }

    static Integer top(List list) {
        int _size = list.size();
        if (_size==0) return -1;
        return (Integer) list.get(_size-1);
    }
}