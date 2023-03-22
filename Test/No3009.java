import java.util.*;

// 네 번째 점
class No3009 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int[] arrx = new int[3];
        int[] arry = new int[3];
        for(int i=0; i<3; i++) {
            arrx[i] = sc.nextInt();
            arry[i] = sc.nextInt();
        }

        int x1 = arrx[0];
        int x2 = arrx[1];
        if(isEqualX(arrx[0], arrx[1])) {
            x2 = arrx[2];
        }

        int countx1 = countX(x1, arrx);
        int countx2 = countX(x2, arrx);

        int forthX = 0;
        if(countx1==1) forthX=x1;
        if(countx2==1) forthX=x2;

        int y1 = arry[0];
        int y2 = arry[1];
        if(isEqualY(arry[0], arry[1])) {
            y2 = arry[2];
        }

        int county1 = countY(y1, arry);
        int county2 = countY(y2, arry);

        int forthY = 0;
        if(county1==1) forthY=y1;
        if(county2==1) forthY=y2;

        System.out.println(forthX + " " + forthY);
    }




    static int countX(int x, int[] arrx) {
        int countX = 0;
        for(int i=0; i<3; i++) {
            if(isEqualX(x, arrx[i])) countX++;
        }
        return countX;
    }

    static int countY(int y, int[] arry) {
        int countY = 0;
        for(int i=0; i<3; i++) {
            if(isEqualY(y, arry[i])) countY++;
        }
        return countY;
    }

    static boolean isEqualX(int x1, int x2) {
        return x1 == x2;
    }

    static boolean isEqualY(int y1, int y2) {
        return y1 == y2;
    }

}