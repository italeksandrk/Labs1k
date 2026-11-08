package LR3;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Task9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите размер массива:");
        int size = in.nextInt();
        int[] nums = new  int[size];

        Random random = new Random();

        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(nums));

        int min = nums[0];

        for (int i =1; i < nums.length; i++){
            if (min > nums[i]){
                min = nums[i];
            }

        }

        for (int i = 0; i < nums.length; i++){
            if (nums[i] == min){
                System.out.println("Минимальнго значение " + min + " Индекс: ["+i+"]");
            }
        }

    }

}


