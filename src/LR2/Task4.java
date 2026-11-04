import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println();
        int a = in.nextInt();

        if (a >= 5) {
            if (a <= 10){
                System.out.println("входит в диапазон");
            } else {
                System.out.println("не входит в диапазон");
            }
        } else {
            System.out.println("не входит в диапазон");
        }


    }
}
