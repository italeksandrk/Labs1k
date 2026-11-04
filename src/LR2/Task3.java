import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println();
        int a = in.nextInt();


        if (a%4 == 0) {
            if (a >= 10){
                System.out.println("удовлетворяет");
            } else {
                System.out.println("не удовлетворяет");
            }
        } else {
            System.out.println("не удовлетворяет");
        }



    }
}
