public class Employee {
    static int id = 0;
    private String fullName;
    private byte department;
    private int salary;

    public Employee(String fullName, byte department, int salary) {
        id = id + 1;
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
    }

    public static int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public byte getDepartment() {
        return department;
    }

    public void setDepartment(byte department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
