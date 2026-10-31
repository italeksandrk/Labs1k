import java.util.Scanner;
public class Example13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число: ");
        int chislo = in.nextInt();

        int chislo2 = chislo -1;
        int chislo3 = chislo +1;
        int chisclo4 = (chislo2 + chislo3 + chislo) * (chislo2 + chislo3 + chislo);

        System.out.println(chislo2);
        System.out.println(chislo);
        System.out.println(chislo3);
        System.out.println(chisclo4);


    }
}
