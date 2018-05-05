package Helpdesk;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class PProfile extends JFrame {

	private JFrame frame;
	String[] job={"Doctor","Engineer","Teacher","Tutor","Electrician","Driver","Plumber"};
    
    String[] gen={"Male","Female","Transgender"};
    
   JLabel l1, l2, l3, l6, l7, l8, l9,l10,l11;

   JTextField tf1, tf2, tf5, tf6, tf7,tf9,tf11;
   
   JComboBox tf8,tf10;
   private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the application.
	 */
	public PProfile() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		setSize(700, 700);
		 l2 = new JLabel(" Name:");

	        l3 = new JLabel("User Name:");

	        l6 = new JLabel("Email");

	        l7 = new JLabel("Address:");

	        l8 = new JLabel("Phone number");

	        l9 = new JLabel("Gender");
	        
	        l10 = new JLabel("Age");
	        
	        l11 =new JLabel("Job");

	        tf1 = new JTextField();

	        tf2 = new JTextField();

	        tf5 = new JTextField();

	        tf6 = new JTextField();

	        tf7 = new JTextField();
	        
	   
	        tf8=new JComboBox(gen);
		    
	        tf9 = new JTextField(); 
	        
	        tf10=new JComboBox(job); 
	        
	        tf11 = new JTextField(); 
	       // l1.setBounds(100, 30, 400, 30);

	        l2.setBounds(80, 70, 200, 30);

	        l3.setBounds(80, 110, 200, 30);

	        l6.setBounds(80, 230, 200, 30);

	        l7.setBounds(80, 270, 200, 30);

	        l8.setBounds(80, 310, 200, 30);
	        
	        l9.setBounds(80,350,200,30);
	        
	        l10.setBounds(80,390,200,30);
	        
	        l11.setBounds(80,430,200,30);

	        tf1.setBounds(300, 70, 200, 30);

	        tf2.setBounds(300, 110, 200, 30);

	        tf5.setBounds(300, 230, 200, 30);

	        tf6.setBounds(300, 270, 200, 30);

	        tf7.setBounds(300, 310, 200, 30);
	        
	        tf8.setBounds(300, 350, 200, 30);
	        
            tf9.setBounds(300,390,200,30);
	        
	        tf10.setBounds(300,430,200,30);
	        
	        tf11.setBounds(300,470,200,30);
	        getContentPane().setLayout(null);

	        

	 

	       // getContentPane().add(l1);

	        getContentPane().add(l2);

	        getContentPane().add(tf1);

	        getContentPane().add(l3);

	        getContentPane().add(tf2);

	        getContentPane().add(l6);

	        getContentPane().add(tf5);

	        getContentPane().add(l7);

	        getContentPane().add(tf6);

	        getContentPane().add(l8);

	        getContentPane().add(tf7);

	        //getContentPane().add(btn1);

	       // getContentPane().add(btn2);
	        
	        getContentPane().add(l9);
	        
	        getContentPane().add(l10);
	        
	        getContentPane().add(l11);

	        getContentPane().add(tf8);
	        
	        getContentPane().add(tf9);
	        
	        getContentPane().add(tf10);
	        
	        getContentPane().add(tf11);
	        
	        lblNewLabel = new JLabel("Specialisation");
	        lblNewLabel.setBounds(73, 478, 137, 14);
	        getContentPane().add(lblNewLabel);
	    }

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PProfile window = new PProfile();
					window.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
