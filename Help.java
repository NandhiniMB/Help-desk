package Helpdesk;

import java.awt.EventQueue;
import javax.swing.*;
import javax.swing.RowSorter.SortKey;

import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

import Swings.Pizza;

import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.EmptyBorder;

public class Help extends JFrame {

	String[] job={"Doctor","Engineer","Teacher","Tutor","Electrician","Driver","Plumber"};
    
    String[] gen={"Male","Female","Transgender"};
    
    String[] age={">20","20-30","30-40","40-50"};
    private JTable table;
    private JTable table_1;
    
    
	/**
	 * Launch the application.
	 */
	

	
    /**
	 * Create the application.
	 */
	Help() {
	
	/**
	 * Initialize the contents of the frame.
	 */ 
		setSize(1090, 780);
	       setBounds(500, 500, 800, 800);
	       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		table = new JTable();
		JScrollPane pane=new JScrollPane();
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(658, 433, 17, 137);
		getContentPane().add(scrollBar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setViewportBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		scrollPane.setBounds(54, 568, 621, -135);
		getContentPane().add(scrollPane);
		
		JLabel lblHirecost = new JLabel("HireCost");
		lblHirecost.setForeground(Color.WHITE);
		lblHirecost.setFont(new Font("Sitka Display", Font.BOLD | Font.ITALIC, 15));
		lblHirecost.setBounds(555, 420, 120, 14);
		getContentPane().add(lblHirecost);
		
		JLabel lblNewLabel_10 = new JLabel("Age");
		lblNewLabel_10.setForeground(Color.WHITE);
		lblNewLabel_10.setFont(new Font("Sitka Display", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_10.setBounds(476, 420, 46, 14);
		getContentPane().add(lblNewLabel_10);
		
		JLabel lblNewLabel_9 = new JLabel("Address");
		lblNewLabel_9.setForeground(Color.WHITE);
		lblNewLabel_9.setFont(new Font("Sitka Display", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_9.setBounds(353, 420, 83, 14);
		getContentPane().add(lblNewLabel_9);
		
		JLabel lblNewLabel_6 = new JLabel("Name");
		lblNewLabel_6.setBackground(Color.BLACK);
		lblNewLabel_6.setForeground(Color.WHITE);
		lblNewLabel_6.setFont(new Font("Sitka Display", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_6.setBounds(80, 412, 81, 30);
		getContentPane().add(lblNewLabel_6);
		
		table_1 = new JTable();
		table_1.setBounds(508, 420, 243, -177);
		getContentPane().add(table_1);
		
		
		table.setBounds(54, 433, 621, 137);
		getContentPane().add(table);
		DefaultTableModel tableModel=new DefaultTableModel(new Object[]{"Column1","Column2","Column3","Column4","Column5","Column6"},0);
		table.setModel(tableModel);
		
		JPanel panel = new JPanel();
		panel.setBounds(54, 65, 621, 256);
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setToolTipText("FILTERS");
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(84, 5, -62, 14);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("JOB");
				lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		lblNewLabel_1.setBounds(157, 51, 90, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("GENDER");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		lblNewLabel_2.setBounds(157, 92, 102, 14);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("AGE");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		lblNewLabel_3.setBounds(157, 127, 90, 14);
		panel.add(lblNewLabel_3);
		
		
		JComboBox comboBox = new JComboBox(job);
		comboBox.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
			}
		});
		comboBox.setFont(new Font("Segoe Print", Font.BOLD, 14));
		comboBox.setForeground(Color.RED);
		comboBox.setBounds(290, 48, 183, 20);
		panel.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox(gen);
		comboBox_1.setFont(new Font("Segoe Print", Font.BOLD | Font.ITALIC, 13));
		comboBox_1.setForeground(Color.RED);
		comboBox_1.setBounds(290, 89, 183, 20);
		panel.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox(age);
		comboBox_2.setFont(new Font("Segoe Print", Font.BOLD | Font.ITALIC, 13));
		comboBox_2.setForeground(Color.RED);
		comboBox_2.setBounds(290, 124, 183, 20);
		panel.add(comboBox_2);
		
		
		JButton btnNewButton_2 = new JButton("GET DETAILS");
		btnNewButton_2.setFont(new Font("Sitka Small", Font.BOLD | Font.ITALIC, 13));
		btnNewButton_2.setBounds(252, 331, 171, 23);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String j=(String)comboBox.getSelectedItem();
			    String g=(String)comboBox_1.getSelectedItem();
			    String a=(String)comboBox_2.getSelectedItem();
			int n=0;
				try{
                 	 Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","jaijaisai");
              		Statement stat=con.createStatement();//create statement
              		ResultSet rs=null;
              		if(con!=null)	
                     {
              			System.out.println("Success");
                     }
              		rs=stat.executeQuery("SELECT * FROM Prof order by page");
              		while(rs.next()){
              			String pj=rs.getString(9);
              			String pg=rs.getString(7);
              			String pa=rs.getString(8);
              			String pn=rs.getString(1);
              			String pe=rs.getString(4);
              			String pp=rs.getString(6);
              			String paddr=rs.getString(5);
              			String phcost=rs.getString(11);
              			
              			
              			
              			if(pj.equals(j) && pg.equals(g))
               			{
               				int count=tableModel.getRowCount()+1;
               				tableModel.addRow(new Object[]{pn,pe,pp,paddr,pa,phcost});
               				JOptionPane.showMessageDialog(null, "Professional found" );
               				n=1;
               				
               			
               			}
              			
              			
              		}
              		if(n==0)
              				{
          				JOptionPane.showMessageDialog(null, "No Professional found" );
          			}
				}
				catch(Exception ex)
                {
               	 ex.printStackTrace();
                }
			}
				
			
		});
		getContentPane().add(btnNewButton_2);
		
		
		
		
		
		
		JButton btnNewButton = new JButton("APPLY FILTERS");
		btnNewButton.setFont(new Font("Sitka Small", Font.BOLD | Font.ITALIC, 13));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(215, 202, 165, 23);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\MB NANDHINI\\Pictures\\Digital Backgrounds & Scenes\\images (11).jpg"));
		lblNewLabel_5.setBounds(10, 5, 137, 193);
		panel.add(lblNewLabel_5);
		
		JLabel lblSort = new JLabel("Sort");
		lblSort.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		lblSort.setBounds(157, 158, 46, 14);
		panel.add(lblSort);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Age");
		
		
		rdbtnNewRadioButton.setFont(new Font("Sitka Display", Font.PLAIN, 14));
		rdbtnNewRadioButton.setForeground(Color.RED);
		rdbtnNewRadioButton.addItemListener(new ItemListener() {
			public void itemStatechanged(ItemEvent e) {
				table.setAutoCreateRowSorter(true);
				table.repaint();
			}

			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		rdbtnNewRadioButton.setBounds(282, 154, 58, 23);
		panel.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Hirecost");
		rdbtnNewRadioButton_1.setFont(new Font("Sitka Display", Font.PLAIN, 13));
		rdbtnNewRadioButton_1.setForeground(Color.RED);
		rdbtnNewRadioButton_1.setBounds(363, 151, 109, 23);
		panel.add(rdbtnNewRadioButton_1);
		
		ButtonGroup bg=new ButtonGroup();
		bg.add( rdbtnNewRadioButton);
		bg.add( rdbtnNewRadioButton_1);
		
		
		
		JLabel label = new JLabel("");
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				label.setText("fill in to simplify searching");
			}
			@Override
			public void mouseExited(MouseEvent e) {
				label.setText("");	
			}
		});
		label.setForeground(Color.RED);
		label.setBounds(418, 168, 193, 57);
		panel.add(label);
		
		
		
		JLabel lblNewLabel_7 = new JLabel("Mail");
		lblNewLabel_7.setFont(new Font("Sitka Display", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_7.setForeground(Color.WHITE);
		lblNewLabel_7.setBounds(179, 420, 76, 14);
		getContentPane().add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Phone");
		lblNewLabel_8.setForeground(Color.WHITE);
		lblNewLabel_8.setFont(new Font("Sitka Heading", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_8.setBounds(265, 420, 46, 14);
		getContentPane().add(lblNewLabel_8);
		
		
		JLabel lblNewLabel_4 = 
				new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\MB NANDHINI\\Pictures\\Digital Backgrounds & Scenes\\amigos-con-los-paraguas-en-pasillo-del-centro-comercial-17887080.jpg"));
		lblNewLabel_4.setBounds(-18, 11, 774, 719);
		getContentPane().add(lblNewLabel_4);
		
		
		
	}

	 public static void main(String args[])
	   {

		 EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						Help window = new Help();
						window.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
	    }
}
