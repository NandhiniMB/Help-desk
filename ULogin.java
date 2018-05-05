package Helpdesk;
import Helpdesk.Help;
import javax.swing.*;

import java.awt.*;

import java.awt.event.*;

import java.sql.*;

 

public class ULogin extends JFrame

{

    JLabel l1, l2, l3;

    JTextField tf1;

    JButton btn1;

    JPasswordField p1;
    private JButton btnBack;
    private JLabel lblNewLabel_1;

    ULogin()

    {
    	getContentPane().setBackground(new Color(255, 255, 255));

        setTitle("Login Form");

        setVisible(true);

        setSize(800, 800);

        getContentPane().setLayout(null);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

 

        l1 = new JLabel("User Login :");
        l1.setIcon(new ImageIcon("C:\\Users\\MB NANDHINI\\Pictures\\Digital Backgrounds & Scenes\\images (12).jpg"));

        l1.setForeground(Color.blue);

        l1.setFont(new Font("Serif", Font.BOLD, 20));

 

        l2 = new JLabel("Enter UserName:");
        l2.setFont(new Font("Yu Gothic Light", Font.BOLD | Font.ITALIC, 15));

        l3 = new JLabel("Enter Password:");
        l3.setFont(new Font("Yu Gothic Light", Font.BOLD | Font.ITALIC, 15));

        tf1 = new JTextField();

        p1 = new JPasswordField();

        btn1 = new JButton("Submit");
        btn1.setFont(new Font("Yu Gothic UI", Font.BOLD, 15));

 

        l1.setBounds(263, 11, 227, 79);

        l2.setBounds(177, 116, 200, 30);

        l3.setBounds(177, 157, 200, 30);

        tf1.setBounds(418, 117, 200, 30);

        p1.setBounds(418, 157, 200, 30);

        btn1.setBounds(238, 198, 100, 30);

 

        getContentPane().add(l1);

        getContentPane().add(l2);

        getContentPane().add(tf1);

        getContentPane().add(l3);

        getContentPane().add(p1);

        getContentPane().add(btn1);
        
        JButton btnNewButton = new JButton("New user");
        btnNewButton.setFont(new Font("Yu Gothic UI", Font.BOLD, 15));
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		dispose();
        		try
        		{
        			Ureg ur=new Ureg();
        			ur.setVisible(true);
        		}
        		 catch(Exception ex)
                {
               	 ex.printStackTrace();
                }
			 
        	
        }});
        btnNewButton.setBounds(313, 277, 118, 29);
        getContentPane().add(btnNewButton);
        
        JLabel lblNewLabel = new JLabel("Create A New People Account");
        lblNewLabel.setForeground(new Color(0, 0, 51));
        lblNewLabel.setFont(new Font("MS PGothic", Font.ITALIC, 16));
        lblNewLabel.setBounds(263, 239, 257, 14);
        getContentPane().add(lblNewLabel);
        
        btnBack = new JButton("Back");
        btnBack.setFont(new Font("Yu Gothic UI", Font.BOLD, 15));
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
        btnBack.setBounds(393, 198, 89, 30);
        getContentPane().add(btnBack);
        
        lblNewLabel_1 = new JLabel("");
        lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\MB NANDHINI\\Pictures\\Digital Backgrounds & Scenes\\whenmorningbreaks.jpg"));
        lblNewLabel_1.setBounds(0, 0, 784, 741);
        getContentPane().add(lblNewLabel_1);

        btn1.addActionListener(new ActionListener()
        		{
        			 public void actionPerformed(ActionEvent e)

        			    {
        				 String uname=tf1.getText();
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
        	               		rs=stat.executeQuery("SELECT * FROM web_user");
        	               		while(rs.next()){
        	               			String uname1=rs.getString(1);
        	               			String pwd1=rs.getString(4);
        	               			//System.out.println(uname1+pwd1);
        	               			if(uname1.equals(uname) && pwd.equals(pwd1))
        	               			{
        	               				JOptionPane.showMessageDialog(null, "Login Successfull" );
        	               				dispose();
        	               				Help h=new Help();
        	                			h.setVisible(true);
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
        				 
        			    }
        				 
        				 
        		});

    }  
 

    public static void main(String args[])
{

    	EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ULogin U = new ULogin();
					U.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

    }
}