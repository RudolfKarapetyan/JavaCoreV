package chapter2;

public class IfSample {
    public static void main(String[] args) {
        int x = 10, y = 20;
        if (x < y) {
            System.out.println("x меньше y");
        }
        x *= 2;
        if (x == y) {
            System.out.println("x терерь равен y");
        }
        x *= 2;
        if (x > y) {
            System.out.println("x теперь равен y");
        }
        if (x == y) {
            System.out.println("Это не будет видно");
        }
    }
}
