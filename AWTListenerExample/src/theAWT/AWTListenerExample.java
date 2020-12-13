package theAWT;
import java.awt.*;
import java.awt.event.*;
import java.util.Date;


public class AWTListenerExample {
	public String frmText() {
		Date dt = new Date();
		String dtxt = dt.toString();
		return dtxt;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AWTListenerExample ale = new AWTListenerExample();
		
		Frame f = new Frame("ActionListener Demo");
		final TextField mytf = new TextField();
		mytf.setBounds(50,50,250,20);
		Button b = new Button("Click here");
		b.setBounds(50,100,85,30);
		
		b.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evn) {
				mytf.setText("Welcom to this Java AWT Lesson");
				String dtext = ale.frmText();
				mytf.setText("Welcom: Java AWT Lesson. "+dtext);
			}
		});
		
		f.add(b);
		f.add(mytf);
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);
	}

}
