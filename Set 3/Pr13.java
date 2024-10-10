
import java.util.*;

class Employee {

    Scanner sc = new Scanner(System.in);
    String name = new String();
    String last_name = new String();
    double salary;

    Employee() {
        name = "";
        last_name = "";
        salary = 0.0;
    }

    public void getname() {
        System.out.print("Enter your first name: ");
        name = sc.nextLine();

        System.out.print("Enter your last name: ");
        last_name = sc.nextLine();

    }

    public void getsalary() {
        System.out.print("Enter Your monthly salary: ");
        salary = sc.nextDouble();
    }

    public void putname() {
        System.out.println("First name: " + name);
        System.out.println("Last name: " + last_name);

    }

    public double Yearlysalary() {
        return salary*12;
    }
}

public class Pr13 {

    public static void main(String[] args) {
        Employee e1 = new Employee(), e2 = new Employee();

        System.out.println("Enter 1st employee details ");
        e1.getname();
        e1.getsalary();
        
        System.out.println("Enter 2nd employee details ");
        e2.getname();
        e2.getsalary();

        
        System.out.println("Yearly salary of employee 1 is :"+(e1.Yearlysalary()));
        System.out.println("Yearly salary of employee 2 is :"+(e2.Yearlysalary()));

        System.out.println("Giving 10% raise to each employee");
        System.out.println("Yearly salary of employee 1 is :"+(e1.Yearlysalary()+0.1*e1.Yearlysalary()));
        System.out.println("Yearly salary of employee 2 is :"+(e2.Yearlysalary()+0.1*e2.Yearlysalary()));

        System.out.println("23DCS076 Jay Patel");


    }
}
