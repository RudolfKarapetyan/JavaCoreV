package homework.homework5;

public class ArraySort {
    public static void main(String[] args) {
        int[] numbers = {43, 55, 5, -9, 0, 12, 5, 65,};
        int stock = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) { //Для того что бы сделать от маленького к большому нужно изменить > на <.
                    stock = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = stock;
                }
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
