import java.util.*;

class Complex_Number {

    int real, imaginary;

    void getdata() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Real part: ");
        real = sc.nextInt();
        System.out.print("Enter Imaginary part: ");
        imaginary = sc.nextInt();

    }

    public void putdata() {
        System.out.println("Complex Number is : " + real + "+(" + imaginary + ")i");
    }

    void addition(Complex_Number obj) {
        Complex_Number result = new Complex_Number();
        result.real = real + obj.real;
        result.imaginary = imaginary + obj.imaginary;

        result.putdata();
    }

    void substraction(Complex_Number obj) {
        Complex_Number result = new Complex_Number();
        result.real = real + obj.real;
        result.imaginary = imaginary + obj.imaginary;

        result.putdata();
    }

    void product(Complex_Number c) {
        Complex_Number res = new Complex_Number();
        res.real = real * c.real - imaginary * c.imaginary;
        res.imaginary = real * c.imaginary + imaginary * c.real;
        res.putdata();
    }

}
public class Pr16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Complex_Number Obj1 = new Complex_Number();
        Obj1.getdata();
        Complex_Number Obj2 = new Complex_Number();
        Obj2.getdata();
        Obj1.putdata();
        Obj2.putdata();

        System.out.println("Addition of 2 Complex number:");
        Obj1.addition(Obj2);
        System.out.println("Substraction of 2 Complex number:");
        Obj1.substraction(Obj2);
        System.out.println("Product of 2 Complex number:");
        Obj1.product(Obj2);

        System.out.println("23DCS076 Jay Patel");
    }
}