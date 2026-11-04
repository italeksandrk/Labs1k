import java.util.Scanner;
public class Task_1409 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();

        int cans = a + b - 1;

        int Garry = cans - a;
        int Larry = cans - b;



        System.out.print(Garry + " " + Larry);
    }
}
