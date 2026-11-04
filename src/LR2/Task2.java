import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println();
        int a = in.nextInt();


        if (a%5 == 2) {
            if (a%7 == 1){
                System.out.println("удовлетворяет");
            } else {
                System.out.println("не удовлетворяет");
            }
        } else {
            System.out.println("не удовлетворяет");
        }

        }
    }