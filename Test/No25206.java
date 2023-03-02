import java.util.*;

// 너의 평점은
public class No25206 {
    static ArrayList list = new ArrayList();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map map = new HashMap();
        map.put("A+", 4.5f);
        map.put("A0", 4.0f);
        map.put("B+", 3.5f);
        map.put("B0", 3.0f);
        map.put("C+", 2.5f);
        map.put("C0", 2.0f);
        map.put("D+", 1.5f);
        map.put("D0", 1.0f);
        map.put("F", 0.0f);

        while (sc.hasNext()) {
            String input = sc.nextLine();
            Scanner sc2 = new Scanner(input).useDelimiter(" ");
            Sungjuk sungjuk = new Sungjuk(sc2.next(), sc2.nextFloat(), sc2.next());
            list.add(sungjuk);
        }

        int size = list.size();
        float sum = 0;
        int totalHakjum = 0;
        for (int i=0; i<size; i++) {
            Sungjuk sj = (Sungjuk)list.get(i);
            if (!sj.getGrade().equals("P")) {
                float a = sj.getHakjum() * (float) map.get(sj.getGrade());
                float b = sj.getHakjum();
                sum += a;
                totalHakjum += b;
            }
        }
        float result = sum/totalHakjum;
        System.out.println(result);
    }
}

class Sungjuk {
    private String subject;
    private float hakjum;
    private String grade;

    public Sungjuk(String subject, float hakjum, String grade) {
        this.subject = subject;
        this.hakjum = hakjum;
        this.grade = grade;
    }

    public String getSubject() {
        return subject;
    }

    public float getHakjum() {
        return hakjum;
    }

    public String getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Sungjuk{" +
                "subject='" + subject + '\'' +
                ", hakjum=" + hakjum +
                ", grade='" + grade + '\'' +
                '}';
    }
}
