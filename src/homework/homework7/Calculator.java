package homework.homework7;

public class Calculator {
    void plus(double num1, double num2) {
        double result = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + result);
    }

    void minus(double num1, double num2) {
        double result = num1 - num2;
        System.out.println(num1 + " - " + num2 + " = " + result);
    }

    void divide(double num1, double num2) {
        double result = num1 * num2;
        System.out.println(num1 + " * " + num2 + " = " + result);
    }

    void multiply(double num1, double num2) {
        double result = num1 / num2;
        if (num2 == 0) {
            System.out.println("Թիվը 0 ի չի բաժանվում " + -1);
        } else {
            System.out.println(num1 + " / " + num2 + " = " + result);
        }
    }
}
