import java.util.Scanner;
public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println();
        int a = in.nextInt();

        int b = a / 1000;
        int c = b % 10;

        if (c > 0) {
        System.out.println("В числе " + c + " тысяч");
        } else if (c == 0) {
            System.out.println("В числе нет разряда тясяч");
        }
        else {
            c = (int) Math.sqrt(c * c);
            System.out.println("В числе " + c + " тысяч");
        }

        }
}
