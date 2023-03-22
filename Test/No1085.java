import java.util.*;

// 직사각형에서 탈출
public class No1085 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();

        int result = minMove(x,y,w,h);
        System.out.println(result);
    }

    static int moveRight(int x, int w) {
        return w - x;
    }

    static int moveLeft(int x) {
        return x - 0;
    }

    static int moveUp(int y, int h) {
        return h - y;
    }

    static int moveDown(int y) {
        return y - 0;
    }

    static int isMoveLeftRight(int x, int w) {
        return moveRight(x,w)>moveLeft(x) ? moveLeft(x) : moveRight(x,w);
    }

    static int isMoveUpDown(int y, int h) {
        return moveUp(y, h)>moveDown(y) ? moveDown(y) : moveUp(y,h);
    }

    static int minMove(int x, int y, int w, int h) {
        return isMoveLeftRight(x, w)>isMoveUpDown(y,h) ? isMoveUpDown(y,h) : isMoveLeftRight(x,w);
    }
}
