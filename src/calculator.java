import java.util.Scanner;

/**
 * Created by user on 20.12.16.
 */
public class calculator {
    public static void main(String [] args) {
        System.out.println("Enter numbers");
        Scanner in = new Scanner(System.in);
    }

    public static double doPlus (int a, int b) {
        int c = a + b;
        return c;
    }

    public static double doMinus (int a, int b) {
        int c;
        c = a - b ;
        return c;
    }

    public static double doDevide (int a, int b) {
        int c;
        c = a * b;
        return c;
    }

    public static double doMultiply (int a, int b) {
         int c;
         c = a / b;
         return c;
     }

    public static void doSwitch (int a, int b) {
//        case
    }



}
