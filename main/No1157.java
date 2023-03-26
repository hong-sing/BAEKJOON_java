import java.io.*;
import java.util.*;

public class No1157 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        input = input.toUpperCase();
        String[] arr = input.split("");

        HashSet<String> set = new HashSet<>();
        int cnt = 0;

        for(int i=0; i<arr.length; i++) {
            set.add(arr[i]);
        }
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        Iterator iter = set.iterator();
        while(iter.hasNext()) {
            String s = (String)iter.next();
            list1.add(s);
            for(int i=0; i<arr.length; i++) {
                if(s.equals(arr[i])) {
                    cnt += 1;
                }
            }
            list2.add(cnt);
            cnt = 0;
        }

        int max = 0;
        int idx = 0;
        for(int i=0; i<list2.size(); i++) {
            if(max<list2.get(i)) {
                max = list2.get(i);
                idx = i;
            }
        }

        int dup = 0;
        for(int i=0; i<list2.size(); i++) {
            if(max==list2.get(i)) {
                dup += 1;
            }
        }
        if(dup>1) {
            System.out.println("?");
        } else {
            System.out.println(list1.get(idx));
        }

        br.close();
    }
}
