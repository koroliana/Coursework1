import java.util.ArrayList;

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
        base.removeIf(employee -> fullName.equals(employee.getFullName()));
    }

    public void removeEmployee(int id) {
        base.removeIf(employee -> id == employee.getId());
    }


    public ArrayList<Employee> getEmployees() {
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
        if(base.isEmpty()) {
            throw new RuntimeException("В базе нет сотрудников!");
        }
        else {
            Employee minSalaryEmployee = base.get(0);
            for (int i = 1; i < base.size(); i++) {
                Employee employee = base.get(i);
                if (employee.getSalary() < minSalaryEmployee.getSalary()) {
                    minSalaryEmployee = employee;
                }
            }
            return minSalaryEmployee;
        }

    }

    public Employee findMaxSalaryEmployee() {
        if (base.isEmpty()) {
            throw new RuntimeException("В базе нет сотрудников!");
        }
        else {
            Employee maxSalaryEmployee = base.get(0);
            for (int i = 1; i < base.size(); i++) {
                Employee employee = base.get(i);
                if (employee.getSalary() > maxSalaryEmployee.getSalary()) {
                    maxSalaryEmployee = employee;
                }
            }
            return maxSalaryEmployee;
        }
    }

    public double calculateAverageSalary() {
        if (base.isEmpty()) {
            throw new RuntimeException("В базе нет сотрудников!");
        }
        else {
            int sum = 0;
            for (Employee employee : base) {
                sum = sum + employee.getSalary();
            }
            return sum / base.size();
        }
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

    public Employee findMinDepartmentSalaryEmployee(int department, int maxSalary) {
        if (maxSalary <= 0) {
            throw new RuntimeException("Максимальная зарплата в вашей компании должна быть больше нуля!");
        }
        else {
            boolean departmentIsEmpty = true;
            int minDepartmentSalary = maxSalary;
            Employee minDepartmentSalaryEmployee = null;
            for (Employee employee : base) {
                if (employee.getDepartment() == department && employee.getSalary() < minDepartmentSalary){
                    departmentIsEmpty = false;
                    minDepartmentSalary = employee.getSalary();
                    minDepartmentSalaryEmployee = employee;
                }
            }
            if (departmentIsEmpty) {
                throw new RuntimeException("В " + department + " отделе нет сотрудников!");
            }
            return minDepartmentSalaryEmployee;
        }


    }

    public Employee findMaxDepartmentSalaryEmployee(int department) {
        boolean departmentIsEmpty = true;
        int maxDepartmentSalary = 0;
        Employee maxDepartmentSalaryEmployee = null;
        for (Employee employee : base) {
            if (employee.getDepartment() == department && employee.getSalary() > maxDepartmentSalary){
                departmentIsEmpty = false;
                maxDepartmentSalary = employee.getSalary();
                maxDepartmentSalaryEmployee = employee;
            }
        }
        if (departmentIsEmpty) {
            throw new RuntimeException("В " + department + " отделе нет сотрудников!");
        }
        return maxDepartmentSalaryEmployee;
    }

    public double calculateAverageDepartmentSalary(int department) {
        int empInDepartment = 0;
        int sum = 0;
        for (Employee employee : base) {
            if (employee.getDepartment() == department){
                sum = sum + employee.getSalary();
                empInDepartment++;
            }
        }
        if (empInDepartment == 0) {
            throw new RuntimeException("В " + department + " отделе нет сотрудников!");
        }
        return sum / (double) empInDepartment;
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

    public void changeSalary (String fullName, int newSalary) {
        for(Employee employee: base) {
                if (fullName.equals(employee.getFullName())) {
                    employee.setSalary(newSalary);
                }
            }
    }

    public void changeDepartment (String fullName, byte newDepartment) {
        for(Employee employee: base) {
            if (fullName.equals(employee.getFullName())) {
                employee.setDepartment(newDepartment);
            }
        }
    }

    public void printByDepartment () {
        for (int i=1; i<10; i++) {
            System.out.println("Отдел "+i+":");
            for (Employee employee : base) {
                if (employee.getDepartment() == i) {
                    System.out.println(employee.getFullName());
                }
            }
        }

    }
}




