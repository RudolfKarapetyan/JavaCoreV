package chapter6.stack;

public class TestStack {
    public static void main(String[] args) {
        Stack myStack1 = new Stack();
        Stack myStack2 = new Stack();

        for (int i = 0, j = 10; i < 10; i++, j++) {
            myStack1.push(i);
            myStack2.push(j);
        }
        System.out.println("Содержимое стека myStack1: ");
        for (int i = 0; i <= 20; i++) {
            if (i < 10) {
                System.out.println(myStack1.pop());
            } else if (i == 10) {
                System.out.println("Содержимое стека myStack2: ");
            } else {
                System.out.println(myStack2.pop());
            }
        }
    }
}
