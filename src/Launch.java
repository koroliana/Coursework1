public class Launch {
    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook();
        employeeBook.addEmloyee("Васичкин Василий",  8, 200_000);
        Employee employee1 = new Employee("Василиса Прекрасная Надеждовна", 1, 145_000);
        employeeBook.addEmloyee(employee1);
        employeeBook.addEmloyee("Александрова Александра",  9, 205_000);
        employeeBook.addEmloyee("Иванов Иван Иванович",  1, 55_000);
        employeeBook.addEmloyee("Ермаков Алексей Сергеевич",  2, 82_000);
        employeeBook.addEmloyee("Добролюбова Евгения Александровна",  1, 105_000);
        employeeBook.addEmloyee("Кривоногов Дмитрий Алексеевич",  1, 121_000);
        employeeBook.addEmloyee("Третьяков Ивангай Кошкович",  3, 55_000);
        employeeBook.addEmloyee("Слепаков Толгонак",  4, 45_000);
        employeeBook.addEmloyee("Кондаков Михаил Петрович",  5, 65_000);
        employeeBook.addEmloyee("Тышко Елена Антоновна",  6, 115_000);
        employeeBook.addEmloyee("Дранкова Долена Петровна",  7, 55_000);
        employeeBook.printBase();
        System.out.println();
        System.out.println("Сумма затрат на ЗП: " + employeeBook.summarizeSalaries());
        System.out.println("Сотрудник с минимальной ЗП - " + employeeBook.findMinSalaryEmployee());
        System.out.println("Сотрудник с максимальной ЗП - " + employeeBook.findMaxSalaryEmployee());
        System.out.println();
        System.out.println("Среднее значение ЗП: " + employeeBook.calculateAverageSalary());
        System.out.println();
        employeeBook.printEmployeeNames();
        employeeBook.indexSalaries(5);
        System.out.println();
        System.out.println("Отдел 1. Сотрудник с максимальной ЗП - " + employeeBook.findMaxSalaryDepartmentEmployee(1));
        System.out.println("Отдел 1. Сотрудник с минимальной ЗП - " + employeeBook.findMinSalaryDepartmentEmployee(1));
        System.out.println("Отдел 1. Сумма затрат на ЗП: " + employeeBook.summarizeDepartmentSalaries(1));
        System.out.println("Отдел 1. Среднее значение ЗП: " + employeeBook.calculateAverageDepartmentSalary(1));
        employeeBook.indexDepartmentSalaries(1,5);
        employeeBook.printDepartmentBase(1);
        System.out.println();
        employeeBook.findEmployeesWithLessSalary(100000);
        employeeBook.findEmployeesWithMoreSalary(120000);
        employeeBook.findEmployeesWithLessSalary(300000);
        employeeBook.removeEmployee(employee1);
        employeeBook.removeEmployee("Третьяков Ивангай Кошкович");
        employeeBook.removeEmployee(5);
        employeeBook.findEmployeesWithLessSalary(300000);




    }
}