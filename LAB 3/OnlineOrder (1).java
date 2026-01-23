
class Service extends Thread{
    String task;
    int dur;

    public Service(String task, int dur){
        this.task = task;
        this.dur = dur;
    }
    @Override
    public void run(){
        
        try {
            System.out.println("START -> " + task + " is now in progress...");
            Thread.sleep(dur);
            System.out.println("COMPLETED ->" + task);
        } catch (InterruptedException ex) {
            System.out.println("Task was interrupted");
           
        }
       
            
        }
}

public class OnlineOrder {
    public static void main(String[] args) {
        Thread orderVal = new Thread(new Service("Validate order id 1006", 1000));
        Thread payment = new Thread(new Service("Payment", 2000));
        Thread shipment = new Thread(new Service("Shipment", 3000));

        orderVal.start();
        payment.start();
        shipment.start();

        try {
            orderVal.join();//synchronisation
            payment.join();
            shipment.join();

            
        } catch (InterruptedException e) {
            System.out.println("processes interrupted");
        }
        System.out.println("All requests have been processed");
    } }
    


