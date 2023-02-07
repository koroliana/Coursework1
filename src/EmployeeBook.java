import java.util.ArrayList;

public class EmployeeBook {
    private static final ArrayList <Employee> base = new ArrayList<>();

    public static void addEmloyee(Employee employee) {
        base.add(employee);
    }

    public static void addEmloyee(String fullName, int department, int salary) {
        Employee employee = new Employee(fullName, department, salary);
        base.add(employee);
    }

    public static ArrayList<Employee> getBase() {
        return base;
    }

    public static void printBase() {
        for (Employee employee : base) {
            System.out.println(employee);
        }
    }

    public static int summarizeSalaries() {
        int sum = 0;
        for (Employee employee : base) {
            sum = sum + employee.getSalary();
        }
        return sum;
    }

    public static Employee findMinSalaryEmployee() {
        Employee minSalaryEmployee = base.get(0);
        for (int i = 1; i < base.size(); i++) {
            Employee employee = base.get(i);
            if(employee.getSalary() < minSalaryEmployee.getSalary()) {
                minSalaryEmployee = employee;
            }
        }
        return minSalaryEmployee;
    }


}

