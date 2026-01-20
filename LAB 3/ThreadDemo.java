package week3;

class NewThread implements Runnable{
    Thread t;
    NewThread(){
        t = new Thread(this, "Demo Thread");
        System.out.println("Child Thread: " + t);
        t.start();

    }
    public void run(){
        try {
            for(int i = 5; i>0; i--){
                System.out.println("Child thread: " +i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Child thread Interrupted");
        }
        System.out.println("Exiting child thread");
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        NewThread nt = new NewThread();
        nt.t.setName("My Demo Thread using Runnable");

        try{
            for(int i = 5; i>0; i--){
                System.out.println("Main thread: " +i);
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e){
            System.out.println("Main thread interrupted");
        }
        System.out.println("Exiting main thread");
    }
    

}
