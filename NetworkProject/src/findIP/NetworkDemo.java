package findIP;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Date;
import java.text.SimpleDateFormat;

public class NetworkDemo extends JFrame implements ActionListener{
	int FindIPCount =0;
	int noCount =0;
	int listCnt=0;
	String sdate="";
	
	String myList ="";
	JFrame frm;
	JTextField tf;
	JLabel l;
	JLabel lab;
	JTextArea txta;
	JButton b;
	JButton b0;
	JButton b2;
	JLabel txtLab;
	
	public String getDate() {
		String fmt = "MMM-dd-YYYY HH:MM:SS";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(fmt);
		String date = simpleDateFormat.format(new Date());
		return date;
	}
	
	NetworkDemo(){
		frm = new JFrame();
		
		tf = new JTextField();
		tf.setBounds(50,50,150,20);
		l = new JLabel();
		l.setBounds(50, 100, 250, 20);
		lab = new JLabel();
		lab.setBounds(250,120,100,200);
		lab.setFont(new Font("Serif", Font.BOLD, 18));
		
		txtLab = new JLabel();
		txtLab.setBounds(220,150,100,20);
		txtLab.setFont(new Font("Serif", Font.BOLD, 16));
		txtLab.setForeground(Color.BLUE);
		txtLab.setText("Sites Vissited");
		txta = new JTextArea();
		txta.setBounds(185,180,170,150);
		
		b = new JButton("Find IP");
		b.setBounds(50,150,95,30);
		b.addActionListener(this);
		b0 = new JButton("List It");
		b0.setBounds(50,200,100,30);
		b0.addActionListener(this);
		b2 = new JButton("Clear");
		b2.setBounds(50,250,100,30);
		b2.addActionListener(this);
		JButton Button = new JButton("Close");
		Button.setBounds(50,300,100,30);
		
		frm.add(b);
		frm.add(b0);
		frm.add(b2);
		frm.add(txtLab);
		frm.add(tf);
		frm.add(l);
		frm.add(lab);
		frm.add(txta);
		frm.add(Button);
		
		frm.setTitle("IP Finder");
		frm.setSize(400,400);
		frm.setLayout(null);
		frm.setVisible(true);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setLocationRelativeTo(null);

		Button.addActionListener((event)->System.exit(0));
		
		
	}
	public void actionPerformed(ActionEvent e) {
		try {
			JButton src = (JButton) e.getSource();
			if(src.getActionCommand().equals("Find IP")) {
				String host = tf.getText();
				String ip = java.net.InetAddress.getByName(host).getHostAddress();
				l.setText("IP of "+host+" is: "+ip);
				
				FindIPCount ++;
				System.out.println("FindIPCount is: "+FindIPCount);
				
			}else if (src.getActionCommand().equals("List It")) {
				listCnt++;
				System.out.println("List COunt is: "+listCnt);
				String site = tf.getText();
				site = site+'\n';
				myList += site;
				System.out.println(myList);
				txta.setText(myList);
			}else if(src.getActionCommand().equals("Clear")) {
				System.out.println("Clearning Fields");
				myList = "";
				tf.setText(null);
				l.setText(null);
				txta.setText(null);
				
			}else {
				noCount++;
			}
		}catch(Exception ex) {System.out.println(ex);}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NetworkDemo nd = new NetworkDemo();
		String dtm = nd.getDate();
		System.out.println("Thanks for using the app today, "+dtm);
	}

}
