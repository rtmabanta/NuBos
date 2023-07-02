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
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import java.awt.Dimension;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.File;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Scanner;
import java.text.SimpleDateFormat;

import com.toedter.calendar.IDateEvaluator;
import com.toedter.calendar.JCalendar;

public class ReservationPage extends BasePage {
	
	
	

	private JFormattedTextField fmtOrigin, fmtDropOff, fmtSchedule, fmtAvblSeats;
	private JComboBox<String> cmbOrigin, cmbDropOff, cmbSched;
	private JTable table;
	private JTextField txtName,txtAddress, txtOrigin, txtTime, txtIdNo, txtContact, txtDropOff, txtDate;
	private JCalendar calendar;
	private JTextField txtSeats;
	private JButton btnCnlRes, btnReserve;
	private String reservedNameFromFile = null;
	private String reservedStudentIDFromFile = null;
	private String reservedAddressFromFile = null;
	private String reservedContactFromFile = null;
	private String reservedOriginFromFile = null;
	private String reservedDropOffFromFile = null;
	private String reservedScheduleFromFile = null;
	private String reservedDateFromFile = null;
	private SimpleDateFormat sdf = new SimpleDateFormat("MMMM d, yyyy");

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
		txtIdNo.setBounds(473, 420, 160, 20);
		layeredPane.add(txtIdNo, JLayeredPane.PALETTE_LAYER);
		
		txtContact = new JTextField();
		txtContact.setText("Contact No.");
		txtContact.setOpaque(false);
		txtContact.setFont(new Font("Calibri", Font.BOLD, 20));
		txtContact.setEditable(false);
		txtContact.setColumns(10);
		txtContact.setBorder(null);
		txtContact.setBounds(473, 455, 107, 20);
		layeredPane.add(txtContact, JLayeredPane.PALETTE_LAYER);
		
		txtDropOff = new JTextField();
		txtDropOff.setText("Drop Off");
		txtDropOff.setOpaque(false);
		txtDropOff.setFont(new Font("Calibri", Font.BOLD, 20));
		txtDropOff.setEditable(false);
		txtDropOff.setColumns(10);
		txtDropOff.setBorder(null);
		txtDropOff.setBounds(473, 492, 107, 20);
		layeredPane.add(txtDropOff, JLayeredPane.PALETTE_LAYER);
		
		txtDate = new JTextField();
		txtDate.setText("Date");
		txtDate.setOpaque(false);
		txtDate.setFont(new Font("Calibri", Font.BOLD, 20));
		txtDate.setEditable(false);
		txtDate.setColumns(10);
		txtDate.setBorder(null);
		txtDate.setBounds(473, 526, 107, 20);
		layeredPane.add(txtDate, JLayeredPane.PALETTE_LAYER);

		txtSeats = new JTextField();
		txtSeats.setEditable(false);
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
		
		cmbOrigin = new JComboBox<String>();
		cmbOrigin.addItemListener(new ItemListener() {
			@Override
		    public void itemStateChanged(ItemEvent event) {
		        if (event.getStateChange() == ItemEvent.SELECTED) {
		            updateSeats();
		        }
		    }
		});
		cmbOrigin.setRequestFocusEnabled(false);
		cmbOrigin.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		cmbOrigin.setBorder(new LineBorder(new Color(0, 0, 0)));
		cmbOrigin.setForeground(new Color(51, 51, 51));
		cmbOrigin.setFont(new Font("Calibri", Font.PLAIN, 15));
		cmbOrigin.setModel(new DefaultComboBoxModel<String>(new String[] {"  ", "  NU Manila", "  NU Moa"}));
		cmbOrigin.setBackground(new Color(255, 255, 255));
		cmbOrigin.setBounds(111, 341, 250, 36);
		layeredPane.add(cmbOrigin, JLayeredPane.PALETTE_LAYER);
		
		cmbDropOff = new JComboBox<String>();
		cmbDropOff.addItemListener(new ItemListener() {
			@Override
		    public void itemStateChanged(ItemEvent event) {
		        if (event.getStateChange() == ItemEvent.SELECTED) {
		            updateSeats();
		        }
		    }
		});
		cmbDropOff.setModel(new DefaultComboBoxModel<String>(new String[] {"", "  NU Manila", "  NU Moa"}));
		cmbDropOff.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		cmbDropOff.setRequestFocusEnabled(false);
		cmbDropOff.setForeground(new Color(51, 51, 51));
		cmbDropOff.setFont(new Font("Calibri", Font.PLAIN, 15));
		cmbDropOff.setBorder(new LineBorder(new Color(0, 0, 0)));
		cmbDropOff.setBackground(Color.WHITE);
		cmbDropOff.setBounds(360, 341, 250, 36);
		layeredPane.add(cmbDropOff, JLayeredPane.PALETTE_LAYER);
		
