package nubos;

import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.ActionEvent;
import java.awt.Cursor;

public class BasePage extends JFrame {

	protected JPanel contentPane;
	protected JLayeredPane layeredPane;
	protected JButton btnClose, btnMyProfile, btnLogOut, btnScPage, btnRsrvPage;


	public BasePage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setSize(1339, 831);
	    setLocationRelativeTo(null);
	    setUndecorated(true);
	    
		layeredPane = new JLayeredPane(); 
        layeredPane.setBounds(0, 0, 1339, 831);
        getContentPane().add(layeredPane);
        
        btnClose = new JButton("X");
        btnClose.setToolTipText("CLOSE");
        btnClose.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnClose.setOpaque(false);
        btnClose.setRequestFocusEnabled(false);
        btnClose.setFocusPainted(false);
        btnClose.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		 int option = JOptionPane.showConfirmDialog(
        	                null,
        	                "Please save your information before leaving the app?",
        	                "Confirmation",
        	                JOptionPane.YES_NO_OPTION);

        	        if (option == JOptionPane.NO_OPTION) {
        	            System.exit(0);
        	        }
        	    }
        });
        btnClose.setForeground(new Color(255, 255, 255));
        btnClose.setFont(new Font("Calibri", Font.BOLD, 20));
        btnClose.setContentAreaFilled(false);
        btnClose.setBorder(null);
        btnClose.setBorderPainted(false);
        btnClose.setBounds(1300, 13, 28, 23);
        layeredPane.add(btnClose);
        
        btnMyProfile = new JButton("My Profile");
        btnMyProfile.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
         		new MyProfile();
        		dispose();
        	    }
        });
        btnMyProfile.setFocusPainted(false);
        btnMyProfile.setForeground(new Color(255, 255, 255));
        btnMyProfile.setFont(new Font("Calibri", Font.PLAIN, 20));
        btnMyProfile.setContentAreaFilled(false);
        btnMyProfile.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnMyProfile.setBorderPainted(false);
        btnMyProfile.setBorder(null);
        btnMyProfile.setBounds(1100, 87, 89, 20);
        layeredPane.add(btnMyProfile);
        
        btnLogOut = new JButton("Log Out");
        btnLogOut.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		int option = JOptionPane.showConfirmDialog(
    	                null,
    	                "Are you sure you want to logout?",
    	                "Confirmation",
    	                JOptionPane.YES_NO_OPTION);

    	        if (option == JOptionPane.YES_OPTION) {
    	    	new LoginPage();
        		dispose();
    	        }
        	}
        });
        btnLogOut.setFocusPainted(false);
        btnLogOut.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnLogOut.setForeground(Color.WHITE);
        btnLogOut.setFont(new Font("Calibri", Font.PLAIN, 20));
        btnLogOut.setContentAreaFilled(false);
        btnLogOut.setBorderPainted(false);
        btnLogOut.setBorder(null);
        btnLogOut.setBounds(1217, 85, 89, 20);
        layeredPane.add(btnLogOut);
        
        btnScPage = new JButton("SCHEDULE");
        btnScPage.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		new SchedulePage();
        		dispose();
        	}
        });
        btnScPage.setFocusPainted(false);
        btnScPage.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnScPage.setForeground(Color.WHITE);
        btnScPage.setFont(new Font("Calibri", Font.BOLD, 30));
        btnScPage.setContentAreaFilled(false);
        btnScPage.setBorderPainted(false);
        btnScPage.setBorder(null);
        btnScPage.setBounds(469, 170, 148, 39);
        layeredPane.add(btnScPage);
        
        btnRsrvPage = new JButton("RESERVATION");
        btnRsrvPage.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		new ReservationPage();
        		dispose();
      	        }
        });
        btnRsrvPage.setFocusPainted(false);
        btnRsrvPage.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnRsrvPage.setForeground(Color.WHITE);
        btnRsrvPage.setFont(new Font("Calibri", Font.BOLD, 30));
        btnRsrvPage.setContentAreaFilled(false);
        btnRsrvPage.setBorderPainted(false);
        btnRsrvPage.setBorder(null);
        btnRsrvPage.setBounds(701, 170, 197, 39);
        layeredPane.add(btnRsrvPage);
        
        JLabel lblBasePage = new JLabel("");
        lblBasePage.setIcon(new ImageIcon(BasePage.class.getResource("/nubos/Assets/GeneralPage.png")));
        lblBasePage.setBounds(0, 0, 1339, 831);
        layeredPane.add(lblBasePage);
               
	setVisible(true);
	}
	

}
