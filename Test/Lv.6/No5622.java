import java.util.*;

public class No5622 {
    public static int time(String[] arr) {
        int sec = 0;
        int sum = 0;

        for(int i=0; i<arr.length; i++) {
            switch(arr[i]) {
                case "A":
                case "B":
                case "C": sec = 3; break;
                case "D":
                case "E":
                case "F": sec = 4; break;
                case "G":
                case "H":
                case "I": sec = 5; break;
                case "J":
                case "K":
                case "L": sec = 6; break;
                case "M":
                case "N":
                case "O": sec = 7; break;
                case "P":
                case "Q":
                case "R":
                case "S": sec = 8; break;
                case "T":
                case "U":
                case "V": sec = 9; break;
                case "W":
                case "X":
                case "Y":
                case "Z": sec = 10; break;
            }
            sum += sec;
        }
        return sum;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] arr = input.split("");
        System.out.println(time(arr));
    }
}