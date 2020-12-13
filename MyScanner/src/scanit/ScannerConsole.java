package scanit;
import java.util.Scanner;

public class ScannerConsole {
	public double getTotal(double cst, int amt) {
		//double cost = cst;
		//int num =amt;
		double tot = cst * amt;
		return tot;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ScannerConsole sc = new ScannerConsole();
		
		Scanner myScan = new Scanner(System.in);
		System.out.println("Enter username");
		
		String userName = myScan.nextLine();
		
		System.out.println("Enter the number of items purchased: ");
		int items = myScan.nextInt();
		
		System.out.println("Enter the price of the items purchased: ");
		double price = myScan.nextDouble();
		
		double total = sc.getTotal(price, items);
		
		System.out.println("Greetings "+userName);
		System.out.println("The number of items is:  "+items);
		System.out.println("The price is: "+price);
		System.out.println("The total is: "+total);
		myScan.close();
	}

}
