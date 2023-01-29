package homework.homework10;

public class Stack {
    private int[] array = new int[10];
    private int size;

    public Stack() {
        size = -1;
    }

    public void push(int value) {
        if (size == array.length) {
            System.out.println("Stack full");
        } else {
            array[++size] = value;
        }
    }

    public int pop() {
        if (size < 0) {
            System.out.println("The stack is empty");
            return 0;
        } else {
            return array[size--];
        }
    }

    public int arrayLastElement() {
        if (size < 0 || size > array.length - 1) {
            return -1;
        } else {
            return array[size];
        }
    }

    public int arrayLastElementIndex() {
        return size;
    }
}
