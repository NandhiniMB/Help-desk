package Helpdesk;
import java.awt.EventQueue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.*;


import java.awt.*;

import java.awt.event.*;

import java.sql.*;
import java.util.regex.Pattern;


	/**
	 * Launch the application.
	 */
	
	

	/**
	 * Create the application.
	 */
	public class Preg extends JFrame{
		

		
		private JFrame frame;

			
		
	     String[] job={"Doctor","Engineer","Teacher","Tutor","Electrician","Driver","Plumber"};
	     
	     String[] gen={"Male","Female","Transgender"};
	     
	    JLabel l2, l3, l4, l5, l6, l7, l8, l9,l10,l11,l12;

	    JTextField tf1, tf2, tf5, tf6, tf7,tf9,tf11;
	    
	    JComboBox tf8,tf10;

	    JButton btn1, btn2;

	    JPasswordField p1, p2;
	    private JButton btnAlreadyProfessional;
	    private JLabel lblNewLabel;
	    private JTextField textField;
	    private JLabel lblNewLabel_2;
	    private JLabel lblNewLabel_4;

	 

	    Preg()
	     {
	    	getContentPane().setBackground(new Color(204, 204, 204));
	    	getContentPane().setFont(new Font("MS UI Gothic", Font.BOLD | Font.ITALIC, 14));

	        setVisible(true);

	        setSize(700, 700);

	        getContentPane().setLayout(null);

	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	        setTitle(" Registration Form  ");

	 

	        l2 = new JLabel(" Name:");
	        l2.setForeground(Color.WHITE);
	        l2.setFont(new Font("MS PGothic", Font.BOLD | Font.ITALIC, 15));

	        l3 = new JLabel("User Name:");
	        l3.setForeground(Color.WHITE);
	        l3.setFont(new Font("MS PGothic", Font.BOLD | Font.ITALIC, 15));

	        l4 = new JLabel("Password:");
	        l4.setForeground(Color.WHITE);
	        l4.setFont(new Font("MS PGothic", Font.BOLD | Font.ITALIC, 15));
	        
	        l5 =new JLabel("Re-enter Password");
	        l5.setForeground(Color.WHITE);
	        l5.setFont(new Font("MS PGothic", Font.BOLD | Font.ITALIC, 15));

	        l6 = new JLabel("Email");
	        l6.setForeground(Color.WHITE);
	        l6.setFont(new Font("MS PGothic", Font.BOLD | Font.ITALIC, 15));

	        l7 = new JLabel("Address:");
	        l7.setForeground(Color.WHITE);
	        l7.setFont(new Font("MS PGothic", Font.BOLD | Font.ITALIC, 15));

	        l8 = new JLabel("Phone number");
	        l8.setForeground(Color.WHITE);
	        l8.setFont(new Font("MS PGothic", Font.BOLD | Font.ITALIC, 15));

	        l9 = new JLabel("Gender");
	        l9.setForeground(Color.WHITE);
	        l9.setFont(new Font("MS PGothic", Font.BOLD | Font.ITALIC, 15));
	        
	        l10 = new JLabel("Age");
	        l10.setForeground(Color.WHITE);
	        l10.setFont(new Font("MS PGothic", Font.BOLD | Font.ITALIC, 15));
	        
	        l11 =new JLabel("Job");
	        l11.setForeground(Color.WHITE);
	        l11.setFont(new Font("MS PGothic", Font.BOLD | Font.ITALIC, 15));
	        
	        l12 =new JLabel("Specialisation");
	        l12.setForeground(Color.WHITE);
	        l12.setFont(new Font("MS PGothic", Font.BOLD | Font.ITALIC, 15));

	        tf1 = new JTextField();

	        tf2 = new JTextField();

	        p1 = new JPasswordField();

	        p2 = new JPasswordField();

	        tf5 = new JTextField();

	        tf6 = new JTextField();

	        tf7 = new JTextField();
	        
	   
	        tf8=new JComboBox(gen);
		    
	        tf9 = new JTextField(); 
	        tf9.addKeyListener(new KeyAdapter() {
	        	@Override
	        	public void keyTyped(KeyEvent e) {
	        		 
	     	        		char input=e.getKeyChar();
	     	        		if((input>='a' && input <='z')||(input>='A' && input <='Z')){
	     	        		lblNewLabel_2.setText("Enter Valid Age");
	     	        		}
	     	        		else
	     	        		{
	     	        			lblNewLabel_2.setText("");
	     	        		}
	     	        		
	     	        	}
	     	        });
	        	
	        
	        tf10=new JComboBox(job); 
	        
	        tf11 = new JTextField(); 

	        btn1 = new JButton("Register");
	        btn1.setFont(new Font("Tahoma", Font.BOLD, 15));

	        btn2 = new JButton("Clear");
	        btn2.setFont(new Font("Tahoma", Font.BOLD, 15));

	 

	        btn2.addActionListener(new ActionListener(){

	        public void actionPerformed(ActionEvent e) 
	        {

	                   tf1.setText("");

	                   tf2.setText("");

	                   p1.setText("");

	                   p2.setText("");

	                   tf5.setText("");

	                   tf6.setText("");

	                   tf7.setText("");

	               }
	        });

	        l2.setBounds(80, 80, 200, 30);

	        l3.setBounds(80, 111, 210, 30);

	        l4.setBounds(80, 150, 200, 30);

	        l5.setBounds(80, 190, 200, 30);

	        l6.setBounds(80, 230, 200, 30);

	        l7.setBounds(80, 270, 200, 30);

	        l8.setBounds(80, 310, 200, 30);
	        
	        l9.setBounds(80,350,200,30);
	        
	        l10.setBounds(80,390,200,30);
	        
	        l11.setBounds(80,430,200,30);

	        tf1.setBounds(300, 70, 200, 30);

	        tf2.setBounds(300, 110, 200, 30);

	        p1.setBounds(300, 150, 200, 30);

	        p2.setBounds(300, 190, 200, 30);

	        tf5.setBounds(300, 230, 200, 30);

	        tf6.setBounds(300, 270, 200, 30);

	        tf7.setBounds(300, 310, 200, 30);
	        
	        tf8.setBounds(300, 350, 200, 30);
	        
           tf9.setBounds(300,390,200,30);
	        
	        tf10.setBounds(300,430,200,30);
	        
	        l12.setBounds(80,470,200,30);
	        
	        tf11.setBounds(300,470,200,30);

	        btn1.setBounds(130, 562, 100, 30);

	        btn2.setBounds(253, 562, 100, 30);
	        
	        JLabel lblNewLabel_3 = new JLabel("New label");
	        lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\MB NANDHINI\\Pictures\\Digital Backgrounds & Scenes\\images (13).jpg"));
	        lblNewLabel_3.setBounds(0, 0, 292, 58);
	        getContentPane().add(lblNewLabel_3);
	        
	        lblNewLabel_2 = new JLabel("");
	        lblNewLabel_2.setForeground(Color.WHITE);
	        lblNewLabel_2.setBounds(510, 390, 116, 32);
	        getContentPane().add(lblNewLabel_2);

	        getContentPane().add(l2);

	        getContentPane().add(tf1);

	        getContentPane().add(l3);

	        getContentPane().add(tf2);

	        getContentPane().add(l4);

	        getContentPane().add(p1);

	        getContentPane().add(l5);

	        getContentPane().add(p2);

	        getContentPane().add(l6);

	        getContentPane().add(tf5);

	        getContentPane().add(l7);

	        getContentPane().add(tf6);

	        getContentPane().add(l8);

	        getContentPane().add(tf7);

	        getContentPane().add(btn1);

	        getContentPane().add(btn2);
	        
	        getContentPane().add(l9);
	        
	        getContentPane().add(l10);
	        
	        getContentPane().add(l11);

	        getContentPane().add(tf8);
	        
	        getContentPane().add(tf9);
	        
	        getContentPane().add(tf10);
	        
	        getContentPane().add(tf11);
	        
	        getContentPane().add(l12);
	        
	        btnAlreadyProfessional = new JButton("Already Professional");
	        btnAlreadyProfessional.setFont(new Font("Tahoma", Font.BOLD, 15));
	        btnAlreadyProfessional.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {
	        		dispose();
	        		try {
	  					PLogin window = new PLogin();
	  					window.setVisible(true);
	  				} catch (Exception ex) {
	  					ex.printStackTrace();
	  				}
	        		
	        	}
	        });
	        btnAlreadyProfessional.setBounds(150, 603, 191, 23);
	        getContentPane().add(btnAlreadyProfessional);
	        
	        JButton btnBack = new JButton("Back");
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
	        btnBack.setBounds(208, 627, 89, 23);
	        getContentPane().add(btnBack);
	        
	        JLabel lblNewLabel_1 = new JLabel("Hirecost");
	        lblNewLabel_1.setForeground(Color.WHITE);
	        lblNewLabel_1.setFont(new Font("MS PGothic", Font.BOLD | Font.ITALIC, 15));
	        lblNewLabel_1.setBounds(80, 514, 153, 23);
	        getContentPane().add(lblNewLabel_1);
	        
	        textField = new JTextField();
	        textField.setBounds(300, 507, 200, 30);
	        getContentPane().add(textField);
	        textField.setColumns(10);
	        
	        lblNewLabel = new JLabel("New label");
	        tf7.addKeyListener(new KeyAdapter() {
	        	@Override
	        	public void keyTyped(KeyEvent e) {
	        		
	    	        		char input=e.getKeyChar();
	     	        		if((input>='a' && input <='z')||(input>='A' && input <='Z')){
	     	        		lblNewLabel_4.setText("Enter Valid phone Number");
	     	        		}
	     	        		else{
	     	        			lblNewLabel_4.setText("");	
	     	        		}
	    	        	}
	    	        });
	        
	        lblNewLabel_4 = new JLabel("");
	        lblNewLabel_4.setForeground(Color.WHITE);
	        lblNewLabel_4.setBounds(531, 319, 143, 14);
	        getContentPane().add(lblNewLabel_4);
	    	 
	        lblNewLabel.setIcon(new ImageIcon("C:\\Users\\MB NANDHINI\\Pictures\\Digital Backgrounds & Scenes\\whenmorningbreaks.jpg"));
	        lblNewLabel.setBounds(-83, -52, 767, 713);
	        getContentPane().add(lblNewLabel);

	        btn1.addActionListener(new ActionListener(){
	        public void actionPerformed(ActionEvent e) 
	        {
                 
                
	        	 tochecknull();
	               int x = 0;

	               String pname = tf1.getText();

	               String puname = tf2.getText();

	    

	               char[] pwd1 = p1.getPassword();

	               char[] pwd2 = p2.getPassword(); 

	               String pwd3 = new String(pwd1);

	               String pwd4 = new String(pwd2);
	               PwdVal(pwd3,pwd4);
	               
	          
	    

	               String pemail = tf5.getText();
	               
	              
	               String paddr = tf6.getText();
	               
	               String ppn=tf7.getText();

	               int ppno = Integer.parseInt(tf7.getText());
                      
	              phnoval(ppn);
	               
	               String pgender = (String)tf8.getSelectedItem();
	               
	               int page=Integer.parseInt(tf9.getText());
	               
	               String pJob=(String)tf10.getSelectedItem();
	               
	               String pspec=String.valueOf(tf11.getText());
	               
	               String phcos=String.valueOf(textField.getText());
	               
	               
	               
	               
                 try{
                	 Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","jaijaisai");
             		Statement stat=con.createStatement();//create statement
             		if(con!=null)
             			System.out.println("Success");
             		String ins="Insert into Prof Values('"+pname+"','"+puname+"','"+pwd3+"','"+pemail+"','"+paddr+"',"+ppno+",'"+pgender+"',"+page+",'"+pJob+"','"+pspec+"','"+phcos+"')";
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

	    }
	   public void tochecknull(){
           if(tf1.getText().equals("") ||tf2.getText().equals("")|| p1.getText().equals("")||p2.getText().equals("")||tf5.getText().equals("")||tf6.getText().equals("")||tf7.getText().equals("")||tf9.getText().equals("")||tf11.getText().equals("")) 
         {
            
             
             JOptionPane.showMessageDialog(null,"Enter values for the fields","Empty fields not allowed",
  		JOptionPane.ERROR_MESSAGE);
             show();
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
	    	show();
	    	
	    }
	    if((pwd1.length()>0 && pwd1.length()<8) || pwd1.length()>15)
	    {
	    	valid =false;
	    	JOptionPane.showMessageDialog(null,"Password Should be with minimumof 8 and maxium of 15 characters :","Invalid Password",
	    	    	JOptionPane.ERROR_MESSAGE);
	    	show();
	    	
	    }
	    
	    if(valid=false){
	    	p1.setText("");
	    	p2.setText("");
	    	
	    	
	    }
	    
	    //Runtime.getRuntime().exit(getDefaultCloseOperation());
	    }
    public void phnoval(String ppno){
          
          
          
          
          if((ppno.length()!=10))
          
          {
                JOptionPane.showMessageDialog(null,"Enter correct Phonenumber"," Incorrect PhoneNumber",
  		JOptionPane.ERROR_MESSAGE);
                }
          return;
          }
               
           
                
                             
           
	    
	    
	   

      public static void main(String[] args) {
  		EventQueue.invokeLater(new Runnable() {
  			public void run() {
  				try {
  					Preg window = new Preg();
  					window.setVisible(true);
  				} catch (Exception e) {
  					e.printStackTrace();
  				}
  			}
  		});

		}		
}




