package LR3;
import java.util.Scanner;
public class Task3_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();
        int[] arrayInt = new int[num];

        arrayInt[0] = 1;
        arrayInt[1] = 1;

        System.out.println(arrayInt[0]);
        System.out.println(arrayInt[1]);
        for (int i = 2; i < arrayInt.length; i++) {
            arrayInt[i] = arrayInt[i-1] + arrayInt[i-2];
            System.out.println(arrayInt[i]);
        }

    }
}
