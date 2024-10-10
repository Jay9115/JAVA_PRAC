import java.util.*;
class Date
{
    Scanner sc=new Scanner(System.in);
    int date,month,year;
    Date()
    {
        date=0;
        month=0;
        year=0;
    }

    void getdate()
    {
        System.out.print("Enter Day:");
        date=sc.nextInt();

    }
    void getmonth()
    {
        System.out.print("Enter Month:");
        month=sc.nextInt();

    }
    void getyear()
    {
        System.out.print("Enter Year:");
        year=sc.nextInt();
    }

    void display()
    {
        System.out.println("The Date is: "+date+"/"+month+"/"+year);
    }
}

class Pr14
{
    public static void main(String[] args)
    {

        Date d1=new Date();
        d1.display();

        d1.getdate();
        d1.getmonth();
        d1.getyear();
        d1.display();

        System.out.println("23DCS076 Jay Patel");


    }
}