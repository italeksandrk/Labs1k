import java.util.Scanner;
import java.io.PrintWriter;

public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println();

        int first = in.nextInt();
        int differece = 12 - first;
        int time = differece * 45;

        if (time <= 240) {
        System.out.println("YES");
    } else {
            System.out.println("NO");
        }

    }
}
