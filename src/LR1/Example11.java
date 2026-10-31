import java.util.Scanner;
public class Example11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int year = 2026;

        System.out.println("Введите имя: ");
        String name = in.nextLine();

        System.out.println("Введите год рождения: ");
        int year_of_birth = in.nextInt();


        System.out.println(name + ", вам: " + (year - year_of_birth));

    }
}