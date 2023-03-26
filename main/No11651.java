import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

// 좌표 정렬하기2
class No11651 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List list = new ArrayList();
        for (int i=0; i<n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            XY2 xy = new XY2(x,y);
            list.add(xy);
        }

        Collections.sort(list);

        int size = list.size();
        for(int i=0; i<size; i++) {
            System.out.println(list.get(i));
        }
    }
}

class XY2 implements Comparable {
    int x;
    int y;

    XY2(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return this.x + " " + this.y;
    }

    public int compareTo(Object o) {
        if (o instanceof XY2) {
            XY2 xy = (XY2) o;
            return this.y==xy.y ? this.x-xy.x : this.y-xy.y;
        }
        return -1;
    }
}