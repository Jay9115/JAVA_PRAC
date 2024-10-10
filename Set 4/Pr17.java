
class Perent
{
    void display1()
    {
        System.out.println("This is Perent calss");
    }
}

class Child extends Perent
{

    void display2()
    {
        System.out.println("EThis is child class");
    }
}
public class Pr17
{

    public static void main(String[] args) {
        // Perent obj1=new Perent();
        Child obj2=new Child();

        obj2.display1();
        obj2.display2();
        System.out.println("23DCS076 Jay Patel");
    }
}