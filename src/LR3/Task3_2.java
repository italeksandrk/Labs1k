package LR3;
import java.util.Scanner;
public class Task3_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();
        int[] arrayInt = new int[num];

        arrayInt[0] = 1;
        arrayInt[1] = 1;

        System.out.println(arrayInt[0]);
        System.out.println(arrayInt[1]);

        int i = 2;
        while (i < arrayInt.length)  {
            arrayInt[i] = arrayInt[i-1] + arrayInt[i-2];
            System.out.println(arrayInt[i]);
            i+=1;
     }

    }
}
