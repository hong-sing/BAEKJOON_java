import java.util.*;

// 좌표 정렬하기
class No11650 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List list = new ArrayList();
        for (int i=0; i<n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            XY1 xy = new XY1(x,y);
            list.add(xy);
        }

        Collections.sort(list);

        int size = list.size();
        for (int i=0; i<size; i++) {
            System.out.println(list.get(i));
        }
    }
}

class XY1 implements Comparable {
    int x;
    int y;

    XY1 (int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return this.x + " " + this.y;
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof XY1) {
            XY1 xy = (XY1) o;
            return this.x==xy.x ? this.y- xy.y : this.x- xy.x;
        }
        return -1;
    }
}