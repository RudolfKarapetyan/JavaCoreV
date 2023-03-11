package homework.Collection;

import java.util.ArrayList;
import java.util.Scanner;

public class CollectionExample1 implements Commands {
    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<String> nameList = new ArrayList<>();

    public static void main(String[] args) {
        nameList.add("Poxos");
        nameList.add("Petros");
        nameList.add("Martiros");
        nameList.add("Kirakos");
        nameList.add("Matevos");
        boolean isRun = true;
        while (isRun) {
            printCommands();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case SEARCH_NAME_BY_NAME:
                    searchNameByName();
                    break;
                case DELETED_NAME_BY_NAME:
                    deletedNameByName();
                    break;
                case ADD_NAME_WITH_INDEX:
                    addNameWithIndex();
                    break;
                case PRINT:
                    printNames();
                    break;
                default:
                    System.out.println("Wrong command! Please try again.");
                    break;
            }
        }
    }

    private static void printNames() {
        for (String names : nameList) {
            System.out.println(names);
        }
    }

    private static void addNameWithIndex() {
        System.out.println("Please input name,index");
        String data = scanner.nextLine();
        String[] dataArray = data.split(",");
        try {
            nameList.add(Integer.parseInt(dataArray[1]), dataArray[0]);
            System.out.println("Name added!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("You entered little data");
        } catch (NumberFormatException e) {
            System.out.println("Please input number index(e.g. 0,1,2...)");
        }
    }

    private static void deletedNameByName() {
        System.out.println("Please input name");
        String name = scanner.nextLine();
        if (nameList.remove(name)) {
            System.out.println("Name deleted!");
            for (String names : nameList) {
                System.out.println(names);
            }
            return;
        }
        System.out.println("No such name found");
    }

    private static boolean searchNameByName() {
        System.out.println("Please input name");
        String name = scanner.nextLine();
        for (String names : nameList) {
            if (names.toLowerCase().equals(name.toLowerCase())) {
                System.out.println("This name is found");
                return true;
            }
        }
        System.out.println("No such name found");
        return false;
    }

    private static void printCommands() {
        System.out.println("Please input " + EXIT + " for exit");
        System.out.println("Please input " + SEARCH_NAME_BY_NAME + " for search name by name");
        System.out.println("Please input " + DELETED_NAME_BY_NAME + " for delete name by name");
        System.out.println("Please input " + ADD_NAME_WITH_INDEX + " for add name");
        System.out.println("Please input " + PRINT + " for print names");
    }
}
