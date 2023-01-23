package homework.homework8;

public class DynamicArrayDemo {
    public static void main(String[] args) {
        DynamicArray dy = new DynamicArray();
        dy.add(8);
        dy.add(88);
        dy.add(888);
        System.out.println(dy.getByIndex(10));
        System.out.println(dy.getByIndex(2));
        dy.print();
    }
}
