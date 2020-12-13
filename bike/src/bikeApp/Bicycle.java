package bikeApp;

public class Bicycle {

    String gears = "";
    String brakes = "";
    public void setgrears(String g){
        this.gears = g;
    }
    public String getGears(){
        return gears;
    }

    public static void main(String[] args){
        String gearNum = "";
        Bicycle myBike = new Bicycle();
        myBike.setgrears("21");
        gearNum = myBike.getGears();
        System.out.print("The number of gears is:"+gearNum);
    }
}
