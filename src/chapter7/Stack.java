package chapter7;

public class Stack {
    private int stck[] = new int[10];
    private int tos;

    Stack() {
        tos = -1;
    }

    void push(int item) {
        if (tos == 9) {
            System.out.println("Full stack");
        } else {
            stck[++tos] = item;
        }
    }

    int pop(){
        if (tos < -1){
            System.out.println("Stack is not full");
            return 0;
        }else {
            return stck[tos--];
        }
    }
}
