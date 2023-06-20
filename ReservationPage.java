package nubos;

import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JComboBox;
import java.awt.Color;
import java.awt.Component;

import javax.swing.border.LineBorder;
import java.awt.Font;
import javax.swing.DefaultComboBoxModel;
import java.awt.Cursor;
import javax.swing.JFormattedTextField;
import javax.swing.SwingConstants;
import java.awt.Point;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.BorderFactory;

import java.awt.Dimension;
import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;
import com.toedter.calendar.JCalendar;
import java.awt.Rectangle;
import javax.swing.JLabel;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;

import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.border.EmptyBorder;

public class ReservationPage extends BasePage {
	
	
	

	private JFormattedTextField fmtOrigin, fmtDropOff, fmtSchedule, fmtAvblSeats;
	private JComboBox<String> cmbFrom, cmbDrpOff, cmbSched;
	private JTable table;
	private JTextField txtName,txtAddress, txtOrigin, txtTime, txtIdNo, txtContact, txtDropOff, txtDate;
	private JCalendar calendar;
	private JTextField txtSeats;
	private JButton btnCnlRes, btnReserve;



	public ReservationPage() {
		super();
		
		txtName = new JTextField();
		txtName.setText("Name");
		txtName.setOpaque(false);
		txtName.setFont(new Font("Calibri", Font.BOLD, 20));
		txtName.setEditable(false);
		txtName.setBorder(null);
		txtName.setBounds(125, 420, 59, 20);
		layeredPane.add(txtName, JLayeredPane.PALETTE_LAYER);
		txtName.setColumns(10);
		
		txtAddress = new JTextField();
		txtAddress.setText("Address");
		txtAddress.setOpaque(false);
		txtAddress.setFont(new Font("Calibri", Font.BOLD, 20));
		txtAddress.setEditable(false);
		txtAddress.setColumns(10);
		txtAddress.setBorder(null);
		txtAddress.setBounds(125, 455, 88, 20);
		layeredPane.add(txtAddress, JLayeredPane.PALETTE_LAYER);
		
		txtOrigin = new JTextField();
		txtOrigin.setText("Origin");
		txtOrigin.setOpaque(false);
		txtOrigin.setFont(new Font("Calibri", Font.BOLD, 20));
		txtOrigin.setEditable(false);
		txtOrigin.setColumns(10);
		txtOrigin.setBorder(null);
		txtOrigin.setBounds(125, 493, 69, 20);
		layeredPane.add(txtOrigin, JLayeredPane.PALETTE_LAYER);	
		
		txtTime = new JTextField();
		txtTime.setText("Time");
		txtTime.setOpaque(false);
		txtTime.setFont(new Font("Calibri", Font.BOLD, 20));
		txtTime.setEditable(false);
		txtTime.setColumns(10);
		txtTime.setBorder(null);
		txtTime.setBounds(125, 527, 69, 20);
		layeredPane.add(txtTime, JLayeredPane.PALETTE_LAYER);
		
		txtIdNo = new JTextField();
		txtIdNo.setText("ID/Application No.");
		txtIdNo.setOpaque(false);
		txtIdNo.setFont(new Font("Calibri", Font.BOLD, 20));
		txtIdNo.setEditable(false);
		txtIdNo.setColumns(10);
		txtIdNo.setBorder(null);
		txtIdNo.setBounds(500, 420, 160, 20);
		layeredPane.add(txtIdNo, JLayeredPane.PALETTE_LAYER);
		
		txtContact = new JTextField();
		txtContact.setText("Contact No.");
		txtContact.setOpaque(false);
		txtContact.setFont(new Font("Calibri", Font.BOLD, 20));
		txtContact.setEditable(false);
		txtContact.setColumns(10);
		txtContact.setBorder(null);
		txtContact.setBounds(500, 455, 160, 20);
		layeredPane.add(txtContact, JLayeredPane.PALETTE_LAYER);
		
		txtDropOff = new JTextField();
		txtDropOff.setText("Drop Off");
		txtDropOff.setOpaque(false);
		txtDropOff.setFont(new Font("Calibri", Font.BOLD, 20));
		txtDropOff.setEditable(false);
		txtDropOff.setColumns(10);
		txtDropOff.setBorder(null);
		txtDropOff.setBounds(500, 492, 107, 20);
		layeredPane.add(txtDropOff, JLayeredPane.PALETTE_LAYER);
		
		txtDate = new JTextField();
		txtDate.setText("Date");
		txtDate.setOpaque(false);
		txtDate.setFont(new Font("Calibri", Font.BOLD, 20));
		txtDate.setEditable(false);
		txtDate.setColumns(10);
		txtDate.setBorder(null);
		txtDate.setBounds(500, 526, 107, 20);
		layeredPane.add(txtDate, JLayeredPane.PALETTE_LAYER);

		txtSeats = new JTextField();
		txtSeats.setHorizontalAlignment(SwingConstants.CENTER);
		txtSeats.setFont(new Font("Calibri", Font.BOLD, 20));
		txtSeats.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		txtSeats.setBorder(new LineBorder(new Color(0, 0, 0)));
		txtSeats.setBounds(1116, 584, 114, 36);
		txtSeats.setColumns(10);
		layeredPane.add(txtSeats, JLayeredPane.PALETTE_LAYER);
		
		fmtOrigin = new JFormattedTextField();
		fmtOrigin.setForeground(new Color(255, 255, 255));
		fmtOrigin.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		fmtOrigin.setRequestFocusEnabled(false);
		fmtOrigin.setText("ORIGIN");
		fmtOrigin.setHorizontalAlignment(SwingConstants.CENTER);
		fmtOrigin.setFont(new Font("Calibri", Font.BOLD, 20));
		fmtOrigin.setEditable(false);
		fmtOrigin.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		fmtOrigin.setBorder(new LineBorder(new Color(0, 0, 0)));
		fmtOrigin.setBackground(new Color(51, 51, 204));
		fmtOrigin.setBounds(111, 305, 250, 36);
		layeredPane.add(fmtOrigin, JLayeredPane.PALETTE_LAYER);
		
		fmtDropOff = new JFormattedTextField();
		fmtDropOff.setText("DROP OFF");
		fmtDropOff.setRequestFocusEnabled(false);
		fmtDropOff.setHorizontalAlignment(SwingConstants.CENTER);
		fmtDropOff.setForeground(Color.WHITE);
		fmtDropOff.setFont(new Font("Calibri", Font.BOLD, 20));
		fmtDropOff.setEditable(false);
		fmtDropOff.setBorder(new LineBorder(new Color(0, 0, 0)));
		fmtDropOff.setBackground(new Color(51, 51, 204));
		fmtDropOff.setAlignmentY(1.0f);
		fmtDropOff.setBounds(360, 305, 250, 36);
		layeredPane.add(fmtDropOff, JLayeredPane.PALETTE_LAYER);
		
		fmtSchedule = new JFormattedTextField();
		fmtSchedule.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		fmtSchedule.setText("SCHEDULE");
		fmtSchedule.setRequestFocusEnabled(false);
		fmtSchedule.setHorizontalAlignment(SwingConstants.CENTER);
		fmtSchedule.setForeground(Color.WHITE);
		fmtSchedule.setFont(new Font("Calibri", Font.BOLD, 20));
		fmtSchedule.setEditable(false);
		fmtSchedule.setBorder(new LineBorder(new Color(0, 0, 0)));
		fmtSchedule.setBackground(new Color(51, 51, 204));
		fmtSchedule.setAlignmentY(1.0f);
		fmtSchedule.setBounds(609, 305, 250, 36);
		layeredPane.add(fmtSchedule, JLayeredPane.PALETTE_LAYER);
		
		fmtAvblSeats = new JFormattedTextField();
		fmtAvblSeats.setHorizontalAlignment(SwingConstants.CENTER);
		fmtAvblSeats.setRequestFocusEnabled(false);
		fmtAvblSeats.setForeground(new Color(255, 255, 255));
		fmtAvblSeats.setFont(new Font("Calibri", Font.BOLD, 20));
		fmtAvblSeats.setEditable(false);
		fmtAvblSeats.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		fmtAvblSeats.setBackground(new Color(51, 51, 204));
		fmtAvblSeats.setBorder(new LineBorder(new Color(0, 0, 0)));
		fmtAvblSeats.setText("  Available Seats");
		fmtAvblSeats.setBounds(904, 584, 213, 36);
		layeredPane.add(fmtAvblSeats, JLayeredPane.PALETTE_LAYER);
		
		cmbFrom = new JComboBox<String>();
		cmbFrom.setRequestFocusEnabled(false);
		cmbFrom.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		cmbFrom.setBorder(new LineBorder(new Color(0, 0, 0)));
		cmbFrom.setForeground(new Color(51, 51, 51));
		cmbFrom.setFont(new Font("Calibri", Font.PLAIN, 15));
		cmbFrom.setModel(new DefaultComboBoxModel<String>(new String[] {"  ", "  NU Manila", "  NU Moa"}));
		cmbFrom.setBackground(new Color(255, 255, 255));
		cmbFrom.setBounds(111, 341, 250, 36);
		layeredPane.add(cmbFrom, JLayeredPane.PALETTE_LAYER);
		
		cmbDrpOff = new JComboBox<String>();
		cmbDrpOff.setModel(new DefaultComboBoxModel<String>(new String[] {"", "  NU Manila", "  NU Moa"}));
		cmbDrpOff.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		cmbDrpOff.setRequestFocusEnabled(false);
		cmbDrpOff.setForeground(new Color(51, 51, 51));
		cmbDrpOff.setFont(new Font("Calibri", Font.PLAIN, 15));
		cmbDrpOff.setBorder(new LineBorder(new Color(0, 0, 0)));
		cmbDrpOff.setBackground(Color.WHITE);
		cmbDrpOff.setBounds(360, 341, 250, 36);
		layeredPane.add(cmbDrpOff, JLayeredPane.PALETTE_LAYER);
		
		cmbSched = new JComboBox<String>();
		cmbSched.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		cmbSched.setModel(new DefaultComboBoxModel<String>(new String[] {"", "  8:00 AM", "  10:00 AM", "  1:00 PM", "  3:00 PM"}));
		cmbSched.setRequestFocusEnabled(false);
		cmbSched.setForeground(new Color(51, 51, 51));
		cmbSched.setFont(new Font("Calibri", Font.PLAIN, 15));
		cmbSched.setBorder(new LineBorder(new Color(0, 0, 0)));
		cmbSched.setBackground(Color.WHITE);
		cmbSched.setBounds(609, 341, 250, 36);
		layeredPane.add(cmbSched, JLayeredPane.PALETTE_LAYER);
		
		table = new JTable();
		table.setRowSelectionAllowed(false);
		table.setRowHeight(36);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, Object.class, Object.class, Object.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
			boolean[] columnEditables = new boolean[] {
				false, true, true, true
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.getColumnModel().getColumn(0).setPreferredWidth(15);
		table.getColumnModel().getColumn(0).setMinWidth(5);
		table.getColumnModel().getColumn(1).setPreferredWidth(100);
		table.getColumnModel().getColumn(2).setPreferredWidth(50);
		table.getColumnModel().getColumn(3).setPreferredWidth(50);
		table.setGridColor(new Color(0, 0, 0));
		table.setFont(new Font("Calibri", Font.PLAIN, 15));
		table.setFillsViewportHeight(true);
		table.setBorder(new LineBorder(new Color(0, 0, 0)));
		table.setBounds(111, 410, 748, 144);
		layeredPane.add(table, JLayeredPane.PALETTE_LAYER);
		
		calendar = new JCalendar();
		calendar.getDayChooser().getDayPanel().setRequestFocusEnabled(false);
		calendar.setBorder(new LineBorder(new Color(102, 204, 255), 5));
		calendar.getDayChooser().getDayPanel().setFont(new Font("Calibri", Font.PLAIN, 15));
		calendar.setMinimumSize(new Dimension(396, 306));
		calendar.setRequestFocusEnabled(false);
		calendar.setPreferredSize(new Dimension(396, 306));
		calendar.setWeekOfYearVisible(false);
		calendar.setBounds(904, 305, 326, 249);
		layeredPane.add(calendar, JLayeredPane.PALETTE_LAYER);
		
		btnCnlRes = new JButton("Cancel/Reschedule");
		btnCnlRes.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCnlRes.setVerticalAlignment(SwingConstants.BOTTOM);
		btnCnlRes.setRequestFocusEnabled(false);
		btnCnlRes.setHorizontalTextPosition(SwingConstants.CENTER);
		btnCnlRes.setForeground(Color.WHITE);
		btnCnlRes.setFont(new Font("Calibri", Font.BOLD, 20));
		btnCnlRes.setFocusPainted(false);
		btnCnlRes.setDefaultCapable(false);
		btnCnlRes.setBorderPainted(false);
		btnCnlRes.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 255, 255), new Color(51, 51, 204), null, null));
		btnCnlRes.setBackground(new Color(51, 51, 204));
		btnCnlRes.setBounds(367, 584, 240, 36);
		layeredPane.add(btnCnlRes, JLayeredPane.PALETTE_LAYER);
		
		btnReserve = new JButton("Reserve");
		btnReserve.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnReserve.setVerticalAlignment(SwingConstants.BOTTOM);
		btnReserve.setRequestFocusEnabled(false);
		btnReserve.setHorizontalTextPosition(SwingConstants.CENTER);
		btnReserve.setForeground(Color.WHITE);
		btnReserve.setFont(new Font("Calibri", Font.BOLD, 20));
		btnReserve.setFocusPainted(false);
		btnReserve.setDefaultCapable(false);
		btnReserve.setBorderPainted(false);
		btnReserve.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 255, 255), new Color(51, 51, 204), null, null));
		btnReserve.setBackground(new Color(51, 51, 204));
		btnReserve.setBounds(904, 652, 326, 36);
		layeredPane.add(btnReserve, JLayeredPane.PALETTE_LAYER);
		
	
		
		
		setVisible(true);
		
	
	}
}
