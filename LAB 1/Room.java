

public class Room {
    int rno;
    double tarr;

    Room(int rno, double tarr){
        this.rno = rno;
        this.tarr = tarr;
    }

    double calculateTarrif(int days){
        return (days*tarr);

    }


    public static void main(String[] args) {

        Room r2;
        r2 = new StandardRoom(509, 4000);
        int days = 3;
        System.out.println("----TARRIFS----");

        //System.out.println("Regular Room: Rs" + r1.calculateTarrif(3));
        
    
        System.out.println("Standard Roomr Room: Rs" + r2.calculateTarrif(3));


        r2 = new LuxuryRoom(805, 10000);

    
        System.out.println("Luxury Room: Rs" + r2.calculateTarrif(3));

    
}
}
class StandardRoom extends Room{

    double ac = 1500.00;
    double wifi = 1000.00;


    StandardRoom(int rno, double tarr) {
        super(rno, tarr);
    }

    @Override
    double calculateTarrif(int days) {

        // TODO Auto-generated method stub
        return (days*(ac+wifi+tarr));
    }

}

class LuxuryRoom extends Room{

    double ac = 1500.00;
    double wifi = 1000.00;
    double bf = 1500.00;


    LuxuryRoom(int rno, double tarr) {
        super(rno, tarr);
    }

    @Override
    double calculateTarrif(int days) {

        // TODO Auto-generated method stub
        return (days*(ac+wifi+tarr+bf));
    }

}