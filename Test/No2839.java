import java.util.*;

class No2839 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] sugar = {5, 3};   // 설탕 5kg, 3kg
        int[] cnt = {0, 0}; // 설탕 봉지 갯수

        cnt[0] = n/sugar[0];    // 5kg 먼저 채우기 (최소 갯수니까 큰거 먼저)
        n = n%sugar[0];
        cnt[1] = n/sugar[1];    // 3kg 채우기

        switch (n%sugar[1]) {   // 5kg, 3kg 채우고 남은 kg
            case 1 :    // 남은 무게가 1kg
                if (cnt[0]>0) { // 5kg 하나 빼려면 최소 하나는 있어야 함
                    cnt[0]--; cnt[1]+=2;    // 5kg 하나 빼고 3kg 두개 추가 -> -5+6 = +1kg
                    System.out.println(cnt[0] + cnt[1]);
                    break;
                } else {    // 뺄 5kg이 없다면 5kg와 3kg으로 정확하게 만들 수 없음
                    System.out.println(-1); break;
                }
            case 2 :    // 남은 무게가 2kg
                if (cnt[0]>1) { //5kg 두개 빼려면 최소 두개는 있어야 함
                    cnt[0]-=2; cnt[1]+=4;   // 5kg 두개 빼고 3kg 네개 추가 -> -10+12 = +2kg
                    System.out.println(cnt[0] + cnt[1]);
                    break;
                } else {
                    System.out.println(-1); break;
                }
            case 0 :
                System.out.println(cnt[0]+cnt[1]);
                break;
        }


    }
}