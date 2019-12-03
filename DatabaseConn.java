package PraticeProgram;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class DatabaseConn implements ActionListener{

	JLabel l1,l2,l3,l4;
	JTextField t1,t2,t3,t4;
	JButton b1,b2,b3;
	
	public DatabaseConn() {
	
		JFrame jf = new JFrame("Employee Details");
		
		jf.setSize(500, 500);
		jf.setVisible(true);
		jf.setLayout(null);
		
		
		l1 = new JLabel("Id");
		l2 = new JLabel("Fname");
		l3 = new JLabel("Lname");
		l4 = new JLabel("Contact");
		
		
		t1 =  new JTextField();
		t2 =  new JTextField();
		t3 =  new JTextField();
		t4 =  new JTextField();
		
		
		b1 = new JButton("ADD");
		b2 = new JButton("UPDATE");
		b3 = new JButton("DELETE");
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		
		
		jf.add(l1);
		jf.add(t1);
		jf.add(l2);
		jf.add(t2);
		jf.add(l3);
		jf.add(t3);
		jf.add(l4);
		jf.add(t4);
		
		
		jf.add(b1);
		jf.add(b2);
		jf.add(b3);
	
		
		
		l1.setBounds(50, 50, 120, 20);
		l2.setBounds(50, 80, 120, 20);
		l3.setBounds(50, 110, 120, 20);
		l4.setBounds(50, 140, 120, 20);
		
		
		t1.setBounds(120, 50, 120, 20);
		t2.setBounds(120, 80, 120, 20);
		t3.setBounds(120, 110, 120, 20);
		t4.setBounds(120, 140, 120, 20);
		
		
		b1.setBounds(50, 170, 90, 20);
		b2.setBounds(50, 200, 90, 20);
		b3.setBounds(150, 170, 90, 20);
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new DatabaseConn();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource() == b1){
			try {
				
				Class.forName("com.mysql.jdbc.Driver");
				
			} catch (Exception e2) {
				// TODO: handle exception
			}
			
		}else if(e.getSource() == b2){
			
			System.out.println("Updated");
		}else if(e.getSource() == b3){
			
			System.out.println("Deleted");
		}
	}

}
