package homework.homework6;

public class ArrayUtil {
    void maxOfArray(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Самое большое число: " + max);
    }

    void minOfArray(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println("Самое маленькое число: " + min);
    }

    void evenNum(int[] array) {
        System.out.print("Մասիվի բոլոր զույգ էլեմենտները: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
    }

    void oddNum(int[] array) {
        System.out.print("Մասիվի բոլոր կենտ էլեմենտները։ ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
    }

    void numOfEvenNum(int[] array) {
        int numOfEvenNum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                numOfEvenNum++;
            }
        }
        System.out.println("Զույգերի քանակը: " + numOfEvenNum);
    }

    void numOfOddNum(int[] array) {
        int numOfOddNum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                numOfOddNum++;
            }
        }
        System.out.println("Կենտերի քանակը: " + numOfOddNum);
    }

    void arithmeticAverage(int[] array) {
        int elementSum = 0;
        for (int i = 0; i < array.length; i++) {
            elementSum += array[i];
        }
        System.out.println("Մասիվի բոլոր թվերի միջին թվաբանականը: " + (elementSum / array.length));
    }

    void sumOfElementArray(int[] array) {
        int elementSum = 0;
        for (int i = 0; i < array.length; i++) {
            elementSum += array[i];
        }
        System.out.println("Մասիվի էլեմենտների գումարը։ " + elementSum);
    }

    void firstNumInArray(int[] array) {
        System.out.println("Մասիվի առաջին էլեմենտը: " + array[0]);
    }

    void lastNumInArray(int[] array) {
        System.out.println("Մասիվի վերջին էլեմենտը։ " + (array.length - 1));
    }

    void middleNumInArray(int[] array) {
        System.out.println("Մասիվի մեջտեղի էլեմենտը։ " + array[((array.length - 1) / 2)]);
    }
}
