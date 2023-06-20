package nubos;

import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextArea;
import java.awt.Cursor;

public class SchedulePage extends BasePage {
	
	private JPanel pnlTripSched, pnlNuCamp, pnlAdvisory;
	private JTextArea txtrTripSchedulehour, txtNuContacts, txtAdvisory, txtSchedInfo, txtAdInfo, txtNuContactsInfo;
	
	public SchedulePage() {
		super();
		
		pnlTripSched = new JPanel();
		pnlTripSched.setBackground(new Color(0, 102, 204));
		pnlTripSched.setBorder(new LineBorder(new Color(255, 255, 255), 2));
		pnlTripSched.setBounds(170, 289, 355, 61);
		layeredPane.add(pnlTripSched, JLayeredPane.PALETTE_LAYER);
		pnlTripSched.setLayout(null);
		
		pnlNuCamp = new JPanel();
		pnlNuCamp.setLayout(null);
		pnlNuCamp.setBorder(new LineBorder(new Color(255, 255, 255), 2));
		pnlNuCamp.setBackground(new Color(0, 102, 204));
		pnlNuCamp.setBounds(525, 289, 628, 61);
		layeredPane.add(pnlNuCamp, JLayeredPane.PALETTE_LAYER);
		
		pnlAdvisory = new JPanel();
		pnlAdvisory.setLayout(null);
		pnlAdvisory.setBorder(new LineBorder(new Color(255, 255, 255), 2));
		pnlAdvisory.setBackground(new Color(0, 102, 204));
		pnlAdvisory.setBounds(170, 588, 983, 61);
		layeredPane.add(pnlAdvisory, JLayeredPane.PALETTE_LAYER);
		
		txtrTripSchedulehour = new JTextArea();
		txtrTripSchedulehour.setEditable(false);
		txtrTripSchedulehour.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		txtrTripSchedulehour.setForeground(new Color(255, 255, 255));
		txtrTripSchedulehour.setOpaque(false);
		txtrTripSchedulehour.setBorder(null);
		txtrTripSchedulehour.setFont(new Font("Calibri", Font.PLAIN, 20));
		txtrTripSchedulehour.setLineWrap(true);
		txtrTripSchedulehour.setWrapStyleWord(true);
		txtrTripSchedulehour.setText("  Trip Schedule 2-hour Interval");
		txtrTripSchedulehour.setBounds(102, 11, 128, 50);
		pnlTripSched.add(txtrTripSchedulehour);
		
		txtNuContacts = new JTextArea();
		txtNuContacts.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		txtNuContacts.setEditable(false);
		txtNuContacts.setWrapStyleWord(true);
		txtNuContacts.setText("      NU Campus Terminal Contacts");
		txtNuContacts.setOpaque(false);
		txtNuContacts.setLineWrap(true);
		txtNuContacts.setForeground(Color.WHITE);
		txtNuContacts.setFont(new Font("Calibri", Font.PLAIN, 20));
		txtNuContacts.setBorder(null);
		txtNuContacts.setBounds(254, 11, 158, 45);
		pnlNuCamp.add(txtNuContacts);
		
		txtAdvisory = new JTextArea();
		txtAdvisory.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		txtAdvisory.setEditable(false);
		txtAdvisory.setWrapStyleWord(true);
		txtAdvisory.setText("ADVISORY");
		txtAdvisory.setOpaque(false);
		txtAdvisory.setLineWrap(true);
		txtAdvisory.setForeground(Color.WHITE);
		txtAdvisory.setFont(new Font("Calibri", Font.PLAIN, 20));
		txtAdvisory.setBorder(null);
		txtAdvisory.setBounds(453, 21, 90, 18);
		pnlAdvisory.add(txtAdvisory);
		
				
		txtSchedInfo = new JTextArea();
		txtSchedInfo.setEditable(false);
		txtSchedInfo.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		txtSchedInfo.setBorder(new LineBorder(new Color(255, 255, 255), 2));
		txtSchedInfo.setBackground(new Color(109, 109, 109, 150));
		txtSchedInfo.setText("  \r\n  Monday: No Trip\r\n  Tuesday: 08:00 AM – 3:00 PM\r\n  Wednesday: No Trip\r\n  Thursday: 08:00 AM – 3:00 PM\r\n  Friday: 08:00 AM – 3:00 PM\r\n  Saturday – No Trip\r\n  Sunday – No Trip \r\n \r\n  Break Time: 12:00nn – 1:00PM\r\n\r\n\r\n\r\n\r\n\r\n");
		txtSchedInfo.setForeground(new Color(255, 255, 255));
		txtSchedInfo.setFont(new Font("Calibri", Font.PLAIN, 15));
		txtSchedInfo.setWrapStyleWord(true);
		txtSchedInfo.setLineWrap(true);
		txtSchedInfo.setBounds(170, 348, 355, 212);
		layeredPane.add(txtSchedInfo, JLayeredPane.PALETTE_LAYER);
						
		txtNuContactsInfo = new JTextArea();
		txtNuContactsInfo.setEditable(false);
		txtNuContactsInfo.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		txtNuContactsInfo.setWrapStyleWord(true);
		txtNuContactsInfo.setText("  \r\n  NU Manila 028712-1900\r\n  NU Clark – Not Applicable for Tour Program\r\n  NU MOA 02 8355-1206 loc.3200\r\n  NU Baliwag – Not Applicable for Tour Program\r\n  NU Laguna – Not Applicable for Tour Program\r\n  NU Fairview – Not Applicable for Tour Program\r\n  NU Dasmarinas – Not Applicable for Tour Program\r\n  NU Lipa – Not Applicable for Tour Program\r\n\r\n\r\n\r\n\r\n\r\n");
		txtNuContactsInfo.setLineWrap(true);
		txtNuContactsInfo.setForeground(Color.WHITE);
		txtNuContactsInfo.setFont(new Font("Calibri", Font.PLAIN, 15));
		txtNuContactsInfo.setBorder(new LineBorder(new Color(255, 255, 255), 2));
		txtNuContactsInfo.setBackground(new Color(109, 109, 109, 150));
		txtNuContactsInfo.setBounds(525, 348, 628, 212);
		layeredPane.add(txtNuContactsInfo, JLayeredPane.PALETTE_LAYER);
				
		txtAdInfo = new JTextArea();
		txtAdInfo.setEditable(false);
		txtAdInfo.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		txtAdInfo.setWrapStyleWord(true);
		txtAdInfo.setText("\r\n   Trip Schedules are applicable during the application and enrollment period only. \r\n   Applicable Route: Nu Manila to Nu Moa and vice versa. A maximum of 10 students per trip is allowed.\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n");
		txtAdInfo.setLineWrap(true);
		txtAdInfo.setForeground(Color.WHITE);
		txtAdInfo.setFont(new Font("Calibri", Font.PLAIN, 20));
		txtAdInfo.setBorder(new LineBorder(new Color(255, 255, 255), 2));
		txtAdInfo.setBackground(new Color(109, 109, 109, 150));
		txtAdInfo.setBounds(170, 647, 983, 123);
		layeredPane.add(txtAdInfo, JLayeredPane.PALETTE_LAYER);
				
		setVisible(true);
	}
}
