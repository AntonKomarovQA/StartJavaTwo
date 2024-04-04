package Lesson7Package;

public class Test7 {
    public static void main(String[] args) {
        Employee employee = new Employee(5);
        employee.surname = "Test1";
        System.out.println(employee.id+" "+employee.surname);
        Employee employee1 = new Employee("Test");
        System.out.println(employee1.id+" "+employee1.surname);
    }
}
