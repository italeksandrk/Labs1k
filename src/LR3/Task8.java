package LR3;
import java.util.Arrays;
import java.util.Scanner;
public class Task8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int size = 10;
        char[] arrayChar = new char[size];
        char letter = 'A';
        int i = 0;

        while (i < size){
            if (letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U') {
                letter++;

            } else {
                arrayChar[i] = letter;
                letter++;
                i++;
            }
        }
        System.out.println(Arrays.toString(arrayChar));
    }
}

