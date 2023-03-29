import java.io.*;

// 단어 뒤집기   https://www.acmicpc.net/problem/9093
// 스택으로도 풀 수 있으니 해보자
class No9093 {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        for (int i=0; i<t; i++) {
            String input = br.readLine();
            String[] arr = input.split(" ");
            String result = reverse(arr);
            bw.write(result+"\n");
        }
        bw.flush();
        bw.close();
    }

    static String reverse(String[] arr) {
        int _size = arr.length;
        for (int i=0; i<_size; i++) {
            arr[i] = change(arr[i]);
        }

        String _out = "";
        for (int i=0; i<_size; i++) {
            _out += arr[i] + " ";
        }

        return _out;
    }

    static String change(String word) {
        int _length = word.length();
        if (_length==1) return word;
        String[] arr = word.split("");
        int i = 0;
        int j = _length-1;
        while (i < j) {
            String tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
            i++;
            j--;
        }
        String _out = "";
        for (int a=0; a<_length; a++) {
            _out += arr[a];
        }
        return _out;
    }
}