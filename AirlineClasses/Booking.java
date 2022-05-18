package AirlineClasses;

public class Booking {
    
     private int flightNumber;
    private String origin;
    private String destination;
    private String date;
    private String seatstaken;
    private int numberofSeatsleft=50;
    private double originalPrice;

    //number of seat available is for user 
 public int bookSeat(int numberofSeatsleft) {   
   
    if (numberofSeatsleft>0)
    {
        numberofSeatsleft=numberofSeatsleft-1;
         
    }
    return numberofSeatsleft;
 }
 //number of seats available and taken is for Empolyee
//@Overloaded Method 
 public int bookSeat(int numberofSeatsleft,int seatstaken) {   
    if (numberofSeatsleft>0)
    {
        numberofSeatsleft=numberofSeatsleft-1;
    }
    return numberofSeatsleft + seatstaken++;
 }

    public String getSeatstaken() {
        return seatstaken;
    }

    public void setSeatstaken(String seatstaken) {
        this.seatstaken = seatstaken;
    }

     public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }



    public double getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(double originalPrice) {
        this.originalPrice = originalPrice;
    }
     public int getNumberofSeatsleft() {
        return numberofSeatsleft;
    }

    public void setNumberofSeatsleft(int numberofSeatsleft) {
        this.numberofSeatsleft = numberofSeatsleft;
    }

}
