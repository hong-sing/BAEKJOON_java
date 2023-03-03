import java.util.*;

// 세로읽기 (구현, 문자열)
public class No10798 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] arr = new String[5][15];

        for(int i=0; i<5; i++) {
            String input = sc.nextLine();
            int size = input.length();

            for(int j=0; j<size; j++) {
                arr[i][j] = input.charAt(j)+"";
            }
        }

        String result = "";
        for(int i=0; i<15; i++) {
            for(int j=0; j<5; j++) {
                if(arr[j][i]!=null) {
                    result += arr[j][i];
                }
            }
        }
        System.out.println(result);
    }
}
