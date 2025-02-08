class Thread1 extends Thread {
    public void run() {
        int i=0,n = 0; 
        while (i<7) {
            
            System.out.println(i); 
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                
                System.out.println("Thread interrupted."); 
            }
            i++;
        }

    }
}
public class Pr35 {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        t1.start(); // Start the thread
        System.out.println("23DCS076 Jay Patel");
    }
}
