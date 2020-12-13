package pizzaApp;

public class test {
    private static String[] drinks = {"Coke","Sprite","Diet Coke","Water","Iced Tea","Selzer"};

    public static void test1(){
            int num=0;
            switch(num+1){
                case 1:
                    System.out.println("\nSpecial drink of Monday is: "+drinks[num]);
                case 2:
                    System.out.println("Case2: Special drink of Tuesday is: "+drinks[num+1]);
                case 3:
                    System.out.println("Case3: Special drink of Wednesday is: "+drinks[num+2]);
                case 4:
                    System.out.println("Case4: Special drink of Thursday is: "+drinks[num+3]);
                case 5:
                    System.out.println("Case5: Special drink of Friday is: "+drinks[num+4]);
                case 6:
                    System.out.println("Case6: Special drink of any day is: "+drinks[num+5]);
                default:
                    System.out.println("Default: Value is: "+drinks[num+3]);

            }
        }
    }
