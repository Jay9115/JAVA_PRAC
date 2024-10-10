
class Myrunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("Hello World!");
    }
}

public class Pr32_2 {

    public static void main(String[] args) {
        Myrunnable r = new Myrunnable();
        Thread t = new Thread(r);
        t.start();
        System.out.println("23DCS076 Jay Patel");
    }
}
