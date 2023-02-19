package homework.employee.model;

import homework.employee.util.DateUtil;

import java.util.Date;
import java.util.Objects;

public class Employee {
    String name;
    String surname;
    String employeeId;
    double salary;
    String company;
    String position;
    boolean active = true;
    private Date registerDate;
    private Date dateOfBirthday;

    public Employee(String name, String surname, String employeeId, double salary, String company, String position, Date registerDate, Date dateOfBirthday) {
        this.name = name;
        this.surname = surname;
        this.employeeId = employeeId;
        this.salary = salary;
        this.company = company;
        this.position = position;
        this.registerDate = registerDate;
        this.dateOfBirthday = dateOfBirthday;
    }

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    public Date getDateOfBirthday() {
        return dateOfBirthday;
    }

    public void setDateOfBirthday(Date dateOfBirthday) {
        this.dateOfBirthday = dateOfBirthday;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee2 = (Employee) o;

        if (Double.compare(employee2.salary, salary) != 0) return false;
        if (active != employee2.active) return false;
        if (!Objects.equals(name, employee2.name)) return false;
        if (!Objects.equals(surname, employee2.surname)) return false;
        if (!Objects.equals(employeeId, employee2.employeeId)) return false;
        if (!Objects.equals(company, employee2.company)) return false;
        if (!Objects.equals(position, employee2.position)) return false;
        if (!Objects.equals(registerDate, employee2.registerDate))
            return false;
        return Objects.equals(dateOfBirthday, employee2.dateOfBirthday);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name != null ? name.hashCode() : 0;
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        result = 31 * result + (employeeId != null ? employeeId.hashCode() : 0);
        temp = Double.doubleToLongBits(salary);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (company != null ? company.hashCode() : 0);
        result = 31 * result + (position != null ? position.hashCode() : 0);
        result = 31 * result + (active ? 1 : 0);
        result = 31 * result + (registerDate != null ? registerDate.hashCode() : 0);
        result = 31 * result + (dateOfBirthday != null ? dateOfBirthday.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Employee2{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", employeeId='" + employeeId + '\'' +
                ", salary=" + salary +
                ", company='" + company + '\'' +
                ", position='" + position + '\'' +
                ", active=" + active +
                ", registerDate=" + DateUtil.dateOToString(registerDate) +
                ", dateOfBirthday=" + DateUtil.dateOToString(dateOfBirthday) +
                '}';
    }
}
