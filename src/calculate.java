import java.util.Scanner;

public class calculate {
    /**
     * Created by user on 15.12.16.
     */
    public static class calculator {


        public static double sum(int a, int b) {
            int x;
            x = a + b;
            return x;
        }

        public static double multiplication(int c, int d) {
            double y;
            y = c * d;
            return y;
        }

        public static double minus(double y, int z) {
            double n;
            n = y - z;
            return n;
        }

        public static double divide(double a, int b) {
            double t;
            t = a / b;
            return t;
        }

        public static void main(String[] args) {
            System.out.println("Enter numbers");
            Scanner in = new Scanner(System.in);

            int a = in.nextInt();
            int b = in.nextInt();
            double m = sum(a, b);
            System.out.println("a + b = " + m);

            int c = in.nextInt();
            int d = in.nextInt();
            double p = multiplication(a, b);
            System.out.println("a * b = " + p);

            int z = in.nextInt();
            double u = minus(p, z);
            System.out.println(p + " - " + z + " = " + u);

            int r = in.nextInt();
            double t = divide(u, r);
            System.out.println(u + " / " + r + " = " + String.format("%,.3f", t));

        }

    }

}