package homework.homework2;

public class ArrayUtil {
    public static void main(String[] args) {
        int[] array = {2, 43, 54, 25, 74, 3, 56, 7, 4, 1};
        //Home-work 2
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("\n");



        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]){
                max = array[i];
            }
        }
        System.out.println(max);
        System.out.println("\n");



        int min = max;
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]){
                min = array[i];
            }
        }
        System.out.println(min);
        //Home-work 3
        int numEvenNum = 0, numOddNum = 0, elementSum = 0;
        System.out.print("Մասիվի բոլոր զույգ էլեմենտները: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
                numEvenNum++;
                elementSum += array[i];
            }
        }
        System.out.print("\nՄասիվի բոլոր կենտ էլեմենտները։ ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {
                System.out.print(array[i] + " ");
                numOddNum++;
                elementSum+= array[i];
            }
        }
        System.out.println("\nԶույգերի քանակը: " + numEvenNum);
        System.out.println("Կենտերի քանակը: " + numOddNum);
        System.out.println("Մասիվի բոլոր թվերի միջին թվաբանականը: " + (elementSum / array.length));
        System.out.println("Մասիվի էլեմենտների գումարը։ " + elementSum);
        System.out.println("Մասիվի առաջին էլեմենտը: " + array[0]);
        System.out.println("Մասիվի վերջին էլեմենտը։ " + (array.length - 1));
        System.out.println("Մասիվի մեջտեղի էլեմենտը։ " + array[((array.length - 1) / 2)]);
    }
}
