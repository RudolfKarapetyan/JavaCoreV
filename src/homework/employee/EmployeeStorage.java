package homework.employee;


import java.util.Locale;

public class EmployeeStorage {

    private Employee[] array = new Employee[10];
    private int size = 0;

    public void add(Employee value) {
        if (size == array.length) {
            extend();
        }
        array[size++] = value;
    }

    private void extend() {
        Employee tmp[] = new Employee[array.length + 10];
        for (int i = 0; i < array.length; i++) {
            tmp[i] = array[i];
        }
        array = tmp;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(array[i] + " ");
        }
        System.out.println();
    }

    public boolean employeeIdVerification(String employeeID) {
        boolean tmp = true;
        if (size > 0) {
            for (int i = 0; i < size; i++) {
                if (array[i].getEmployeeID().equals(employeeID)) {
                    System.out.println("Error: this employeeID busy");
                    tmp = false;
                    return tmp;
                }
            }
        }
        return tmp;
    }

    public void searchByEmployeeID(String employeeID) {
        for (int i = 0; i < size; i++) {
            Employee employee = array[i];
            if (employee.getEmployeeID().toLowerCase().contains(employeeID.toLowerCase())) {
                System.out.println(employee);
            }
        }
    }

    public void companyEmployees(String keyword2) {
        for (int i = 0; i < size; i++) {
            Employee employee = array[i];
            if (employee.getCompany().toLowerCase().contains(keyword2.toLowerCase())) {
                System.out.println(employee.getName() + " " + employee.getSurname());
            }
        }
    }

    public void searchBySalary(double num1, double num2) {
        for (int i = 0; i < size; i++) {
            Employee employee = array[i];
            if (num2 > employee.getSalary() && num1 < employee.getSalary()) {
                System.out.println(array[i]);
            }
        }
    }

    public void changeEmployeePositionById(String employeeId, String newPosition) {
        for (int i = 0; i < size; i++) {
            Employee employee = array[i];
            if (employee.getEmployeeID().equals(employeeId)) {
                employee.setPosition(newPosition);
            }
        }
    }

    public void printOnlyActiveEmployees() {
        for (int i = 0; i < size; i++) {
            Employee employee = array[i];
            if (employee.isActive() == true) {
                System.out.println(array[i]);
            }
        }
    }

    public void inactiveEmployeeById(String id) {
        for (int i = 0; i < size; i++) {
            Employee employee = array[i];
            if (employee.getEmployeeID().toLowerCase().contains(id.toLowerCase())) {
                if (employee.isActive() == true) {
                    employee.setActive(false);
                }
            }
        }
    }

    public void activateEmployeeById(String id) {
        for (int i = 0; i < size; i++) {
            Employee employee = array[i];
            if (employee.getEmployeeID().toLowerCase().contains(id.toLowerCase())) {
                if (employee.isActive() == false) {
                    employee.setActive(true);
                }
            }
        }
    }
}
