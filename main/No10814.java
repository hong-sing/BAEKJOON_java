import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

// 나이순 정렬
class No10814 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        List list = new ArrayList();
        for (int i=0; i<n; i++) {
            String input = sc.nextLine();
            Scanner sc2 = new Scanner(input).useDelimiter(" ");
            list.add(new Member(sc2.nextInt(), sc2.nextLine().trim(), i));
        }
        Collections.sort(list);
        for (int i=0; i<n; i++) {
            System.out.println(list.get(i));
        }
    }
}

class Member implements Comparable {
    int age;
    String name;
    int joinOrder;

    Member(int age, String name, int joinOrder) {
        this.age = age;
        this.name = name;
        this.joinOrder = joinOrder;
    }

    public String toString() {
        return age+" "+name;
    }

    public int compareTo(Object o) {
        if (o instanceof Member) {
            Member m = (Member) o;
            return this.age==m.age ? this.joinOrder-m.joinOrder : this.age-m.age;
        }
        return -1;
    }
}