import java.util.*;

// 단어 정렬
class No1181 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        Set set = new HashSet();
        for (int i=0; i<n; i++) {
            String input = sc.nextLine();
            set.add(input);
        }
        List list = new ArrayList(set);
        Collections.sort(list, new SortShortDic());
        int size = list.size();
        for (int i=0; i<size; i++) {
            System.out.println(list.get(i));
        }

    }
}

class SortShortDic implements Comparator {
    public int compare(Object o1, Object o2) {
        if (o1 instanceof Comparable && o2 instanceof Comparable) {
            String w1 = (String) o1;
            String w2 = (String) o2;
            return w1.length()==w2.length() ? w1.compareTo(w2) : w1.length()-w2.length();
        }
        return -1;
    }
}