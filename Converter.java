import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class CurrencyConverter {
	public static void converter() {
		JFrame f= new JFrame("Converter");
		JLabel l1,l2;
		
		JTextField t1,t2;
		JButton b1,b2,b3;
		l1=new JLabel("Rupees");
		l1.setBounds(20,40,90,30);
		l2=new JLabel("Dollars");
		l2.setBounds(240, 40, 90, 30);
		
		
		t1=new JTextField("0");
		t1.setBounds(80, 40,150, 30);
		t2=new JTextField("0");
		t2.setBounds(240,40,150,30);
		b1=new JButton("INR");
		b1.setBounds(50,80,90,15);
		b2=new JButton("Dollar");
		b2.setBounds(190,80,90,15);
		b3=new JButton("Close");
		b3.setBounds(150, 150, 100, 30);
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				double rupees=Double.parseDouble(t1.getText());
				double dollars=rupees/84.11;
				t2.setText(String.valueOf(dollars));
				
				
			}
		});
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				double dollars=Double.parseDouble(t2.getText());
				double rupees = dollars*84.11;
				t1.setText(String.valueOf(rupees));
			}
		});
		b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				f.dispose();
			}
		});
		f.add(l1);
		f.add(l2);
		f.add(t1);
		f.add(t2);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.setLayout(null);
		f.setSize(500,500);
		f.setVisible(true);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		converter();

	}

}
