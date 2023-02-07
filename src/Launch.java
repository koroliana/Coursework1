public class Launch {
    public static void main(String[] args) {
        EmployeeBook.addEmloyee("Васичкин Василий",  8, 200_000);
        Employee employee1 = new Employee("Василиса Прекрасная Надеждовна", 1, 145_000);
        EmployeeBook.addEmloyee(employee1);
        EmployeeBook.addEmloyee("Александрова Александра",  9, 205_000);
        EmployeeBook.printBase();
        System.out.println();
        System.out.println("Сумма затрат на ЗП: " + EmployeeBook.summarizeSalaries());
        System.out.println();
        System.out.println("Сотрудник с минимальной ЗП - " + EmployeeBook.findMinSalaryEmployee());

    }
}