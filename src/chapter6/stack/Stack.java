package chapter6.stack;

public class Stack {
    int stck[] = new int[10];
    int tos;

    Stack() {
        tos = -1;
    }

    void push(int item) {
        if (tos == 9) {
            System.out.println("Стек заполнен");
        } else {
            stck[++tos] = item;
        }
    }

    int pop() {
        if (tos < 0) {
            System.out.println("Стек не заполнен");
            return 0;
        } else {
            return stck[tos--];
        }
    }
}
