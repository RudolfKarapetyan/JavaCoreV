package homework.employee;

import com.sun.org.apache.xpath.internal.objects.XString;

import java.util.Scanner;

public class EmployeeDemo {
    static Scanner scanner = new Scanner(System.in);
    static EmployeeStorage employeeStorage = new EmployeeStorage();

    public static void main(String[] args) {

        boolean isRun = true;

        while (isRun) {
            System.out.println("Please input 0 for exit ");
            System.out.println("Please input 1 add employee ");
            System.out.println("Please input 2 print all employee ");
            System.out.println("Please input 3 search employee by employee ID ");
            System.out.println("Please input 4 search employee by company name ");
            System.out.println("Please input 5 for search employee by salary range ");
            System.out.println("Please input 6 for change employee position by id");
            System.out.println("Please input 7 for print only active employees");
            System.out.println("Please input 8 for inactive employee by id ");
            System.out.println("Please input 9 for activate employee by id ");
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
                case "5":
                    System.out.println("Please input the first number");
                    String firstNum = scanner.nextLine();
                    System.out.println("Please input the second number");
                    String secondNum = scanner.nextLine();
                    employeeStorage.searchBySalary(Double.parseDouble(firstNum), Double.parseDouble(secondNum));
                    break;
                case "6":
                    System.out.println("Please input employeeId");
                    String id = scanner.nextLine();
                    System.out.println("Please input new position");
                    String newPosition = scanner.nextLine();
                    employeeStorage.changeEmployeePositionById(id, newPosition);
                    break;
                case "7":
                    employeeStorage.printOnlyActiveEmployees();
                    break;
                case "8":
                    System.out.println("Please input employeeId");
                    String employeeId = scanner.nextLine();
                    employeeStorage.inactiveEmployeeById(employeeId);
                    break;
                case "9":
                    System.out.println("Please input employeeId");
                    String idEmployee = scanner.nextLine();
                    employeeStorage.activateEmployeeById(idEmployee);
                    break;
                default:
                    System.out.println("Wrong command. Please try again.");
                    break;
            }
        }
    }
}
