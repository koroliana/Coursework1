public class Launch {
    public static void main(String[] args) {
        EmployeeBook.addEmloyee("Васичкин Василий",  8, 200_000);
        Employee employee1 = new Employee("Василиса Прекрасная Надеждовна", 1, 145_000);
        EmployeeBook.addEmloyee(employee1);
        EmployeeBook.printBase();

    }
}