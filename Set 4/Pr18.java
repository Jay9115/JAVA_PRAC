import java.util.Scanner;

class Member {

    Scanner sc = new Scanner(System.in);
    String Name;
    int age;
    int number;
    String address;
    int salary;

    public void printSalary() {
        System.out.println("the Salary is :" + salary);
    }
    void getdata() {

        System.out.print("Enter Name:");
        Name = sc.nextLine();
        System.out.print("Enter Age:");
        age = sc.nextInt();
        System.out.print("Enter Mobile Number:");
        number = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Address:");
        address = sc.nextLine();
        System.out.print("Enter Salary:");
        salary = sc.nextInt();
        sc.nextLine();

    }
    void putdata() {

        System.out.println("Name: " + Name);
        System.out.println("Age: " + age);
        System.out.println("Mobile Number: " + number);
        System.out.println("Address: " + address);
    }
}

class Employee extends Member {

    String specialization;

    void getsp() {
        System.out.println("Enter Specialzation");
        specialization = sc.nextLine();
    }

    void putsp() {
        System.out.println("Specialization: " + specialization);
    }
}

class Manager extends Member {

    String department;

    void getdepartment() {

        System.out.println("Enter Department:");
        department = sc.nextLine();
    }

    void putdepartment() {

        System.out.println("Department: " + department);
    }
}

public class Pr18 {

    public static void main(String[] args) {

        Employee e1 = new Employee();
        Manager M1 = new Manager();

        System.out.println("enter Employee Details: ");
        e1.getdata();
        e1.getsp();
        System.out.println("Enter Manager Details: ");
        M1.getdata();
        M1.getdepartment();

        System.out.println("Given details are:");
        e1.putdata();
        e1.printSalary();
        e1.putsp();
        M1.putdata();
        M1.printSalary();
        M1.putdepartment();

        System.out.println("23DCS076 Jay Patel");
    }
}
