package LR3;
import java.util.Scanner;
import java.util.Arrays;
public class Task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();
        if (num <= 0) {
            System.out.println("Введите число больше нуля");
        }

        int[] arrayInt = new int[num];
        int a = 0;
        int i = 0;

        while (i < arrayInt.length) {
            if (a % 5 == 2) {
                arrayInt[i] = a;
                i++;
                a++;
            } else {
            a++;
            }
        }
        System.out.println(Arrays.toString(arrayInt));
    }
}
