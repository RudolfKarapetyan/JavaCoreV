package chapter7;

public class OverloadCons {
    public static void main(String[] args) {
        Box myBox1 = new Box(10, 20, 15);
        Box myBox2 = new Box(7);
        Box myBox3 = new Box();
        double vol;
        vol = myBox1.volume();
        System.out.println("Объём равен " + vol);
        vol = myBox2.volume();
        System.out.println("Объём равен " + vol);
        vol = myBox3.volume();
        System.out.println("Объём равен " + vol);
    }
}
