package homework.employee.storage;

import homework.employee.model.Employee;

public class EmployeeStorage {
    private Employee[] employees = new Employee[10];
    private int size = 0;

    public void add(Employee employee) {
        if (size == employees.length) {
            extend();
        }
        employees[size++] = employee;
    }

    private void extend() {
        Employee[] tmp = new Employee[employees.length + 10];
        for (int i = 0; i < size; i++) {
            tmp[i] = employees[i];
        }
        employees = tmp;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i]);
        }
    }

    public Employee getEmployeeById(String id) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeId().toLowerCase().contains(id.toLowerCase())) {
                return employees[i];
            }
        }
        return null;
    }

    public void searchEmployeeByCompanyName(String companyName) {
        if (companyName != null) {
            Employee[] tmp = new Employee[10];
            for (int i = 0; i < size; i++) {
                if (employees[i].getCompany().toLowerCase().contains(companyName.toLowerCase())) {
                    System.out.println(employees[i]);
                }
            }
        }
    }

    public void searchEmployeeBySalaryRange(double min, double max) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getSalary() <= max && employees[i].getSalary() >= min){
                System.out.println(employees[i]);
            }
        }
    }

    public void inactivateEmployeeById(Employee tmp) {
        if (tmp.isActive() == false){
            System.out.println("Employee no longer active");
        }
        tmp.setActive(false);
    }

    public void activateEmployeeById(Employee tmp) {
        if (tmp.isActive() == true){
            System.out.println("Employee already active");
        }
        tmp.setActive(true);
    }

    public void printOnlyActiveEmployee() {
        for (int i = 0; i < size; i++) {
            if (employees[i].isActive() == true){
                System.out.println(employees[i]);
            }
        }
    }

    public void changeEmployeePositionById(String id,String newPosition) {
        Employee tmp = getEmployeeById(id);
        if (tmp != null){
            tmp.setPosition(newPosition);
        }else {
            System.out.println("Wrong employee id");
        }
    }
}
