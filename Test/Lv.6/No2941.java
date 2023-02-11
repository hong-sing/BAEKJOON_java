import java.util.*;

public class No2941 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        input = input.replace("c=", "1");
        input = input.replace("c-", "1");
        input = input.replace("dz=", "1");
        input = input.replace("d-", "1");
        input = input.replace("lj", "1");
        input = input.replace("nj", "1");
        input = input.replace("s=", "1");
        input = input.replace("z=", "1");

        int cnt = input.length();

        System.out.println(cnt);
    }
}
