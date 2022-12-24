package homework.homework2;

public class ArrayUtil {
    public static void main(String[] args) {
        int[] array = {2,43,54,25,74,3,56,7,4,1};

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("\n");
        //
        //
        //
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]){
                max = array[i];
            }
        }
        System.out.println(max);
        System.out.println("\n");
        //
        //
        //
        int min = max;
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]){
                min = array[i];
            }
        }
        System.out.println(min);
    }
}
