import java.util.HashSet;
import java.util.Scanner;

public class No1065 {
    public static int count(int n) {
        String a = Integer.toString(n);
        int len = a.length();
        HashSet<Integer> set = new HashSet<>();

        if(len==1) {
            return 1;
        } else {
            for(int i=0; i<len-1; i++){
                int diff = a.charAt(i) - a.charAt(i+1);
                set.add(diff);
            }
        }
        if(set.size()==1) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int answer = 0;
        for(int i=1; i<=n; i++) {
            answer += count(i);
        }
        System.out.println(answer);
    }
}
