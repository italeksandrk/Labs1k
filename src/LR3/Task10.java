package LR3;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Task10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] nums = new  int[10];
        Random random = new Random();
        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(10);
        }
        Arrays.sort(nums);

        for (int i = 0; i < nums.length / 2; i++) {
            int temp = nums[i];
            nums[i] = nums[nums.length - 1 - i];
            nums[nums.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(nums));
    }
}
