package Helpdesk;

import javax.swing.JApplet;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import javax.swing.JDesktopPane;
import javax.swing.JScrollPane;
import javax.swing.JInternalFrame;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Rectangle;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import java.awt.Dimension;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.JMenuItem;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import java.awt.Label;
import java.awt.ScrollPane;
import java.awt.Panel;
import java.awt.List;
import javax.swing.border.TitledBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Index extends JApplet {

	/**
	 * Create the applet.
	 */
	public Index() {
		getContentPane().addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent evt) {
			}
		});
		getContentPane().setFont(new Font("Serif", Font.ITALIC, 11));
		setSize(3000,3000);
		getContentPane().setSize(new Dimension(2000, 2000));
		getContentPane().setBounds(new Rectangle(0, 0, 300, 300));
		getContentPane().setBackground(new Color(102, 0, 51));
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setForeground(Color.RED);
		panel.setBounds(0, 0, 1117, 829);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBounds(329, 57, 1, 1);
		panel.add(desktopPane);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 1316, 71);
		panel.add(menuBar);
		menuBar.setForeground(new Color(0, 0, 0));
		menuBar.setBackground(new Color(238, 232, 170));
		
		JMenu mnHome = new JMenu("Home");
		mnHome.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 12));
		mnHome.setForeground(new Color(255, 69, 0));
		menuBar.add(mnHome);
		
		JMenu mnUser = new JMenu("User");
		mnUser.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 12));
		mnUser.setForeground(new Color(255, 69, 0));
		menuBar.add(mnUser);
		
		JMenuItem mntmLogin = new JMenuItem("Login ");
		mntmLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
  					ULogin window = new ULogin();
  					window.setVisible(true);
  				} 
				catch (Exception ex) {
  					ex.printStackTrace();
  				}
			}
		});
		
		mntmLogin.setForeground(new Color(255, 69, 0));
		mntmLogin.setBackground(Color.WHITE);
		mnUser.add(mntmLogin);
		
		JMenuItem mntmSignUp = new JMenuItem("Sign Up");
		mntmSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
  					Ureg window = new Ureg();
  					window.setVisible(true);
  				} catch (Exception ex) {
  					ex.printStackTrace();
  				}
			}
			
		});
		mntmSignUp.setForeground(new Color(255, 69, 0));
		mnUser.add(mntmSignUp);
		
		JMenu mnProfessional = new JMenu("Professional");
		mnProfessional.setBackground(new Color(255, 69, 0));
		mnProfessional.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 12));
		mnProfessional.setForeground(new Color(255, 69, 0));
		menuBar.add(mnProfessional);
		
		JMenuItem mntmRegister = new JMenuItem("Register");
		mntmRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
  					Preg window = new Preg();
  					window.setVisible(true);
  				} catch (Exception ex) {
  					ex.printStackTrace();
  				}
			}
				
		});
		mntmRegister.setForeground(Color.RED);
		mnProfessional.add(mntmRegister);
		
		JMenuItem mntmLogin_1 = new JMenuItem("Login");
		mntmLogin_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
  					PLogin window = new PLogin();
  					window.setVisible(true);
  				} catch (Exception ex) {
  					ex.printStackTrace();
  				}
			}
				
		});
		mntmLogin_1.setForeground(Color.RED);
		mnProfessional.add(mntmLogin_1);
		
		JMenu mnAbout = new JMenu("About ");
		mnAbout.setBorder(null);
		mnAbout.setBackground(new Color(255, 0, 0));
		mnAbout.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 12));
		mnAbout.setForeground(new Color(255, 69, 0));
		menuBar.add(mnAbout);
		
		JMenuItem menuItem = new JMenuItem("");
		mnAbout.add(menuItem);
		
		Label label = new Label("                      People For People");
		label.setBounds(143, 77, 850, 71);
		label.setForeground(new Color(102, 0, 51));
		label.setFont(new Font("MV Boli", Font.ITALIC, 40));
		panel.add(label);
		
		JLabel lblNaturalHeathCare = new JLabel("natural Heath Care");
		lblNaturalHeathCare.setBounds(1161, 499, 46, -122);
		panel.add(lblNaturalHeathCare);
		
		JLabel lblNewLabel_12 = new JLabel("");
		lblNewLabel_12.setIcon(new ImageIcon("G:\\MSC ss 2nd yr\\java\\images (12).jpeg"));
		lblNewLabel_12.setBounds(328, 463, 463, 231);
		panel.add(lblNewLabel_12);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\MB NANDHINI\\Pictures\\Digital Backgrounds & Scenes\\omaha-seo-little-guy-design-website-design-brand-seo-social-media-photography-video-omaha-caring-for-people-services.jpg"));
		lblNewLabel_4.setBounds(84, 44, 1023, 669);
		panel.add(lblNewLabel_4);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(1152, 42, 184, 279);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("More About NASA ");
		lblNewLabel.setForeground(new Color(204, 51, 102));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel.setBounds(10, 45, 152, 14);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Ebook Website");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_1.setForeground(new Color(204, 51, 102));
		lblNewLabel_1.setBounds(10, 89, 152, 14);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("NASA Teachings Point");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_2.setForeground(new Color(204, 51, 102));
		lblNewLabel_2.setBounds(10, 132, 174, 25);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("NASAs Health Care");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_3.setForeground(new Color(204, 51, 102));
		lblNewLabel_3.setBounds(10, 182, 174, 14);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_5 = new JLabel("NASA Empowerment");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_5.setForeground(new Color(204, 51, 102));
		lblNewLabel_5.setBounds(10, 219, 174, 14);
		panel_1.add(lblNewLabel_5);
		
		JPanel panel_2 = new JPanel();
		panel_2.setForeground(Color.RED);
		panel_2.setBounds(1152, 392, 184, 272);
		getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("Teacher");
		lblNewLabel_6.setFont(new Font("Segoe UI Semilight", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_6.setForeground(new Color(204, 51, 102));
		lblNewLabel_6.setBounds(40, 35, 90, 14);
		panel_2.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Doctor");
		lblNewLabel_7.setFont(new Font("Segoe UI Symbol", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_7.setForeground(new Color(204, 51, 102));
		lblNewLabel_7.setBounds(40, 77, 90, 14);
		panel_2.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Engineer");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_8.setForeground(new Color(204, 51, 102));
		lblNewLabel_8.setBounds(40, 125, 100, 14);
		panel_2.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Tutor");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_9.setForeground(new Color(204, 51, 102));
		lblNewLabel_9.setBounds(40, 171, 61, 14);
		panel_2.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Electrician");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_10.setForeground(new Color(204, 51, 102));
		lblNewLabel_10.setBounds(40, 222, 90, 14);
		panel_2.add(lblNewLabel_10);

	}
}
