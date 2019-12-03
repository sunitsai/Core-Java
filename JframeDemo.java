package PraticeProgram;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSet;

public class JframeDemo implements ActionListener{
	
	JLabel  l1,l2,l3,l4;
	JButton b1,b2,b3,b4;
	JTextField t1,t2,t3,t4;
	
	public JframeDemo() {
	
		JFrame jf = new JFrame("My Jframe");
		
		jf.setSize(500, 500);
		jf.setVisible(true);
		jf.setLayout(null);
		
		b1 = new JButton("Insert");
		b2 = new JButton("Search");
		b3 = new JButton("Update");
		b4 = new JButton("Delete");
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		
		l1 = new JLabel("ID");
		l2 = new JLabel("Name");
		l3 = new JLabel("Contact");
		l4 = new JLabel("Email");
		
		t1 = new JTextField();
		t2 = new JTextField();
		t3 = new JTextField();
		t4 = new JTextField();
		
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
		jf.add(b4);
		
		
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
		b4.setBounds(150, 200, 90, 20);
		
	}

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		new JframeDemo();
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource() == b1){
			
			String f = t2.getText();
			String c = t3.getText();
			String em = t4.getText();
			
			try {
				
				Class.forName("com.mysql.jdbc.Driver");
				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/placement","root","");
				String sql="insert into student(name,contact,email) value(?,?,?)";
				PreparedStatement pst=(PreparedStatement) conn.prepareStatement(sql);
				pst.setString(1, f);
				pst.setString(2, c);
				pst.setString(3, em);
				pst.executeUpdate();
				System.out.println("Data Inserted Successfully");
				t2.setText("");
				t3.setText("");
				t4.setText("");
				
				
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
			
			//System.out.println("Inserted");
		}else if(e.getSource() == b2){
			int id = Integer.parseInt(t1.getText());
			try {
				
				Class.forName("com.mysql.jdbc.Driver");
				Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/placement","root", "");
				String sql="Select * from student where id=?";
				PreparedStatement pst=(PreparedStatement) conn.prepareStatement(sql);
				pst.setInt(1, id);
				ResultSet rs=(ResultSet) pst.executeQuery();
				
				if(rs.next())
				{
					t2.setText(rs.getString("name"));
					t3.setText(rs.getString("contact"));
					t4.setText(rs.getString("email"));
				}
				else
				{
					System.out.println("Id Not Found");
				}
				
				
			} catch (Exception e2) {
				// TODO: handle exception
				
				e2.printStackTrace();
			}
			
		}else if(e.getSource() == b3){
			
			System.out.println("Updated");
		}else if(e.getSource() == b4){
			
			System.out.println("Deleted");
		}
	}

}
