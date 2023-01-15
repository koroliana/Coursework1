import java.util.ArrayList;

public class EmployeeBook {
    private static ArrayList <Employee> base = new ArrayList <Employee>();

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

    public static void printBase () {
        for (int i = 0; i < base.size(); i++) {
            System.out.println(base.get(i));
        }
    }


}

