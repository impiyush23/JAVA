import java.util.Scanner;
public class Person {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
    class Employee extends Person {
        private double salary;

        public void inputEmployee() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Name, Age, and Salary of Employee:");
            setName(sc.nextLine());
            setAge(sc.nextInt());
            salary = sc.nextDouble();
        }

        public void displayEmployee() {
            System.out.println("Name:" + getName());
            System.out.println("Age:" + getAge());
            System.out.println("Salary:" + salary);
        }
        public static void main(String[] args) {
            Employee e = new Employee();
            e.inputEmployee();
            e.displayEmployee();
        }
    }
