import java.util.*;
class Pr12
{
   public static void main(String[] args)
   {
      int pound=0;
      Scanner sc=new Scanner(System.in);

      pound= (args.length==0) ? sc.nextInt() : Integer.parseInt(args[0]);
      int rupees=100*pound;

   System.out.println(pound+ " Pound in Rupees :" +rupees);
   System.out.println("");

   System.out.println("23DCS076 Jay Patel");
   }
}