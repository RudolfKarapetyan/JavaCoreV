package homework.homework8;

public class DynamicArrayDemo {
    public static void main(String[] args) {
        DynamicArray dy = new DynamicArray();
        dy.add(8);
        dy.add(5);
        dy.add(6);
        dy.add(12);
        dy.add(34);
        dy.add(4);
        dy.add(1);
        dy.print();
        dy.add(5, 3);
        dy.add(3, 3);
        dy.print();
        System.out.println(dy.getByIndex(2));
        System.out.println(dy.getByIndex(-8));
        dy.deleteByIndex(5);
        dy.print();
        dy.set(0, 34);
        dy.print();
        System.out.println(dy.exists(1));
        System.out.println(dy.getIndexByValue(12));
    }
}
