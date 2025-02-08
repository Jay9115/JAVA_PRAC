import java.util.Scanner;
public class Pr3 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter distance in meter :");
        float meter=sc.nextFloat();
        System.out.print("Enter Time in hour :");
        float  hour =sc.nextFloat();
        System.out.print("in minute :");
        float  minute =sc.nextFloat();
        System.out.print("in Second :");
        float  Second =sc.nextFloat();

        float sec=(hour*60*60)+(minute*60)+Second;           //total time taken in second
        float ms=meter/sec;                                  //Speed in meter per second       
        float kh=(meter/1000)/(sec/3600);                    //Speed in Kilometer per hour
        float mh=(meter/1609)/(sec/3600);                    //Speed in Mile per hour
        
        System.out.println("Meter per Second :" +ms);
        System.out.println("kilometer per hour :" +kh);
        System.out.println("Mile per hour :" +mh);
        System.out.println("23DCS076 JAY PATEL");

    }
}
