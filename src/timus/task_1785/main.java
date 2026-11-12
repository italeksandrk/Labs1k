package timus.task_1785;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int nums = in.nextInt();

        if (nums >= 1  && nums <= 4) {
            System.out.println("few");
        } else if (nums > 4 && nums <= 9) {
            System.out.println("several");
        } else if (nums > 9 && nums <= 19) {
            System.out.println("pack");
        } else if (nums > 19 && nums <= 49) {
            System.out.println("lots");
        } else if (nums > 49 && nums <= 99) {
            System.out.println("horde");
        } else if (nums > 99 && nums <= 249) {
            System.out.println("throng");
        } else if (nums > 249 && nums <= 499) {
            System.out.println("swarm");
        } else if (nums > 499 && nums <= 999) {
            System.out.println("zounds");
        } else if (nums > 999) {
            System.out.println("legion");
        }

    }
}