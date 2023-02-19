package homework.employee;

import homework.employee.model.Employee;
import homework.employee.storage.EmployeeStorage;
import homework.employee.util.DateUtil;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class EmployeeDemo implements employeeUtil {
    private static Scanner scanner = new Scanner(System.in);
    private static EmployeeStorage employeeStorage = new EmployeeStorage();

    public static void main(String[] args) throws ParseException {
        boolean isRun = true;
        while (isRun) {
            printCommand();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case NEW_EMPLOYEE:
                    newEmployee();
                    break;
                case PRINT_EMPLOYEE:
                    employeeStorage.print();
                    break;
                case SEARCH_EMPLOYEE_BY_ID:
                    searchEmployeeById();
                    break;
                case SEARCH_EMPLOYEE_BY_COMPANY_NAME:
                    searchEmployeeByCompanyName();
                    break;
                case SEARCH_EMPLOYEE_BY_SALARY_RANGE:
                    searchEmployeeBySalaryRange();
                    break;
                case CHANGE_EMPLOYEE_POSITION_BY_ID:
                    changeEmployeePositionById();
                    break;
                case PRINT_ONLY_ACTIVE_EMPLOYEE:
                    employeeStorage.printOnlyActiveEmployee();
                    break;
                case INACTIVATE_EMPLOYEE_BY_ID:
                    inactivateEmployeeById();
                    break;
                case ACTIVATE_EMPLOYEE_BY_ID:
                    activateEmployeeById();
                    break;
                default:
                    System.out.println("Wrong command! Please try again!");
                    break;
            }
        }
    }

    private static void changeEmployeePositionById() {
        System.out.println("Please input employee id,new position");
        String tmp1 = scanner.nextLine();
        String[] tmp = tmp1.split(",");
        employeeStorage.changeEmployeePositionById(tmp[0],tmp[1]);
    }

    private static void activateEmployeeById() {
        System.out.println("Please input employee id");
        String tmp = scanner.nextLine();
        if (employeeStorage.getEmployeeById(tmp) == null) {
            System.out.println("No results found");
            return;
        } else {
            employeeStorage.activateEmployeeById(employeeStorage.getEmployeeById(tmp));
        }
    }

    private static void inactivateEmployeeById() {
        System.out.println("Please input employee id");
        String tmp = scanner.nextLine();
        if (employeeStorage.getEmployeeById(tmp) == null) {
            System.out.println("No results found");
            return;
        } else {
            employeeStorage.inactivateEmployeeById(employeeStorage.getEmployeeById(tmp));
        }
    }

    private static void searchEmployeeBySalaryRange() {
        System.out.println("Please input minPrice,maxPrise");
        String tmp = scanner.nextLine();
        String[] tmp2 = tmp.split(",");
        if (Double.parseDouble(tmp2[1]) < Double.parseDouble(tmp2[0])) {
            System.out.println("Error min > max");
            return;
        }
        employeeStorage.searchEmployeeBySalaryRange(Double.parseDouble(tmp2[0]), Double.parseDouble(tmp2[1]));
    }

    private static void searchEmployeeByCompanyName() {
        System.out.println("Please input company name");
        String tmp = scanner.nextLine();
        employeeStorage.searchEmployeeByCompanyName(tmp);
    }

    private static void searchEmployeeById() {
        System.out.println("Please input employee id");
        String tmp = scanner.nextLine();
        if (employeeStorage.getEmployeeById(tmp) == null) {
            System.out.println("No results found");
        } else {
            System.out.println(employeeStorage.getEmployeeById(tmp));
        }
    }

    private static void newEmployee() throws ParseException {
        System.out.println("Please input name,surname,employeeId(e.g. A0001),salary,company,position,dateOfBirthday(e.g. 15/03/2023)");
        String information = scanner.nextLine();
        String[] informationArray = information.split(",");
        Employee tmp = employeeStorage.getEmployeeById(informationArray[2]);
        if (tmp == null) {
            Employee employee = new Employee(informationArray[0], informationArray[1], informationArray[2],
                    Double.parseDouble(informationArray[3]), informationArray[4], informationArray[5],
                    new Date(), DateUtil.stringToDate(informationArray[6]));
            employeeStorage.add(employee);
        }else {
            System.out.println("This id is busy");
        }
    }

    private static void printCommand() {
        System.out.println("Please input " + EXIT + " for exit ");
        System.out.println("Please input "+ NEW_EMPLOYEE + " add employee ");
        System.out.println("Please input "+ PRINT_EMPLOYEE + " print all employee ");
        System.out.println("Please input "+ SEARCH_EMPLOYEE_BY_ID + " search employee by employee ID ");
        System.out.println("Please input "+ SEARCH_EMPLOYEE_BY_COMPANY_NAME + " search employee by company name ");
        System.out.println("Please input "+ SEARCH_EMPLOYEE_BY_SALARY_RANGE + " for search employee by salary range ");
        System.out.println("Please input "+ CHANGE_EMPLOYEE_POSITION_BY_ID + " for change employee position by id");
        System.out.println("Please input "+ PRINT_ONLY_ACTIVE_EMPLOYEE + " for print only active employees");
        System.out.println("Please input "+ INACTIVATE_EMPLOYEE_BY_ID + " for inactive employee by id ");
        System.out.println("Please input "+ ACTIVATE_EMPLOYEE_BY_ID + " for activate employee by id ");
    }
}
