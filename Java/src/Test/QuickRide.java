package Test;
abstract class Transport{
    String name;
    String booking_id;
    int amount;
    String time;
    public Transport(String booking_id,String name){
        this.booking_id = booking_id;
        this.name = name;
    }
    void cancel(){
        System.out.println("Your ride is canceled Successfully");
        System.out.println("Amount " + (this.amount - 200) + "is refunded to your account");
        this.amount = 0;
    }
    void schedule(String time){
        this.time = time;
        System.out.println("Your ride is Successfully schedule at time:" + time);
    }
}
interface Cab{
     String ride = "Cab";
     int amount = 500;
}
interface Bus{
    String ride = "Bus";
    int amount = 200;
}
interface Train{
    String ride = "Train";
    int amount = 1200;
}
class BookCab extends Transport implements Cab{
    public BookCab(String booking_id,String name) {
        super(booking_id,name);
    }
}
class BookBus extends Transport implements Bus{
    String time;
    public BookBus(String booking_id,String name) {
        super(booking_id,name);
    }
}
class BookTrain extends Transport implements Train{
    String time;
    public BookTrain(String booking_id,String name) {
        super(booking_id,name);
    }
}
public class QuickRide {
   public static void main(String[] args){
       BookCab person1 = new BookCab("CD1342","Satyam");
       person1.schedule("10:00 am");
       person1.cancel();
       BookTrain person2 = new BookTrain("CS5246","Shubham");
       person2.schedule("2:00 pm");
       person2.cancel();
       BookBus person3 = new BookBus("CG246535","Shivam");
       person3.schedule("3:00 pm");
   }
}
