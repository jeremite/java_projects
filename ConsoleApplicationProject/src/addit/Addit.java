package addit;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Addit {
	public int addEm(int numA, int numB) {
		int sum = numA + numB;
		return sum;
	}
	
	public String getName(String nm) {
		return "Greetings "+nm+"\n";
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Addit myAddit = new Addit();
		BufferedReader readIt = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your name");
		String myname = readIt.readLine();
		String ident = myAddit.getName(myname);
		System.out.println(ident);
	}

}
