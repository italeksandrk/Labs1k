package LR3;
import java.util.Scanner;
public class Task4_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int first = in.nextInt();
        int second = in.nextInt();
        int min = Math.min(first, second);
        int max = Math.max(first, second);

        int i = min;
        while (i <= max ){
            System.out.println(i);
            i++;
        }
    }
}
