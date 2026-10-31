import java.util.Scanner;
public class Example15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        int first = in.nextInt();

        System.out.println("Введите второе число: ");
        int second = in.nextInt();

        System.out.println("Сумма чисел = " + (first + second) + " Разность чисел = " + (first - second));

    }
}

