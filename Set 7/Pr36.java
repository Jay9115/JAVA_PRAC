class T extends Thread {
    public T(String s) {
        super(s);
    }

    public void run() {
        System.out.println("This is run method: " + getName());
    }
}

public class Pr36 {
    public static void main(String[] args) {
        T FIRST = new T("FIRST");
        T SECOND = new T("SECOND");
        T THIRD = new T("THIRD");

        System.out.println("Default priority:");
        System.out.println("FIRST: " + FIRST.getPriority());
        System.out.println("SECOND: " + SECOND.getPriority());
        System.out.println("THIRD: " + THIRD.getPriority());

        // Set thread priorities
        FIRST.setPriority(3);
        SECOND.setPriority(5);
        THIRD.setPriority(7);

        // Start the threads
        FIRST.start();
        SECOND.start();
        THIRD.start();

        System.out.println("23DCs076 Jay Patel");
    }
}
