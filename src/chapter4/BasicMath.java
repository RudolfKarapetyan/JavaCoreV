package chapter4;

public class BasicMath {
    public static void main(String[] args) {
        System.out.println("Цeлoчислeннaя арифметика");
        int a = 1 + 1, b = a * 3, c = b / 4, d = c - a, e = -d;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);

        System.out.println("\nApифмeтикa с плавающей точкой");
        double da = 1 + 1, db = da * 3, dc = db / 4, dd = dc - da, de = -dd;
        System.out.println("da = " + da);
        System.out.println("db = " + db);
        System.out.println("dc = " + dc);
        System.out.println("dd = " + dd);
        System.out.println("de = " + de);
    }
}
