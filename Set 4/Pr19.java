class Rectangle
{
    double length,width;

    Rectangle(double l,double w)
    {
        length=l;
        width=w;
    }
    void rectagle_perimeter()
    {
        System.out.println("Perimeter Of Rectangle is: "+(2*(length+width)));
    }

    void rectagle_area()
    {
        System.out.println("Area os rectagle is:  "+(length*width));
    }
}

class Square extends Rectangle
{
    double side;

    Square(double s,double l,double w)
    {
        super(l, w);
        side=s;
        
    }
    void Square_perimeter()
    {
        System.out.println("Perimeter Of Rectangle is: "+(4*side));
    }
    void Square_area()
    {
        System.out.println("Area os rectagle is:  "+(side*side));
    }
}

public class Pr19 {

    public static void main(String[] args) {
        Square Obj[]=new Square[3];
        Obj[0]=new Square(1,2,3);
        Obj[1]=new Square(2,2,4);

        Obj[0].rectagle_area();
        Obj[0].Square_area();

        Obj[1].rectagle_perimeter();
        Obj[1].Square_perimeter();
        System.out.println("23DCS076 Jay Patel");

    }
}
