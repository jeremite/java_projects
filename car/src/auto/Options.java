package auto;

public class Options {
    private String radio;
    private String selfDriving;
    private String fuel;

    public Options(String radio,String selfDriving,String fuel){
        this.radio = radio;
        this.selfDriving = selfDriving;
        this.fuel = fuel;
    }
    public String setRadioOption(String radio){
        this.radio = radio;
        return radio;
    }
    public String getRadioOption(){
        return radio;
    }
    public String setDrivingOption(String selfDriving){
        this.selfDriving = selfDriving;
        return selfDriving;
    }
    public String getDrivingOption(){
        return selfDriving;
    }

    public String setFuelOption(String fuel){
        this.fuel = fuel;
        return fuel;
    }
    public String getFuelOption(){
        return fuel;
    }

    public String toString(){
        return "Options: radio:"+radio+", Driving options: "+selfDriving+", fuel type:"+fuel+"\n";
    }

}

