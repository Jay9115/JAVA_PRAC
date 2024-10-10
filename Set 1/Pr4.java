
import java.util.*;
public class Pr4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[31];
        int sum = 0;
        System.out.println("Enter Your daily expense:");
        for (int i = 0; i < 31; i++) {
            System.out.println("Day:"+(i+1));
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
        }
        System.out.println("The total expensses of the month are: " + sum);
        System.out.println("23DCS076 JAY PATEL");
    }
}
