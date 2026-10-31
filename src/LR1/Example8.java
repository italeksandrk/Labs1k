import java.util.Scanner;
public class Example8 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите день недели: ");
        String  day_of_the_week = in.nextLine();

        System.out.println("Введите месяц: ");
        String  month = in.nextLine();

        System.out.println("Введите дату: ");
        int day = in.nextInt();

        System.out.println("Сегодня: " + day_of_the_week + " " + day + " " + month);
    }
}

//Если прям как из задания, то System.out.println(day_of_the_week + "," + day + "," + month);