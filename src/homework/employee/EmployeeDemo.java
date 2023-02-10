package homework.employee;

import java.util.Scanner;

public class EmployeeDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmployeeStorage employeeStorage = new EmployeeStorage();
        boolean isRun = true;

        while (isRun) {
            System.out.println("0 for exit ");
            System.out.println("1 add employee ");
            System.out.println("2 print all employee ");
            System.out.println("3 search employee by employee ID ");
            System.out.println("4 search employee by company name ");
            String command = scanner.nextLine();
            switch (command) {
                case "0":
                    isRun = false;
                    break;
                case "1":
                    System.out.println("Please input name");
                    String name = scanner.nextLine();
                    System.out.println("Please input surname");
                    String surname = scanner.nextLine();
                    System.out.println("Please input employeeID(e.g. A0001)");
                    String employeeID = scanner.nextLine();
                    boolean tmp = employeeStorage.employeeIdVerification(employeeID);
                    while (!tmp) {
                        System.out.println("Please input employeeID(e.g. A0001)");
                        employeeID = scanner.nextLine();
                        tmp = employeeStorage.employeeIdVerification(employeeID);
                    }
                    System.out.println("Please input salary");
                    String salary = scanner.nextLine();
                    System.out.println("Please input company");
                    String company = scanner.nextLine();
                    System.out.println("Please input position");
                    String position = scanner.nextLine();
                    Employee employee = new Employee(name, surname, employeeID, Double.parseDouble(salary), company, position);
                    employeeStorage.add(employee);
                    System.out.println("Employee added");
                    break;
                case "2":
                    employeeStorage.print();
                    break;
                case "3":
                    System.out.println("Please input employeeID");
                    String keyword = scanner.nextLine();
                    employeeStorage.searchByEmployeeID(keyword);
                    break;
                case "4":
                    System.out.println("Please input company");
                    String keyword2 = scanner.nextLine();
                    employeeStorage.companyEmployees(keyword2);
                    break;
                default:
                    System.out.println("Wrong command. Please try again.");
            }
        }
    }
}
