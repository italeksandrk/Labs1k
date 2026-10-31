import java.util.Scanner;
public class Example12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int year = 2026;

        System.out.println("Введите ваш возраст: ");
        int old = in.nextInt();

        System.out.println("Год вашего рождения: " + (year - old));


    }
}