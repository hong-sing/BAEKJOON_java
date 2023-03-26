import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

// 블랙잭
class No2798 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        // 입력한 숫자 배열에 담기
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        // 모든 경우의 수 중 m이 넘지 않는 수 담기
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<n-2; i++) {
            for(int j=i+1; j<n-1; j++) {
                for(int k=j+1; k<n; k++) {
                    if(sum(arr[i],arr[j],arr[k])<=m) {
                        list.add(sum(arr[i],arr[j],arr[k]));
                    }
                }
            }
        }
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list.get(0));
    }

    static int sum(int a, int b, int c) {
        return a+b+c;
    }
}
