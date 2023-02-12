import java.util.ArrayList;

public class EmployeeBook {
    private static final ArrayList<Employee> base = new ArrayList<>();

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

    public static void printEmployeeNames() {
        for (Employee employee : base) {
            System.out.println(employee.getFullName());
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
            if (employee.getSalary() < minSalaryEmployee.getSalary()) {
                minSalaryEmployee = employee;
            }
        }
        return minSalaryEmployee;
    }

    public static Employee findMaxSalaryEmployee() {
        Employee maxSalaryEmployee = base.get(0);
        for (int i = 1; i < base.size(); i++) {
            Employee employee = base.get(i);
            if (employee.getSalary() > maxSalaryEmployee.getSalary()) {
                maxSalaryEmployee = employee;
            }
        }
        return maxSalaryEmployee;
    }

    public static double calculateAverageSalary() {
        int sum = 0;
        for (Employee employee : base) {
            sum = sum + employee.getSalary();
        }
        return sum / base.size();
    }

    public static void indexSalaries(int percent) {
        for (Employee employee : base) {
            employee.setSalary(employee.getSalary() + employee.getSalary() * percent / 100);

        }
    }

    public static void printDepartmentBase(int department) {
        for (Employee employee : base) {
            if (employee.getDepartment() == department) {
                System.out.println(employee.getFullName() + ", зарплата: " + employee.getSalary());
            }

        }
    }

    public static int summarizeDepartmentSalaries(int department) {
        int sum = 0;
        for (Employee employee : base) {
            if (employee.getDepartment() == department) {
                sum = sum + employee.getSalary();
            }
        }
        return sum;
    }

    public static Employee findMinSalaryDepartmentEmployee(int department) {
        ArrayList<Employee> departmentBase = new ArrayList<>();
        for (Employee employee : base) {
            if (employee.getDepartment() == department) {
                departmentBase.add(employee);
            }
        }
        Employee minSalaryDepartmentEmployee = departmentBase.get(0);
        for (int i = 1; i < departmentBase.size(); i++) {
            Employee employee = departmentBase.get(i);
            if (employee.getSalary() < minSalaryDepartmentEmployee.getSalary()) {
                minSalaryDepartmentEmployee = employee;
            }

        }
        return minSalaryDepartmentEmployee;
    }

    public static Employee findMaxSalaryDepartmentEmployee(int department) {
        ArrayList<Employee> departmentBase = new ArrayList<>();
        for (Employee employee : base) {
            if (employee.getDepartment() == department) {
                departmentBase.add(employee);
            }
        }
        Employee maxSalaryDepartmentEmployee = departmentBase.get(0);
        for (int i = 1; i < departmentBase.size(); i++) {
            Employee employee = departmentBase.get(i);
            if (employee.getSalary() > maxSalaryDepartmentEmployee.getSalary()) {
                maxSalaryDepartmentEmployee = employee;
            }

        }
        return maxSalaryDepartmentEmployee;
    }

    public static double calculateAverageDepartmentSalary(int department) {
        ArrayList<Employee> departmentBase = new ArrayList<>();
        for (Employee employee : base) {
            if (employee.getDepartment() == department) {
                departmentBase.add(employee);
            }
        }
        int sum = 0;
        for (Employee employee : departmentBase) {
            sum = sum + employee.getSalary();
        }
        return sum / base.size();
    }

    public static void indexDepartmentSalaries(int department, int percent) {
        for (Employee employee : base) {
            if (employee.getDepartment() == department) {
                employee.setSalary(employee.getSalary() + employee.getSalary() * percent / 100);
            }
        }
    }

    public static void findEmployeesWithLessSalary(int salary) {
        System.out.println("Сотрудники с зарплатой меньшей, чем "+ salary);
        for (Employee employee: base)
            if(employee.getSalary() < salary) {
                System.out.println(employee.getId() + " " + employee.getFullName() + ", зарплата: " + employee.getSalary());
            }
    }

    public static void findEmployeesWithMoreSalary(int salary) {
        System.out.println("Сотрудники с зарплатой большей или равной "+ salary);
        for (Employee employee: base)
            if(employee.getSalary() >= salary) {
                System.out.println(employee.getId() + " " + employee.getFullName() + ", зарплата: " + employee.getSalary());
            }
    }


}



