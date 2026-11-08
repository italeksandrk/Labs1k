package LR3;
import java.util.Arrays;
import java.util.Scanner;
public class Task7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int size = 10;
        char[] arrayChar = new char[size];
        char letter1 = 97;

        for(int i = 0; i <size; i++){
            arrayChar[i] = letter1;
            letter1+=2;
            i=i++;
        }
        System.out.println(Arrays.toString(arrayChar));

        char letter2 = 115;
        for(int i = 0; i <size; i++){
            arrayChar[i] = letter2;
            letter2-=2;
            i=i++;
        }
        System.out.println(Arrays.toString(arrayChar));


    }

}
