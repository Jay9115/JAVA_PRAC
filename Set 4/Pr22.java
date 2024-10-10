interface AdvancedAritmetic {

    int divisor_sum(int n);
}

class MyCalculator implements AdvancedAritmetic {

    public int divisor_sum(int n) {
        int sum = 0;
        if (n <= 1000) {
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    sum += i;
                }
            }
        }
        return sum;
    }
}

public class Pr22 {
    public static void main(String[] args) {

        MyCalculator obj = new MyCalculator();

        System.out.println("sum of divisors is: " + obj.divisor_sum(6));

        System.out.println("23DCS076 Jay Patel");
    }
}
