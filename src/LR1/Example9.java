import java.util.Scanner;
public class Example9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите месяц: ");
        String month = in.nextLine();

        System.out.println("Введите количество дней в этом месяце: ");
        int day = in.nextInt();

        System.out.println("В " + month + " " + day + " дней");
    }
}
