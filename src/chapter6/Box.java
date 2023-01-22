package chapter6;

public class Box {
    double width;
    double height;
    double depth;

    double volume() {
        return width * height * depth;
    }

    Box() {
        System.out.println("Конструктор объекта Box");
        width = 10;
        height = 20;
        depth = 15;
    }

    Box(double w, double h, double d) {
        System.out.println("Конструктор объекта Box");
        this.width = w;
        this.height = h;
        this.depth = d;
    }

    void setDim(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

}
