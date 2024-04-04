package Lesson7Package;


  public class Employee {
        //переменные
         int id;
        public String surname;
        private double salary;



        //Конструктор
        public Employee(int id1) {
            id = id1;
        }
        Employee(String surname1) {
            surname = surname1;
        }
        private Employee(double salary2) {
            salary = salary2;
        }

        // методы с выводом каждой переменной
        public void  YvelichenitZP1() {
            System.out.println("Переменная id = "+id);
        }
        public void YvelichenitZPSurmane() {
            System.out.println("Переменная surname = "+surname);
        }
        public void YvelichenitZPSalary() {
            System.out.println("Переменная salary = "+salary);
     }
    }

    class EmployeeTest {
        public static void main(String[] args) {
            Employee employee = new Employee(5);
            employee.id =3;
            employee.surname = "Anton";
            employee.YvelichenitZP1();
            employee.YvelichenitZPSurmane();
            employee.YvelichenitZPSalary();

        }
    }

