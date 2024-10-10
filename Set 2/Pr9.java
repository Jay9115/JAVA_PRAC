
public class Pr9 {
    static void  double_char(String s) {
        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i));
            System.out.print(s.charAt(i));
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        Pr9 obj1=new Pr9();
        obj1.double_char("The");
        obj1.double_char("AAbb");
        obj1.double_char("Hi-There");

        System.out.println("23DCS076 JAY PATEL");
    }
}
