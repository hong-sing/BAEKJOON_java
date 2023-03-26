import java.util.*;

// 코딩은 체육과목 입니다
public class No25314 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int loopCnt = n/4;

        String answer = "";
        for (int i=0; i<loopCnt; i++) {
            answer += "long ";
        }
        answer += "int";
        System.out.println(answer);
    }
}
