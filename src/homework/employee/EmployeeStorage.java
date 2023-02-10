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
}
