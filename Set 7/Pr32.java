
class Mythread extends Thread {

    @Override
    public void run() {
        System.out.println("Hello world!");
    }
}

public class Pr32{
    public static void main(String[] args) {
        Mythread t = new Mythread();
        t.start();

        System.out.println("23DCS076");
    }
}