		cmbSched = new JComboBox<String>();
		cmbSched.addItemListener(new ItemListener() {
			@Override
		    public void itemStateChanged(ItemEvent event) {
		        if (event.getStateChange() == ItemEvent.SELECTED) {
		            updateSeats();
		        }
		    }
		});
		cmbSched.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		cmbSched.setModel(new DefaultComboBoxModel(new String[] {"", "  8 AM", "  10 AM", "  1 PM", "  3 PM"}));
		cmbSched.setRequestFocusEnabled(false);
		cmbSched.setForeground(new Color(51, 51, 51));
		cmbSched.setFont(new Font("Calibri", Font.PLAIN, 15));
		cmbSched.setBorder(new LineBorder(new Color(0, 0, 0)));
		cmbSched.setBackground(Color.WHITE);
		cmbSched.setBounds(609, 341, 250, 36);
		layeredPane.add(cmbSched, JLayeredPane.PALETTE_LAYER);
		
		table = new JTable();
		table.setEnabled(false);
		table.setRowSelectionAllowed(false);
		table.setRowHeight(36);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, reservedNameFromFile, null, reservedStudentIDFromFile},
				{null, reservedAddressFromFile, null, reservedContactFromFile},
				{null, reservedOriginFromFile, null, reservedDropOffFromFile},
				{null, reservedScheduleFromFile, null, reservedDateFromFile},
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
		});
		table.getColumnModel().getColumn(0).setPreferredWidth(15);
		table.getColumnModel().getColumn(0).setMinWidth(5);
		table.getColumnModel().getColumn(1).setPreferredWidth(100);
		table.getColumnModel().getColumn(2).setPreferredWidth(50);
		table.getColumnModel().getColumn(3).setPreferredWidth(100);
		table.setGridColor(new Color(0, 0, 0));
		table.setFont(new Font("Calibri", Font.PLAIN, 15));
		table.setFillsViewportHeight(true);
		table.setBorder(new LineBorder(new Color(0, 0, 0)));
		table.setBounds(111, 410, 748, 144);
		layeredPane.add(table, JLayeredPane.PALETTE_LAYER);
		
		calendar = new JCalendar();
		calendar.getDayChooser().addDateEvaluator(new IDateEvaluator() {
		    @Override
		    public boolean isSpecial(Date date) {
		        Calendar c = Calendar.getInstance();
		        c.setTime(date);
		        int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
		        int month = c.get(Calendar.MONTH);

		        // If the month is July or August (months are 0-based in Calendar)
		        if (month == Calendar.JULY || month == Calendar.AUGUST) {
		            // If the day is Tuesday, Wednesday or Friday
		            if (dayOfWeek == Calendar.TUESDAY || dayOfWeek == Calendar.WEDNESDAY || dayOfWeek == Calendar.FRIDAY) {
		                return true;
		            }
		        }
		        return false;
		    }

		    @Override
		    public boolean isInvalid(Date date) {
		        return !isSpecial(date);
		    }

		    @Override
		    public Color getSpecialForegroundColor() {
		        return null;
		    }

		    @Override
		    public Color getSpecialBackroundColor() {
		        return null;
		    }

		    @Override
		    public String getSpecialTooltip() {
		        return null;
		    }

		    @Override
		    public Color getInvalidForegroundColor() {
		        return null;
		    }

		    @Override
		    public Color getInvalidBackroundColor() {
		        return null;
		    }

		    @Override
		    public String getInvalidTooltip() {
		        return null;
		    }
		});
		calendar.getDayChooser().addPropertyChangeListener(new PropertyChangeListener() {
			@Override
		    public void propertyChange(PropertyChangeEvent event) {
		        if (event.getPropertyName().equals("day")) {
		            updateSeats();
		        }
		    }
		});
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
		btnCnlRes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				synchronized(ReservationPage.this) {
					String userEmail = UserSession.getLoggedInUserEmail();
		            //cancelReservation(userEmail);
					boolean reservationCancelled = cancelReservation(userEmail);
		            
		            if (reservationCancelled) {
		                updateSeats();
		            }
				
				}
		        ((DefaultTableModel) table.getModel()).setValueAt(null, 0, 1);
		        ((DefaultTableModel) table.getModel()).setValueAt(null, 0, 3);
		        ((DefaultTableModel) table.getModel()).setValueAt(null, 1, 1);
		        ((DefaultTableModel) table.getModel()).setValueAt(null, 1, 3);
		        ((DefaultTableModel) table.getModel()).setValueAt(null, 2, 1);
		        ((DefaultTableModel) table.getModel()).setValueAt(null, 2, 3);
		        ((DefaultTableModel) table.getModel()).setValueAt(null, 3, 1);
		        ((DefaultTableModel) table.getModel()).setValueAt(null, 3, 3);
		        
		        Calendar unselectableDate = Calendar.getInstance();
		        unselectableDate.set(Calendar.YEAR, 2023); // Or some year that is not selectable
		        unselectableDate.set(Calendar.MONTH, Calendar.JULY);
		        unselectableDate.set(Calendar.DAY_OF_MONTH, 1);
		        
		        calendar.setDate(unselectableDate.getTime());
		        
		        try {
		            String userEmail = UserSession.getLoggedInUserEmail();
		            Path reservationListPath = Paths.get("src/nubos/ReservationList.txt");
		            List<String> lines = Files.readAllLines(reservationListPath);
		            List<String> updatedLines = new ArrayList<>();

		            for (String line : lines) {
		                if (!line.startsWith("Email:" + userEmail)) {
		                    updatedLines.add(line);
		                }
		            }

		            Files.write(reservationListPath, updatedLines);
		            //String origin = ((String) cmbOrigin.getSelectedItem()).trim();
		           // String schedule = ((String) cmbSched.getSelectedItem()).trim();
		          //  String date = sdf.format(calendar.getDate());
		        
		        } catch (IOException ex) {
		            ex.printStackTrace();
		        }
		        
		        txtSeats.setText("");
		   
		        try {
		            String slotsFilePath = "src/nubos/Slots.txt"; 
		            List<String> lines = Files.readAllLines(Paths.get(slotsFilePath));

		            String chosenDate = "userChosenDate";
		            String chosenTime = "userChosenTime";
		            String chosenSchedule = "userChosenSchedule";

		            for (String line : lines) {
		            	if (line.contains(chosenDate) && line.contains(chosenTime) && line.contains(chosenSchedule)) {
		                   
		            		String availableSeats = line.substring(line.indexOf("Seats:") + "Seats:".length()).trim();

		                    txtSeats.setText(availableSeats);

		                break;
		                }
		            }

		        } catch (IOException ex) {
		            ex.printStackTrace();
		        }
		    }
		});
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
		btnReserve.addActionListener(new ActionListener() {
			//public void actionPerformed(ActionEvent e) {
			public synchronized void actionPerformed(ActionEvent e) {
				
				try {
					String userEmail = UserSession.getLoggedInUserEmail();
					String origin = cmbOrigin.getSelectedItem().toString().trim();
		            String dropOff = cmbDropOff.getSelectedItem().toString().trim();
		            String schedule = cmbSched.getSelectedItem().toString().trim();
		            Date selectedDate = calendar.getDate();
		            DateFormat dateFormat = new SimpleDateFormat("MMMM d, yyyy");
		            String formattedDate = dateFormat.format(selectedDate);
		            
		            
		            if (origin.isEmpty() || dropOff.isEmpty() || schedule.isEmpty()) {
		                JOptionPane.showMessageDialog(null, "Please select Origin, Drop Off, and Schedule.");
		                return;
		            }

		            // Check if Origin and Drop Off are the same
		            if (origin.equals(dropOff)) {
		                JOptionPane.showMessageDialog(null, "Origin and Drop Off should be different locations.");
		                return;
		            }
		            if (selectedDate == null) {
		                JOptionPane.showMessageDialog(null, "Please choose a date.");
		                return;
		            }
		            
		            BufferedReader reader = new BufferedReader(new FileReader("src/nubos/FileCabinet.txt"));

			            String line;
			            boolean foundUser = false;
			            while ((line = reader.readLine()) != null) {
			                // Split the line into individual data items
			                String[] parts = line.split(", "); // Note the additional space after the comma
			                String email = "";
			                //String email = "", fullName = "", studentId = "", address = "", contact = "";
			                
			                // Loop through each part and assign the email and fullName if found
			                for (String part : parts) {
			                    if (part.startsWith("Email:")) {
			                        email = part.substring("Email:".length()).trim();
			                        break;
			                    }
			                }
			                if (email.equals(userEmail)) {
			                    foundUser = true;
			                    break;
			                }
			            }

			            reader.close();
			            	
			            if (foundUser) {
			            	boolean reservationExists = false;
			            	try (BufferedReader reservationReader = new BufferedReader(new FileReader("src/nubos/ReservationList.txt"))) {
			                    String reservationLine;
			                    while ((reservationLine = reservationReader.readLine()) != null) {
			                        if (reservationLine.startsWith("Email:" + userEmail)) {
			                            reservationExists = true;
			                            break;
			                        }
			                    }
			                } catch (IOException ex) {
			                    ex.printStackTrace();
			                }
			            	if (!reservationExists) {
			                    String fullName = "", studentId = "", address = "", contact = "";
			                    // Read the user's information from the FileCabinet.txt
			                    try (BufferedReader infoReader = new BufferedReader(new FileReader("src/nubos/FileCabinet.txt"))) {
			                        String infoLine;
			                        while ((infoLine = infoReader.readLine()) != null) {
			                            String[] infoParts = infoLine.split(", ");
			                            String email = "";
			                            for (String part : infoParts) {
			                                if (part.startsWith("Email:")) {
			                                    email = part.substring("Email:".length()).trim();
			                                
			                    } else if (part.startsWith("FullName:")) {
			                        fullName = part.substring("FullName:".length()).trim();
			                    } else if (part.startsWith("StudentId:")) {
			                        studentId = part.substring("StudentId:".length()).trim();
			                    } else if (part.startsWith("Address:")) {
			                        address = part.substring("Address:".length()).trim();
			                    } else if (part.startsWith("Contact:")) {
			                        contact = part.substring("Contact:".length()).trim();
			                    }
			                }
			                    // Check if we found the user
			                if (email.equals(userEmail)) {
			                	break;
	                        }
	                    }
	                } catch (IOException ex) {
	                    ex.printStackTrace();
	                }
			                    String availableSeats = getAvailableSeats(origin, dropOff, schedule, formattedDate);
			                    if (availableSeats.isEmpty() || Integer.parseInt(availableSeats) <= 0) {
			                        JOptionPane.showMessageDialog(null, "No seats available for the selected location, schedule, and date.");
			                        return;
			                    }
			                    try (FileWriter writer = new FileWriter("src/nubos/ReservationList.txt", true)) { // true for append mode
			                        writer.write("Email:" + userEmail + ", FullName:" + fullName + ", StudentId:" + studentId + 
			                        			 ", Address:" + address + ", Contact:" + contact + ", Origin:" + origin + 
			                        			 ", DropOff:" + dropOff + ", Schedule:" + schedule + ", Date:" + formattedDate + "\n");
			                        makeReservation();
			                        
			                    } catch (IOException ex) {
			                        ex.printStackTrace();
			                    }
			                        ((DefaultTableModel) table.getModel()).setValueAt(fullName, 0, 1);
			                        ((DefaultTableModel) table.getModel()).setValueAt(studentId, 0, 3);
			                        ((DefaultTableModel) table.getModel()).setValueAt(address, 1, 1);
			                        ((DefaultTableModel) table.getModel()).setValueAt(contact, 1, 3);
			                        ((DefaultTableModel) table.getModel()).setValueAt(origin, 2, 1);
			                        ((DefaultTableModel) table.getModel()).setValueAt(dropOff, 2, 3);
			                        ((DefaultTableModel) table.getModel()).setValueAt(schedule, 3, 1);
			                        ((DefaultTableModel) table.getModel()).setValueAt(formattedDate, 3, 3);
			                
			            	} else {
			                    // Handle case when reservation already exists
			            		JOptionPane.showMessageDialog(null, "You have an existing reservation");
			            		JOptionPane.showMessageDialog(null, "Click cancel/reschedule button to clear reservation");
			                }
			            } else {
			                // Handle case when user is not found
			            	JOptionPane.showMessageDialog(null, "User information not found");
			            }
			            
			            cmbOrigin.setSelectedIndex(0);
			            cmbDropOff.setSelectedIndex(0);
			            cmbSched.setSelectedIndex(0);	
			            calendar.setDate(selectedDate);
			           
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
				updateSeats();             
				}
			    
			});
		layeredPane.add(btnReserve, JLayeredPane.PALETTE_LAYER);
		
		setVisible(true);
		setupReservation();
		
		}
	 private synchronized void setupReservation() {
	        // Read the reservation from the file, if it exists
	        String reservedNameFromFile = null;
	        String reservedStudentIDFromFile = null;
	        String reservedAddressFromFile = null;
	        String reservedContactFromFile = null;
	        String reservedOriginFromFile = null;
	        String reservedDropOffFromFile = null;
	        String reservedScheduleFromFile = null;
	        String reservedDateFromFile = null;
	        try (BufferedReader reader = new BufferedReader(new FileReader("src/nubos/ReservationList.txt"))) {
	            String line;
	            while ((line = reader.readLine()) != null) {
	                if (line.startsWith("Email:" + UserSession.getLoggedInUserEmail())) {
	                    reservedNameFromFile = line.split(",")[1].split(":")[1].trim();
	                    reservedStudentIDFromFile = line.split(",")[2].split(":")[1].trim();
	                    reservedAddressFromFile = line.split(",")[3].split(":")[1].trim();
	                    reservedContactFromFile = line.split(",")[4].split(":")[1].trim();
	                    reservedOriginFromFile = line.split(",")[5].split(":")[1].trim();
	                    reservedDropOffFromFile = line.split(",")[6].split(":")[1].trim();
	                    reservedScheduleFromFile = line.split(",")[7].split(":")[1].trim();
	                    reservedDateFromFile = line.split(",")[8].split(":")[1].trim();
	                    break;
	                }
	            }
	        } catch (IOException ex) {
	            ex.printStackTrace();
	        }
	        
	        // Set the reserved name in the table if it exists
	        if (reservedNameFromFile != null) {
	            ((DefaultTableModel) table.getModel()).setValueAt(reservedNameFromFile, 0, 1);
	        }
	        if (reservedStudentIDFromFile != null) {
	            ((DefaultTableModel) table.getModel()).setValueAt(reservedStudentIDFromFile, 0, 3);
	        }
	        if (reservedAddressFromFile != null) {
	            ((DefaultTableModel) table.getModel()).setValueAt(reservedAddressFromFile, 1, 1);
	        }
	        if (reservedContactFromFile != null) {
	            ((DefaultTableModel) table.getModel()).setValueAt(reservedContactFromFile, 1, 3);
	        }
	        if (reservedOriginFromFile != null) {
	            ((DefaultTableModel) table.getModel()).setValueAt(reservedOriginFromFile, 2, 1);
	        }
	        if (reservedDropOffFromFile != null) {
	            ((DefaultTableModel) table.getModel()).setValueAt(reservedDropOffFromFile, 2, 3);
	        }
	        if (reservedScheduleFromFile != null) {
	            ((DefaultTableModel) table.getModel()).setValueAt(reservedScheduleFromFile, 3, 1);
	        }
	        if (reservedDateFromFile != null) {
	            ((DefaultTableModel) table.getModel()).setValueAt(reservedDateFromFile, 3, 3);
	        }
	    
	 }
	 public synchronized String getAvailableSeats(String origin, String dropOff, String schedule, String date) {
	        String seats = "";

	        try {
	            File file = new File("src/nubos/Slots.txt");
	            Scanner scanner = new Scanner(file);

	            while (scanner.hasNextLine()) {
	                String line = scanner.nextLine();

	                if (line.contains(origin) && line.contains(dropOff) && line.contains(schedule) && line.contains(date)) {
	                    String[] parts = line.split(", "); // Split line by comma

	                    for (String part : parts) {
	                        if (part.trim().startsWith("Seats")) {
	                            seats = part.split(":")[1].trim(); // Get the seats count
	                            break;
	                        }
	                    }
	                }
	            }

	            scanner.close();
	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	        }

	        return seats;
	    }

	    public synchronized void updateSeats() {
	        String origin = ((String) cmbOrigin.getSelectedItem()).trim();
	        String dropOff = ((String) cmbDropOff.getSelectedItem()).trim();
	        String sched = ((String) cmbSched.getSelectedItem()).trim();
	        
	        if (origin.isEmpty() || dropOff.isEmpty() || sched.isEmpty()) {
	            // If origin or schedule is not selected, don't update the seats.
	            return;
	        }

	        // Convert selected date to string format "MMMM d, yyyy" to match with file
	        String date = sdf.format(calendar.getDate());

	        String seats = getAvailableSeats(origin, dropOff, sched, date);
	        txtSeats.setText(seats);
	    }
	    public synchronized void makeReservation() {
	        String origin = ((String) cmbOrigin.getSelectedItem()).trim();
	        String dropOff = ((String) cmbDropOff.getSelectedItem()).trim();
	        String sched = ((String) cmbSched.getSelectedItem()).trim();
	        String date = sdf.format(calendar.getDate());

	        File slotsFile = new File("src/nubos/Slots.txt");
	        File tempFile = new File("src/nubos/SlotsTemp.txt");

	        try {
	            BufferedReader reader = new BufferedReader(new FileReader(slotsFile));
	            BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

	            String currentLine;
	            while ((currentLine = reader.readLine()) != null) {
	                // trim newline when comparing with lineToRemove
	                String trimmedLine = currentLine.trim();

	                if (trimmedLine.contains(origin) && trimmedLine.contains(dropOff) && trimmedLine.contains(sched) && trimmedLine.contains(date)) {
	                    String[] parts = trimmedLine.split(", "); // Split line by comma

	                    for (String part : parts) {
	                        if (part.trim().startsWith("Seats")) {
	                            int seats = Integer.parseInt(part.split(":")[1].trim()); // Get the seats count
	                            seats--; // Decrement the seats
	                            currentLine = currentLine.replace(part, "Seats:" + seats);
	                            break;
	                        }
	                    }
	                }

	                writer.write(currentLine + System.getProperty("line.separator"));
	            }

	            writer.close();
	            reader.close();

	            // Delete the original file
	            if (!slotsFile.delete()) {
	                System.out.println("Could not delete file");
	                return;
	            }

	            // Rename the new file to the filename the original file had.
	            if (!tempFile.renameTo(slotsFile))
	                System.out.println("Could not rename file");

	        } catch (IOException e) {
	            e.printStackTrace();
	        }

	        // Refresh the available seats
	        updateSeats();
	    }
	    public synchronized boolean cancelReservation(String userEmail) {
	    	boolean reservationCancelled = false;
	        try {
	            Path reservationListPath = Paths.get("src/nubos/ReservationList.txt");
	            List<String> lines = Files.readAllLines(reservationListPath);
	            List<String> updatedLines = new ArrayList<>();
	            String origin = "", dropOff = "", schedule = "", date = "";
	            
	            for (String line : lines) {
	                if (line.startsWith("Email:" + userEmail)) {
	                    // Split the line into individual data items
	                    String[] parts = line.split(", ");
	                    for (String part : parts) {
	                        if (part.startsWith("Origin:")) {
	                            origin = part.substring("Origin:".length()).trim();
	                        } else if (part.startsWith("DropOff:")) {
	                        	dropOff = part.substring("DropOff:".length()).trim();
	                        } else if (part.startsWith("Schedule:")) {
	                            schedule = part.substring("Schedule:".length()).trim();
	                        } else if (part.startsWith("Date:")) {
	                            date = part.substring("Date:".length()).trim();
	                        }
	                    }
	                } else {
	                    updatedLines.add(line);
	                }
	            }

	            // Write the updated reservations to the file
	            Files.write(reservationListPath, updatedLines);

	            // Now update the available seats in the Slots.txt file
	            Path slotsPath = Paths.get("src/nubos/Slots.txt");
	            lines = Files.readAllLines(slotsPath);
	            updatedLines.clear();
	            
	            boolean seatsUpdated = false;

	            for (String line : lines) {
	                if (line.contains("Origin:" + origin) && line.contains("DropOff:" + dropOff) && line.contains("Schedule:" + schedule) && line.contains("Date:" + date)) {
	                    String[] parts = line.split(", ");
	                    for (String part : parts) {
	                        if (part.startsWith("Seats:")) {
	                            int seats = Integer.parseInt(part.substring("Seats:".length()).trim());
	                            seats++; // Increase the number of available seats
	                            if (seats > 3) {
	                                seats = 3;
	                                seatsUpdated = true;
	                            }
	                            line = line.replace(part, "Seats:" + seats);
	                        }
	                    }
	                }
	                updatedLines.add(line);
	            }

	            // Write the updated slots to the file
	            Files.write(slotsPath, updatedLines);
	            if (seatsUpdated) {
	            	txtSeats.setText("2"); // Update the seats only if they have been modified
	            }
	            
	        } catch (IOException ex) {
	            ex.printStackTrace();
	        }	       
	        updateSeats();
			return reservationCancelled;
	    }
	}


	
		


			        
