package chapter5;

public class ForVar {
    public static void main(String[] args) {
        int i = 0;
        boolean done = false;
        for (; !done; i++) {
            System.out.println("i = " + i);
            if (i == 10) {
                done = true;
            }
        }
    }
}
