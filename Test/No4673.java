public class No4673 {
    public static int d(int n) {
        int sum = n;
        String s = Integer.toString(n);
        for(int i=0; i<s.length(); i++) {
            sum += s.charAt(i) - '0';
        }
        return sum;
    }

    public static void main(String args[]) {
        for(int i=1; i<=10000; i++) {
            for(int j=1; j<=i; j++) {
                if(d(j)==i) {
                    break;
                } else {
                    if(i==j) {
                        System.out.println(i);
                        break;
                    }
                }
            }
        }

    }
}
