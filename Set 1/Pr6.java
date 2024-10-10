import java.util.Scanner;
public class Pr6 
{
    public static void main(String[] args) {
        int j = 1, k, temp = 0, sum = 0;
        System.out.print("Enter value of n:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Fibonaci till "+n);
        for (int i = 0; temp <=n; i++) {
            System.out.print(" "+temp);
            k = j;
            j = temp;
            temp = j + k;

            sum += temp;
        }
        System.out.println("\nSum is :"+sum);
        System.out.println("23DCS076 JAY PATEL");
        sc.close();
    }
}
