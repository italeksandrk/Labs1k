import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите сколько задач решил Гриша за первый час: ");
        int first = in.nextInt();

        int all = 12; //количество задач
        int time = 5;
        int time2 = 5 - 1;
        float tasks = time2 * 60 / 45;

        if (first + tasks >= all) {
        System.out.println("YES");
    } else {
            System.out.println("NO");
        }


    }
}
