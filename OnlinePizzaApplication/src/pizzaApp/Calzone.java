package pizzaApp;
import java.util.ArrayList;
import java.util.Iterator;

public class Calzone extends PizzaApp{

    public String itemname = "Calzones";

    private String[] cheeseType = {"Ricotta","Cottage","Goat"};
    ArrayList<Integer> calSize = new ArrayList<Integer>();

    public String calzoneSize(){

        boolean ingredientsInStock = true;
        int csize = 0;
        String calzoneSizeList = "";

        calSize.add(4);
        calSize.add(6);
        calSize.add(10);

        Iterator<Integer> cal_itr = calSize.iterator();

        if(ingredientsInStock){
            while(cal_itr.hasNext()){
                csize = cal_itr.next();
                calzoneSizeList += csize + " ";
            }
        }
        return calzoneSizeList;
    }

    public String getCalCheese(){
        int ilength = cheeseType.length;
        String mycalzones = "";
        String mycals = "";

        for(int i=0;i<ilength;i++){
            mycals = cheeseType[i];
            mycalzones = mycalzones+" "+mycals;
        }
        return mycalzones;
    }
}
