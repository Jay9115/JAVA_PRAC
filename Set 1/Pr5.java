
import java.util.Scanner;

public class Pr5 {

    public static void main(String[] args) {
        int[] price = {100, 200, 300, 400, 500};
        int[] code = {1, 2, 3, 4, 5};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your choice:");
        int ch = sc.nextInt();
        double temp = 0;

        switch (ch) {
            case 1:
                temp = price[0] + price[0] * 0.08;
                break;
            case 2:
                temp = price[0] + price[0] * 0.12;
                break;
            case 3:
                temp = price[0] + price[0] * 0.05;
                break;
            case 4:
                temp = price[0] + price[0] * 0.075;
                break;
            case 5:
                temp = price[0] + price[0] * 0.03;
                break;
        }
        System.out.println("Price is :" + temp);
        System.out.println("23DCS076 JAY PATEL");
    }

}
