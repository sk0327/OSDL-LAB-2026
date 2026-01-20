package week3;



class NewThread extends Thread{

     NewThread() {
        super("Demo Thread");
        System.out.println("Child Thread: " + this);
    }

     @Override
    public void run(){
        try {
            for(int i = 5; i>0; i--){
                System.out.println("Child Thread: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Child Thread interrupted");
        }
        System.out.println("Exiting child thread");
    }
    
}
public class ThreadExtend {
    public static void main(String[] args) {
        NewThread nt = new NewThread();
        nt.start();
        //System.out.println("hello");
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

