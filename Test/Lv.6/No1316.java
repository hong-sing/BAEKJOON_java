import java.util.*;

class No1316 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        sc.nextLine();

        for (int i=0; i<n; i++) {
            String input = sc.nextLine();
            int size = input.length();

            if (size==1 || size==2) {
                cnt++;
            } else {
                Loop1:
                for (int j=0; j<size-2; j++) {
                    if (input.charAt(j)!=input.charAt(j+1)) {
                        for (int k=j+2; k<size; k++) {
                            if (input.charAt(j)==input.charAt(k)) {
                                break Loop1;
                            }
                        }
                    }
                    if (j==size-3) cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}