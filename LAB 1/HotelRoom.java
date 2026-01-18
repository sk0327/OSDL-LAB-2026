

abstract class Room {


    int rno;
    double tarr;

    Room(int rno, double tarr){
        this.rno = rno;
        this.tarr = tarr;
    }
    abstract double calculateTarrif(int days);
}

interface Amenities{
    double provideWifi();
    double provideBreakfast();
}

class StandardRoom extends Room implements Amenities{

    StandardRoom(int rno, double tarr) {
            super(rno, tarr);
            //TODO Auto-generated constructor stub
        }
    
        @Override
    public double provideWifi() {
        // TODO Auto-generated method stub
        return 1500;
    }

    public double provideBreakfast(){
        return 0;
    }
    
    @Override
    double calculateTarrif(int days) {
        return (days*(tarr+provideWifi()));
    }


}

class LuxuryRoom extends Room implements Amenities{

    LuxuryRoom(int rno, double tarr) {
            super(rno, tarr);
            //TODO Auto-generated constructor stub
        }
    
        @Override
    public double provideWifi() {
        // TODO Auto-generated method stub
        return 1500;
    }

    @Override
    public double provideBreakfast() {
        // TODO Auto-generated method stub
        return 1000;
    }

    @Override
    double calculateTarrif(int days) {
        // TODO Auto-generated method stub
        return (days*(tarr+provideBreakfast()+provideWifi()));   
 }

}

public class HotelRoom{
    public static void main(String[] args) {
        Room r2;
        r2 = new StandardRoom(409, 2000);
        int days = 3;
        System.out.println("----TARRIFS----");

        //System.out.println("Regular Room: Rs" + r1.calculateTarrif(3));
        
    
        System.out.println("Standard Room Room: " + r2.rno + "\t Rs." + r2.calculateTarrif(3));


        r2 = new LuxuryRoom(805, 10000);

    
        System.out.println("Luxury Room: " + r2.rno + "\t Rs." + r2.calculateTarrif(3));
    }
}