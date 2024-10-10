class Shape
{
    void shape()
    {
        System.out.println("This is Shape");
    }
}

class Rectangle extends Shape
{
    void rectangle()
    {
        System.out.println("this is Rectangle");
    }
}

class Circle extends Shape
{
    void Circle()
    {
        System.out.println("this is circle");
    }

}

class Square extends Rectangle
{
    void Square()
    {
        System.out.println("This is Square");
    }

}
public class Pr20 {
    public static void main(String[] args) {
        Square obj=new Square();

        obj.rectangle();
        obj.shape();

        System.out.println("23DCS076 Jay Patel");
    }
}
