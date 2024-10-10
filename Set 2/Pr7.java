import java.lang.*;
import java.util.*;

public class Pr7 {
    static void front_times(String s,int n)
    {
String s1=s.substring(0,3);
        for(int i=0;i<n;i++)
        {
            System.out.print(s1);
        }
        System.out.println();
    }

    
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter n:");
      int n=sc.nextInt();
        String s1="Chocolate";
        front_times(s1,n);
        
     System.out.println("23DCS076 JAY PATEL");   
    }
}
