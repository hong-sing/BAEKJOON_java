import java.util.*;

public class No11382 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();

        System.out.println(a+b+c);
    }
}

// 입력 범위가 (1 ≤ A, B, C ≤ 10^12)이기 때문에 int 타입으로 할 수 없다.