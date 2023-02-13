import java.util.*;

//커트라인
public class No25305 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        Integer[] score = new Integer[n];

        for(int i=0; i<n; i++) {
            score[i] = sc.nextInt();
        }
        Arrays.sort(score, Collections.reverseOrder());
        System.out.println(score[k-1]);
    }
}
