public class Launch {
    public static void main(String[] args) {
        EmployeeBook.addEmloyee("Васичкин Василий",  8, 200_000);
        Employee employee1 = new Employee("Василиса Прекрасная Надеждовна", 1, 145_000);
        EmployeeBook.addEmloyee(employee1);
        EmployeeBook.addEmloyee("Александрова Александра",  9, 205_000);
        EmployeeBook.addEmloyee("Иванов Иван Иванович",  1, 55_000);
        EmployeeBook.addEmloyee("Ермаков Алексей Сергеевич",  2, 82_000);
        EmployeeBook.addEmloyee("Добролюбова Евгения Александровна",  1, 105_000);
        EmployeeBook.addEmloyee("Кривоногов Дмитрий Алексеевич",  1, 121_000);
        EmployeeBook.addEmloyee("Третьяков Ивангай Кошкович",  3, 55_000);
        EmployeeBook.addEmloyee("Слепаков Толгонак",  4, 45_000);
        EmployeeBook.addEmloyee("Кондаков Михаил Петрович",  5, 65_000);
        EmployeeBook.addEmloyee("Тышко Елена Антоновна",  6, 115_000);
        EmployeeBook.addEmloyee("Дранкова Долена Петровна",  7, 55_000);
        EmployeeBook.printBase();
        System.out.println();
        System.out.println("Сумма затрат на ЗП: " + EmployeeBook.summarizeSalaries());
        System.out.println("Сотрудник с минимальной ЗП - " + EmployeeBook.findMinSalaryEmployee());
        System.out.println("Сотрудник с максимальной ЗП - " + EmployeeBook.findMaxSalaryEmployee());
        System.out.println();
        System.out.println("Среднее значение ЗП: " + EmployeeBook.calculateAverageSalary());
        System.out.println();
        EmployeeBook.printEmployeeNames();
        EmployeeBook.indexSalaries(5);
        System.out.println();
        System.out.println("Отдел 1. Сотрудник с максимальной ЗП - " + EmployeeBook.findMaxSalaryDepartmentEmployee(1));
        System.out.println("Отдел 1. Сотрудник с минимальной ЗП - " + EmployeeBook.findMinSalaryDepartmentEmployee(1));
        System.out.println("Отдел 1. Сумма затрат на ЗП: " + EmployeeBook.summarizeDepartmentSalaries(1));
        System.out.println("Отдел 1. Среднее значение ЗП: " + EmployeeBook.calculateAverageDepartmentSalary(1));
        EmployeeBook.indexDepartmentSalaries(1,5);
        EmployeeBook.printDepartmentBase(1);
        System.out.println();
        EmployeeBook.findEmployeesWithLessSalary(100000);
        EmployeeBook.findEmployeesWithMoreSalary(120000);
        EmployeeBook.findEmployeesWithLessSalary(300000);



    }
}