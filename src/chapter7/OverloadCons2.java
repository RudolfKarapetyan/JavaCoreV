package chapter7;

public class OverloadCons2 {
    public static void main(String[] args) {
        Box myBox1 = new Box(10, 20, 15);
        Box myBox2 = new Box(7);
        Box myBox3 = new Box();
        Box myClone = new Box(myBox1);
        double vol;
        vol = myBox1.volume();
        System.out.println("Объём равен myBox1: " + vol);
        vol = myBox2.volume();
        System.out.println("Объём равен myBox2: " + vol);
        vol = myBox3.volume();
        System.out.println("Объём равен myBox2: " + vol);
        vol = myClone.volume();
        System.out.println("Объём равен myClone: " + vol);
    }
}
