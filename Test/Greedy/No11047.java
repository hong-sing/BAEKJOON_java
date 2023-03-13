package Greedy;

import java.util.*;

// 동전 0
public class No11047 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] coin = new int[n];
        for (int i=n-1; 0<=i; i--) {
            coin[i] = sc.nextInt();
        }

        int count = 0;
        for (int i=0; i<n; i++) {
            if (k/coin[i]==0) continue;
            count += k/coin[i];
            k = k%coin[i];
        }
        System.out.println(count);
    }
}
