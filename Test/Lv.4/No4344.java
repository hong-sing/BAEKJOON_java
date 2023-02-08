import java.io.*;
import java.util.ArrayList;

public class No4344 {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int c = Integer.parseInt(br.readLine());
        String input = "";
        ArrayList<Integer> list = new ArrayList<>();
        int sum = 0;
        double avg = 0;
        int count = 0;
        double ratio = 0;

        for(int i=0; i<c; i++) {
            input = br.readLine();
            String[] arr = input.split(" ");
            int n = Integer.parseInt(arr[0]);
            for(int j=0; j<n; j++) {
                list.add(Integer.parseInt(arr[j+1]));
            }
            for(int j=0; j<n; j++) {
                sum += list.get(j);
            }
            avg = (double)sum/n;
            for(int j=0; j<n; j++) {
                if(list.get(j)>avg) {
                    count += 1;
                }
            }
            ratio = (double)count/n*100;
            System.out.printf("%.3f", ratio);
            System.out.print("%\n");
            count = 0;
            sum = 0;
            list.clear();
        }

    }
}
