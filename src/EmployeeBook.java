import java.util.ArrayList;
import java.util.Iterator;

public class EmployeeBook {
    private final ArrayList<Employee> base = new ArrayList<>();

    public void addEmloyee(Employee employee) {
        base.add(employee);
    }

    public void addEmloyee(String fullName, int department, int salary) {
        Employee employee = new Employee(fullName, department, salary);
        base.add(employee);
    }

    public void removeEmployee(Employee employee) {
        base.remove(employee);

    }

    public void removeEmployee(String fullName) {
        Iterator<Employee> iterator = base.iterator();
        while (iterator.hasNext()) {
            Employee employee = iterator.next();
            if (fullName.equals(employee.getFullName())) {
                iterator.remove();
            }
        }

    }

    public void removeEmployee(int id) {
        Iterator<Employee> iterator = base.iterator();
        while (iterator.hasNext()) {
            Employee employee = iterator.next();
            if (id == employee.getId()) {
                iterator.remove();
            }
        }
    }


    public ArrayList<Employee> getBase() {
        return base;
    }

    public void printBase() {
        for (Employee employee : base) {
            System.out.println(employee);
        }
    }

    public void printEmployeeNames() {
        for (Employee employee : base) {
            System.out.println(employee.getFullName());
        }
    }

    public int summarizeSalaries() {
        int sum = 0;
        for (Employee employee : base) {
            sum = sum + employee.getSalary();
        }
        return sum;
    }

    public Employee findMinSalaryEmployee() {
        Employee minSalaryEmployee = base.get(0);
        for (int i = 1; i < base.size(); i++) {
            Employee employee = base.get(i);
            if (employee.getSalary() < minSalaryEmployee.getSalary()) {
                minSalaryEmployee = employee;
            }
        }
        return minSalaryEmployee;
    }

    public Employee findMaxSalaryEmployee() {
        Employee maxSalaryEmployee = base.get(0);
        for (int i = 1; i < base.size(); i++) {
            Employee employee = base.get(i);
            if (employee.getSalary() > maxSalaryEmployee.getSalary()) {
                maxSalaryEmployee = employee;
            }
        }
        return maxSalaryEmployee;
    }

    public double calculateAverageSalary() {
        int sum = 0;
        for (Employee employee : base) {
            sum = sum + employee.getSalary();
        }
        return sum / base.size();
    }

    public void indexSalaries(int percent) {
        for (Employee employee : base) {
            employee.setSalary(employee.getSalary() + employee.getSalary() * percent / 100);

        }
    }

    public void printDepartmentBase(int department) {
        for (Employee employee : base) {
            if (employee.getDepartment() == department) {
                System.out.println(employee.getFullName() + ", зарплата: " + employee.getSalary());
            }

        }
    }

    public int summarizeDepartmentSalaries(int department) {
        int sum = 0;
        for (Employee employee : base) {
            if (employee.getDepartment() == department) {
                sum = sum + employee.getSalary();
            }
        }
        return sum;
    }

    public Employee findMinSalaryDepartmentEmployee(int department) {
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

    public Employee findMaxSalaryDepartmentEmployee(int department) {
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

    public double calculateAverageDepartmentSalary(int department) {
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

    public void indexDepartmentSalaries(int department, int percent) {
        for (Employee employee : base) {
            if (employee.getDepartment() == department) {
                employee.setSalary(employee.getSalary() + employee.getSalary() * percent / 100);
            }
        }
    }

    public void findEmployeesWithLessSalary(int salary) {
        System.out.println("Сотрудники с зарплатой меньшей, чем "+ salary);
        for (Employee employee: base)
            if(employee.getSalary() < salary) {
                System.out.println(employee.getId() + " " + employee.getFullName() + ", зарплата: " + employee.getSalary());
            }
    }

    public void findEmployeesWithMoreSalary(int salary) {
        System.out.println("Сотрудники с зарплатой большей или равной "+ salary);
        for (Employee employee: base)
            if(employee.getSalary() >= salary) {
                System.out.println(employee.getId() + " " + employee.getFullName() + ", зарплата: " + employee.getSalary());
            }
    }


}



