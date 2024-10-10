 interface shape
{
    default void color()
    {
        System.out.println("Colour is red");
    }

    void perameters();
    void text();
}
class circle implements shape
{   

    public void perameters()
    {
        System.out.println("Redius");
    }

    public void text()
    {
        System.out.println("This is circle");
    }

}
class rectangle implements shape
{
    public void perameters()
    {
        System.out.println("length,width");
    }
    public void text()
    {
        System.out.println("This is rectangle");
    }
}
public class Pr23 {
    public static void main(String[] args) {
        {
            circle obj1=new circle();
            rectangle obj2=new rectangle();

            System.out.println("Property of circle:");
            obj1.color();
            obj1.perameters();
            obj1.text();

            System.out.println("Property of rectangle:");
            obj2.color();
            obj2.perameters();
            obj2.text();

            System.out.println("23DCS076 Jay Patel");
        }
    }
}
