class MyException extends Exception {
    public MyException() {
        System.out.println("Exepction created by user");
    }
}
public class Pr26_1 {
    static void checkValue(int value) throws Exception {
        if (value > 10) {
            throw new MyException();
        }
        System.out.println("Value is acceptable: " + value);
    }
    public static void main(String[] args) {
        try {
            checkValue(5); 
            checkValue(15);
            
        } catch (Exception e) {
          e.printStackTrace();
        }
        System.out.println("23DCS076 Jay Patel");
    }    
}