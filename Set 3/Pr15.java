import java.util.*;
class Rectangle
{
    double length,width;

    Rectangle(double l,double w) {
        length=l;
        width=w;
    }

    double area()
    {
        return length*width;
    }
    
}
public class Pr15 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        int l,w;
        System.out.print("Enter a Length: ");
        l=sc.nextInt();
        System.out.print("Enter Width of rectangle: ");
        w=sc.nextInt();
        Rectangle obj=new Rectangle(l,w);
        double area=obj.area();
        System.out.println("Area is : "+area);

        System.out.println("23DCS076 Jay Patel");
    

    }
}
