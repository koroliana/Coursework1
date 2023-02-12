public class Employee {
    private static int counterId = 0;
    private final int id;
    private String fullName;
    private int department;
    private int salary;

    public Employee(String fullName, int department, int salary) {
        this.id=counterId +1;
        counterId++;
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return fullName + ", отдел: " + department + ", зарплата: " + salary;
    }
    public int getId() {
        return id;
    }

    public static int getCounterId() {
        return counterId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getDepartment() {
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
