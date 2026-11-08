package LR3;
import java.util.Scanner;
public class Task5_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int numbers = in.nextInt();
        int sum = 0;
        int i = 0;
        int count = 0;
        
        do {
            if (i % 5 == 2 || i % 3 == 1) {
                System.out.println(i);
                sum = sum + i;
                count = count + 1;
                i = i + 1;
            }else {
                i++;
            }
        }
        while (count < numbers);
        System.out.println("Сумма чисел: " + sum);
    }
}