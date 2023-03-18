package homework.Collection;

import java.util.List;
import java.util.Set;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.TreeSet;
import java.util.HashSet;

public class CollectionExample2 implements Commands2 {
    private static List<String> names = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean isRun = true;
        start();
        while (isRun) {
            printCommand();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case PRINT:
                    print();
                    break;
                case PRINT_SORT:
                    printSort();
                    break;
                default:
                    System.out.println("Wrong command! Please try again.");
                    break;
            }
        }
    }

    private static void printSort() {
        Set<String> nameSort = new TreeSet<>();
        for (String name : names) {
            nameSort.add(name);
        }
        for (String name : nameSort) {
            System.out.println(name);
        }
    }

    private static void print() {
        Set<String> namesHashSet = new HashSet<>();
        for (String name : names) {
            namesHashSet.add(name);
        }
        for (String name : namesHashSet) {
            System.out.println(name);
        }
    }

    private static void start() {
        System.out.println("Please input names (e.g. Poxos,Petros,Martiros...)");
        String namesScanner = scanner.nextLine();
        String[] namesArray = namesScanner.split(",");
        for (String namesTmp : namesArray) {
            names.add(namesTmp);
        }
    }

    private static void printCommand() {
        System.out.println("Please input " + EXIT + " for exit");
        System.out.println("Please input " + PRINT + " for print");
        System.out.println("Please input " + PRINT_SORT + " for sort");
    }
}
