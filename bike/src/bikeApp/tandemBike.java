package bikeApp;

public class tandemBike extends Bicycle{
    static int numSeats = 0;

    public void setNumSeats(){
        numSeats = 6;
    }
    public void setNumSeats(int seats){
        numSeats = seats;
    }
    public int getNumSeats(){
        return numSeats;
    }

    public static void main(String[] args){
        tandemBike my2Bike = new tandemBike();
        String myNumGears = "";
        int myseats = 0;
        my2Bike.setgrears("18");
        myNumGears = my2Bike.getGears();
        my2Bike.setNumSeats(2);
        myseats = my2Bike.getNumSeats();
        System.out.println("the number of gears on the bike:"+myNumGears);
        System.out.print("the bike has this many seats:"+myseats+"\n");

        if(numSeats==6){
            System.out.println("The bike is a tandem it has"+myseats+" seats");
        }else{
            System.out.print("The bike is a single it has"+myseats+" seat");
        }
    }
}
