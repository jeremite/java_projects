package auto;

public class Car {
    private String make;
    private String model;
    private int year;

    public Car(String make, String model, int year){
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public Car(String model, int year){
        this.model = model;
        this.year = year;
    }
    public String setCarMake(String make){
        this.make = make;
        return make;
    }
    public String setCarModel(String model){
        this.model = model;
        return model;
    }
    public String getCarMake(){
        return make;
    }
    public String getCarModel(){
        return model;
    }
    public int setCarYear(int year){
        this.year = year;
        return year;
    }
    public int getCarYear(){
        return year;
    }

    public String toString(){
        return "Car Make:"+make+",model:"+model+",Car year:"+year;
    }

    public static void main(String[] args){
        System.out.println("Car Java application");
        Car car1 = new Car("Ford","F150",2015);
        Car car2 = new Car("Tesla","model Y",2021);
        Car car3 = new Car("Jeep","Compass",2018);
        Options opt1 = new Options("satellite","AutoDrive","FlexFuel");
        Options opt2 = new Options("Terrestrial","standard","Gas");
        Options opt3 = new Options("satellite","standard","DualFuel");


        System.out.println(car1.toString());
        System.out.println(opt1.toString());

        System.out.println(car2.toString());
        System.out.println(opt2.toString());
        System.out.println(car3.toString());
        System.out.println(opt3.toString());
    }
}
