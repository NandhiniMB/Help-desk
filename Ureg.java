package Helpdesk;
import javax.swing.*;

import java.awt.*;

import java.awt.event.*;

import java.sql.*;

 

public class Ureg extends JFrame 
  { 

    JLabel l1, l2, l3, l4, l5, l6, l7, l8;

    JTextField tf1, tf2, tf3;

    JButton btn1, btn2;

    JPasswordField p1, p2;
    private JButton btnBack;
    private JLabel lblNewLabel;

 

    Ureg()
     {

        setVisible(true);

        setSize(700, 700);

        getContentPane().setLayout(null);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setTitle("User Registration Form ");

 
        l1 = new JLabel("Registration Form");
        l1.setIcon(new ImageIcon("C:\\Users\\MB NANDHINI\\Pictures\\Digital Backgrounds & Scenes\\images (13).jpg"));

        l1.setForeground(Color.blue);

        l1.setFont(new Font("Serif", Font.BOLD, 20));

 

        l2 = new JLabel("UserName:");
        l2.setFont(new Font("MV Boli", Font.ITALIC, 15));

        l3 = new JLabel("Email-ID:");
        l3.setFont(new Font("MV Boli", Font.ITALIC, 15));

        l4 = new JLabel("Phone No:");
        l4.setFont(new Font("MV Boli", Font.ITALIC, 15));

        l5 = new JLabel("Create Password");
        l5.setFont(new Font("MV Boli", Font.ITALIC, 15));

        l6 = new JLabel("Confirm Password"); 
        l6.setFont(new Font("MV Boli", Font.ITALIC, 15));

        tf1 = new JTextField();

        tf2 = new JTextField();
        
        tf3 = new JTextField();

        p1 = new JPasswordField();

        p2 = new JPasswordField();

       
       
 

        btn1 = new JButton("Register");
        btn1.setFont(new Font("Tahoma", Font.BOLD, 15));

        btn2 = new JButton("Clear");
        btn2.setFont(new Font("Tahoma", Font.BOLD, 15));

 

        btn1.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e) 
        {
            tochecknull();
           
               int x = 0;

               String uname = tf1.getText();

               String umail = tf2.getText();
               
               int upno=Integer.parseInt(tf3.getText());

    

               char[] s3 = p1.getPassword();

               char[] s4 = p2.getPassword(); 
                
               
               String s8 = new String(s3);

               String s9 = new String(s4);

                PwdVal(s8,s9);
                try{
               	 Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","jaijaisai");
            		Statement stat=con.createStatement();//create statement
            		if(con!=null)
            			
            			
            			
            		System.out.println("Success");
            		String ins="Insert into web_user Values('"+uname+"','"+umail+"','"+upno+"','"+s8+"')";
            		int n=stat.executeUpdate(ins);
            		if(n==1)
            			{
            			JOptionPane.showMessageDialog(null, "Successfully Registered" );}
                con.close();
	        }
                catch(Exception ex)
                {
               	 ex.printStackTrace();
                }
	            }
	        });
            
               
           

        btn2.addActionListener(new ActionListener(){

        public void actionPerformed(ActionEvent e) 
        {

                   tf1.setText("");

                   tf2.setText("");

                   p1.setText("");

                   p2.setText("");

                   tf3.setText("");

                  
               }
        });

        l1.setBounds(100, 0, 306, 60);

        l2.setBounds(80, 70, 200, 30);

        l3.setBounds(80, 110, 200, 30);

        l4.setBounds(80, 150, 200, 30);

        l5.setBounds(80, 190, 200, 30);
         
        l6.setBounds(80, 230, 200, 30);
        

        tf1.setBounds(300, 70, 200, 30);

        tf2.setBounds(300, 110, 200, 30);

        tf3.setBounds(300, 150, 200, 30);

        p1.setBounds(300, 190, 200, 30);

        p2.setBounds(300, 230, 200, 30);

       

        btn1.setBounds(170, 289, 100, 30);

        btn2.setBounds(287, 289, 100, 30);

 

        getContentPane().add(l1);

        getContentPane().add(l2);

        getContentPane().add(tf1);

        getContentPane().add(l3);

        getContentPane().add(tf2);

        getContentPane().add(l4);

        getContentPane().add(p1);

        getContentPane().add(l5);

        getContentPane().add(p2);

        getContentPane().add(l6);

        getContentPane().add(tf3);


        getContentPane().add(btn1);

        getContentPane().add(btn2);
        
        btnBack = new JButton("Back");
        btnBack.setFont(new Font("Tahoma", Font.BOLD, 15));
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
        btnBack.setBounds(227, 344, 89, 23);
        getContentPane().add(btnBack);
        
        lblNewLabel = new JLabel("New label");
        lblNewLabel.setIcon(new ImageIcon("C:\\Users\\MB NANDHINI\\Pictures\\Digital Backgrounds & Scenes\\whenmorningbreaks.jpg"));
        lblNewLabel.setBounds(10, 0, 674, 661);
        getContentPane().add(lblNewLabel);

    }
 public void tochecknull(){
                 if(tf1.getText().equals("") ||tf2.getText().equals("")|| p1.getText().equals("")||p2.getText().equals("")||tf3.getText().equals("")) 
               {
                  
                   
                   JOptionPane.showMessageDialog(null,"Enter values for the fields","Empty fields not allowed",
	    		JOptionPane.ERROR_MESSAGE);
               }    
            }
 public void PwdVal(String pwd1,String pwd2)
	    {
	    boolean valid=true;
	    if(!pwd1.equals(pwd2))
	    {
	    	valid=false;
	    	JOptionPane.showMessageDialog(null,"Password doesnt match","Invalid Password",
	    	    	JOptionPane.ERROR_MESSAGE);
	    }
	    if((pwd1.length()>0 && pwd1.length()<8) || pwd1.length()>15)
	    {
	    	valid =false;
	    	JOptionPane.showMessageDialog(null,"Password Should be with minimumof 8 and maxium of 15 characters :","Invalid Password",
	    	    	JOptionPane.ERROR_MESSAGE);
	    	
	    }
	    
	    if(valid=false){
	    	p1.setText("");
	    	p2.setText("");
	    	
	    }}
    public static void main(String args[])
   {

        new Ureg();

    }

	

}
