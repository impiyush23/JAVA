import java.util.Scanner;
    public class Person {
        private String name;
        private int age;

        protected void setName(String name) {
            this.name = name;
        }

        protected String getName() {
            return name;
        }

        protected void setAge(int age) {
            this.age = age;
        }

        protected int getAge() {
            return age;
        }
    }
    class Employee extends Person {
        private double salary;

        public void inputEmployee() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Name, Age, and Salary of Employee:");
            setName(sc.nextLine()); // cauz cant access name private member of Person
            setAge(sc.nextInt());   // cauz cant access age private member of Person
            salary = sc.nextDouble();
        }

        public void displayEmployee() {
            System.out.println("Name:" + getName()); // even protected but able to use cauz accessible via child class
            System.out.println("Age:" + getAge());
            System.out.println("Salary:" + salary);
        }
        public static void main(String[] args) {
            Employee e = new Employee();
            e.inputEmployee();
            e.displayEmployee();
        }
    }