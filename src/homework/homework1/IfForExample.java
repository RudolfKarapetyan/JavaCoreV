package homework.homework1;

public class IfForExample {
    public static void main(String[] args) {
        int a = 23, b = 44, x, y;
        if (a > b) {
            System.out.println("a > b");
            x = a;
            y = b;
        } else if (b > a) {
            System.out.println("b > a");
            x = b;
            y = a;
        } else {
            System.out.println("a = b");
            x = a;
            y = b;
        }
//
//
//
        System.out.println("\n");
        for (int i = y; i < x; i++) {
            System.out.println(i);
        }
        System.out.println("\n");
//
//
//
        System.out.println((char) a);
        System.out.println((char) b);
        System.out.println("\n");
//
//
//
        if (a == b) {
            System.out.println("a-ն հավասար է b-ին");
        } else {
            System.out.println("a-հավասար չէ b-ին");
        }
    }
}
