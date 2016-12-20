
public class arrays {
    public static void main(String[] args) {
        int[] array = {-7, 6, 9, 23, -14};
        for (int i = 0; i < array.length; i++) {
            System.out.println("\n " + array[i]);
        }

        int aa = doAverage (array);
        System.out.println("среднее значение" + aa);

        int bb = doMin (array);
        System.out.println("\n минимум " + bb);

        int cc = doMax(array);
        System.out.println("\n максимум " + cc);



        Reverse(array);
        for (int i = 0; i < array.length; i++){
            System.out.println("\n " + array[i]);
        }
    }

    public static int doAverage (int[] array) {
        int a = 0;
        for (int i = 0; i < array.length; i++) {
            a = a + array[i];
        }
        a = a / array.length;
        return a;
    }

    public static int doMin ( int[]array) {
        int max = array[0];
        int min = array[0];
        for (int i = 0; i != array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static int doMax ( int[] array) {
                int max = array[0];
                int min = array[0];
                for (int i = 0; i != array.length; i++) {
                    if (array[i] > max) {
                        max = array[i];
                    }
                    if (array[i] < min) {
                        min = array[i];
                    }
                }
                return max;
            }

    public static int  Reverse ( int[]array) {
        int b =0;
        for(int i=0;i<array.length /2;i++)
        {
            b=array[i];
            array[i]=array[array.length-i-1];
            array[array.length -i-1]=b;
        }
        return b;
    }
}


