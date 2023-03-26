import java.util.Scanner;

// 문자열 (구현, 문자열)
class No9086{
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        for(int i=0; i<t; i++) {
            String input = sc.nextLine();
            String a = input.substring(0,1);
            String b = input.substring(input.length()-1);
            System.out.println(a+b);
        }
    }
}
