package Helpdesk;
import javax.swing.*;

import java.awt.*;

import java.awt.event.*;

import java.sql.*;
import java.awt.EventQueue;

 

public class PLogin extends JFrame

{

    JLabel l1, l2, l3;

    JTextField tf1;

    JButton btn1;

    JPasswordField p1;
    private JButton btnBack;
    private JLabel lblNewLabel_1;

 

    PLogin()

    {

        setTitle("Login Form");

        setVisible(true);

        setSize(800, 800);

        getContentPane().setLayout(null);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

 

        l1 = new JLabel("PROFESSIONAL LOGIN");
        l1.setIcon(new ImageIcon("C:\\Users\\MB NANDHINI\\Pictures\\Digital Backgrounds & Scenes\\images (12).jpg"));

        l1.setForeground(Color.blue);

        l1.setFont(new Font("Serif", Font.BOLD, 20));

 

        l2 = new JLabel("Enter UserName:");
        l2.setForeground(Color.YELLOW);
        l2.setFont(new Font("SansSerif", Font.BOLD, 15));

        l3 = new JLabel("Enter Password:");
        l3.setForeground(new Color(255, 255, 0));
        l3.setFont(new Font("SansSerif", Font.BOLD, 15));

        tf1 = new JTextField();

        p1 = new JPasswordField();
        p1.addInputMethodListener(new InputMethodListener() {
        	public void caretPositionChanged(InputMethodEvent event) {
        		lblNewLabel_1.setText("TextChanged");
        	}
        	
        	public void inputMethodTextChanged(InputMethodEvent event) {
        		lblNewLabel_1.setText("TextChanged");
        	}
        });

        btn1 = new JButton("Submit");
        btn1.setForeground(new Color(51, 0, 204));
        btn1.setFont(new Font("Times New Roman", Font.BOLD, 14));

 

        l1.setBounds(-32, 11, 190, 57);

        l2.setBounds(137, 86, 200, 30);

        l3.setBounds(137, 127, 200, 30);

        tf1.setBounds(323, 81, 200, 30);

        p1.setBounds(323, 129, 200, 30);

        btn1.setBounds(174, 188, 100, 30);
        
        lblNewLabel_1 = new JLabel("new");
        lblNewLabel_1.addInputMethodListener(new InputMethodListener() {
        	public void caretPositionChanged(InputMethodEvent event) {
        		
        	}
        	public void inputMethodTextChanged(InputMethodEvent event) {
        	}
        });
        lblNewLabel_1.setForeground(Color.WHITE);
        lblNewLabel_1.setBounds(541, 127, 164, 40);
        getContentPane().add(lblNewLabel_1);

 

        getContentPane().add(l1);

        getContentPane().add(l2);

        getContentPane().add(tf1);

        getContentPane().add(l3);

        getContentPane().add(p1);

        getContentPane().add(btn1);
        
        btnBack = new JButton("Back");
        btnBack.setForeground(new Color(51, 51, 255));
        btnBack.setFont(new Font("Times New Roman", Font.BOLD, 14));
        btnBack.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		dispose();
        		try {
					Index window = new Index();
					window.setVisible(true);
				} catch (Exception ex) {
					ex.printStackTrace();
				}
        		
        	}
        	
        });
        btnBack.setBounds(323, 188, 89, 30);
        getContentPane().add(btnBack);
        
        JLabel lblNewLabel = new JLabel("New label");
        lblNewLabel.setIcon(new ImageIcon("C:\\Users\\MB NANDHINI\\Pictures\\Digital Backgrounds & Scenes\\whenmorningbreaks.jpg"));
        lblNewLabel.setBounds(0, 0, 784, 741);
        getContentPane().add(lblNewLabel);

        btn1.addActionListener(new ActionListener()
        		{
        			 public void actionPerformed(ActionEvent e)

        			 
        			    {String uname=tf1.getText();
    	        		String pwd=p1.getText();
    	        		int n=0;
    	        		try{
    	                  	 Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","jaijaisai");
    	               		Statement stat=con.createStatement();//create statement
    	               		ResultSet rs=null;
    	               		if(con!=null)	
    	                      {
    	               			System.out.println("Success");
    	                      }
    	               		rs=stat.executeQuery("SELECT * FROM prof");
    	               		while(rs.next()){
    	               			String uname1=rs.getString(2);
    	               			String pwd1=rs.getString(3);
    	               			//System.out.println(uname1+pwd1);
    	               			if(uname1.equals(uname) && pwd.equals(pwd1))
    	               			{
    	               				JOptionPane.showMessageDialog(null, "Login Successfull" );
    	               				dispose();
    	               				PProfile pp = new PProfile();
    	        					pp.setVisible(true);
    	                			n=1;
    	               			}
    	               		}
    	               			if(n==0)
    	               			{
   
        	               				JOptionPane.showMessageDialog(null, "Invalid User" );
        	               				rs.close();
                	               		stat.close();
                	                   con.close();
                	                   return;
     
    	               			}
    	               			
    	               		
    	               		
    	        		}
    	                   catch(Exception ex)
    	                   {
    	                  	 ex.printStackTrace();
    	                   }
    				 
    			    }});

    }

 

   
 

    
 

    public static void main(String args[])

    {
    	EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PLogin pu = new PLogin();
					pu.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

    }
}