package nubos;

import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import java.awt.Cursor;
import javax.swing.border.LineBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Optional;
import java.util.stream.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

import java.util.ArrayList;


public class MyProfile extends BasePage {

	private JTextField txtMyProfile;
	private JPanel pnlName,pnlStudentID, pnlAddress, pnlContact, pnlEmail, pnlEmContactPr, pnlEmRela, pnlEmCnctNo, pnlEmCnctEmail;
	private JTextField txtNameTag, txtStudentIdTag, txtAddressTag, txtContactTag, txtEmailTag, txtContactPrsTag, txtRelaTag, txtContactPrsNoTag, txtContactPrsEmailTag;
	private JTextField txtFldName,txtFldStudentID, txtFldAddress, txtFldContact, txtFldEmail, txtFldEmCnctName, txtFldRela, txtFldEmCnctNo, txtFldEmCnctEmail;
	private JButton btnUpdate;
	private JTextField txtAdvisory;
	
	
	public MyProfile() {
		super();
		
		pnlName = new JPanel();
		pnlName.setBorder(new LineBorder(new Color(0, 0, 0)));
		pnlName.setBackground(new Color(51, 51, 204));
		pnlName.setBounds(118, 421, 135, 36);
		layeredPane.add(pnlName);
		pnlName.setLayout(null);
		layeredPane.add(pnlName, JLayeredPane.PALETTE_LAYER);
		
		pnlStudentID = new JPanel();
		pnlStudentID.setLayout(null);
		pnlStudentID.setBorder(new LineBorder(new Color(0, 0, 0)));
		pnlStudentID.setBackground(new Color(51, 51, 204));
		pnlStudentID.setBounds(560, 421, 297, 36);
		layeredPane.add(pnlStudentID);
		layeredPane.add(pnlStudentID, JLayeredPane.PALETTE_LAYER);
		
		pnlAddress = new JPanel();
		pnlAddress.setLayout(null);
		pnlAddress.setBorder(new LineBorder(new Color(0, 0, 0)));
		pnlAddress.setBackground(new Color(51, 51, 204));
		pnlAddress.setBounds(118, 456, 135, 36);
		layeredPane.add(pnlAddress);
		layeredPane.add(pnlAddress, JLayeredPane.PALETTE_LAYER);
		
		pnlContact = new JPanel();
		pnlContact.setLayout(null);
		pnlContact.setBorder(new LineBorder(new Color(0, 0, 0)));
		pnlContact.setBackground(new Color(51, 51, 204));
		pnlContact.setBounds(118, 491, 135, 36);
		layeredPane.add(pnlContact, JLayeredPane.PALETTE_LAYER);
		
		pnlEmail = new JPanel();
		pnlEmail.setLayout(null);
		pnlEmail.setBorder(new LineBorder(new Color(0, 0, 0)));
		pnlEmail.setBackground(new Color(51, 51, 204));
		pnlEmail.setBounds(560, 491, 153, 36);
		layeredPane.add(pnlEmail, JLayeredPane.PALETTE_LAYER);
		
		pnlEmContactPr = new JPanel();
		pnlEmContactPr.setLayout(null);
		pnlEmContactPr.setBorder(new LineBorder(new Color(0, 0, 0)));
		pnlEmContactPr.setBackground(new Color(51, 51, 204));
		pnlEmContactPr.setBounds(118, 526, 378, 36);
		layeredPane.add(pnlEmContactPr, JLayeredPane.PALETTE_LAYER);
		
		pnlEmRela = new JPanel();
		pnlEmRela.setLayout(null);
		pnlEmRela.setBorder(new LineBorder(new Color(0, 0, 0)));
		pnlEmRela.setBackground(new Color(51, 51, 204));
		pnlEmRela.setBounds(762, 526, 141, 36);
		layeredPane.add(pnlEmRela, JLayeredPane.PALETTE_LAYER);
		
		pnlEmCnctNo = new JPanel();
		pnlEmCnctNo.setLayout(null);
		pnlEmCnctNo.setBorder(new LineBorder(new Color(0, 0, 0)));
		pnlEmCnctNo.setBackground(new Color(51, 51, 204));
		pnlEmCnctNo.setBounds(118, 561, 135, 36);
		layeredPane.add(pnlEmCnctNo, JLayeredPane.PALETTE_LAYER);
		
		pnlEmCnctEmail = new JPanel();
		pnlEmCnctEmail.setLayout(null);
		pnlEmCnctEmail.setBorder(new LineBorder(new Color(0, 0, 0)));
		pnlEmCnctEmail.setBackground(new Color(51, 51, 204));
		pnlEmCnctEmail.setBounds(560, 561, 141, 36);
		layeredPane.add(pnlEmCnctEmail, JLayeredPane.PALETTE_LAYER);
		
		txtNameTag = new JTextField();
		txtNameTag.setFont(new Font("Calibri", Font.BOLD, 20));
		txtNameTag.setForeground(new Color(255, 255, 255));
		txtNameTag.setEditable(false);
		txtNameTag.setOpaque(false);
		txtNameTag.setText("NAME*");
		txtNameTag.setBorder(null);
		txtNameTag.setBounds(10, 11, 65, 20);
		txtNameTag.setColumns(10);	
		pnlName.add(txtNameTag);
		
		txtStudentIdTag = new JTextField();
		txtStudentIdTag.setText("  STUDENT ID/APPLICATION NO.*");
		txtStudentIdTag.setOpaque(false);
		txtStudentIdTag.setForeground(Color.WHITE);
		txtStudentIdTag.setFont(new Font("Calibri", Font.BOLD, 20));
		txtStudentIdTag.setEditable(false);
		txtStudentIdTag.setColumns(10);
		txtStudentIdTag.setBorder(null);
		txtStudentIdTag.setBounds(10, 11, 287, 20);
		pnlStudentID.add(txtStudentIdTag);
		
		txtAddressTag = new JTextField();
		txtAddressTag.setText("ADDRESS");
		txtAddressTag.setOpaque(false);
		txtAddressTag.setForeground(Color.WHITE);
		txtAddressTag.setFont(new Font("Calibri", Font.BOLD, 20));
		txtAddressTag.setEditable(false);
		txtAddressTag.setColumns(10);
		txtAddressTag.setBorder(null);
		txtAddressTag.setBounds(10, 11, 85, 20);
		pnlAddress.add(txtAddressTag);
		
		txtContactTag = new JTextField();
		txtContactTag.setText("CONTACT No.");
		txtContactTag.setOpaque(false);
		txtContactTag.setForeground(Color.WHITE);
		txtContactTag.setFont(new Font("Calibri", Font.BOLD, 20));
		txtContactTag.setEditable(false);
		txtContactTag.setColumns(10);
		txtContactTag.setBorder(null);
		txtContactTag.setBounds(10, 11, 117, 20);
		pnlContact.add(txtContactTag);
		
		txtEmailTag = new JTextField();
		txtEmailTag.setText("Email Address*");
		txtEmailTag.setOpaque(false);
		txtEmailTag.setForeground(Color.WHITE);
		txtEmailTag.setFont(new Font("Calibri", Font.BOLD, 20));
		txtEmailTag.setEditable(false);
		txtEmailTag.setColumns(10);
		txtEmailTag.setBorder(null);
		txtEmailTag.setBounds(10, 11, 133, 20);
		pnlEmail.add(txtEmailTag);
		
		txtContactPrsTag = new JTextField();
		txtContactPrsTag.setText("CONTACT PERSON IN CASE OF EMERGENCY");
		txtContactPrsTag.setOpaque(false);
		txtContactPrsTag.setForeground(Color.WHITE);
		txtContactPrsTag.setFont(new Font("Calibri", Font.BOLD, 20));
		txtContactPrsTag.setEditable(false);
		txtContactPrsTag.setColumns(10);
		txtContactPrsTag.setBorder(null);
		txtContactPrsTag.setBounds(10, 11, 366, 20);
		pnlEmContactPr.add(txtContactPrsTag);

		txtRelaTag = new JTextField();
		txtRelaTag.setText("RELATIONSHIP");
		txtRelaTag.setOpaque(false);
		txtRelaTag.setForeground(Color.WHITE);
		txtRelaTag.setFont(new Font("Calibri", Font.BOLD, 20));
		txtRelaTag.setEditable(false);
		txtRelaTag.setColumns(10);
		txtRelaTag.setBorder(null);
		txtRelaTag.setBounds(10, 11, 366, 20);
		pnlEmRela.add(txtRelaTag);
		
		txtContactPrsNoTag = new JTextField();
		txtContactPrsNoTag.setText("Contact No.");
		txtContactPrsNoTag.setOpaque(false);
		txtContactPrsNoTag.setForeground(Color.WHITE);
		txtContactPrsNoTag.setFont(new Font("Calibri", Font.BOLD, 20));
		txtContactPrsNoTag.setEditable(false);
		txtContactPrsNoTag.setColumns(10);
		txtContactPrsNoTag.setBorder(null);
		txtContactPrsNoTag.setBounds(10, 11, 106, 20);
		pnlEmCnctNo.add(txtContactPrsNoTag);
		
		txtContactPrsEmailTag = new JTextField();
		txtContactPrsEmailTag.setText("Email Address");
		txtContactPrsEmailTag.setOpaque(false);
		txtContactPrsEmailTag.setForeground(Color.WHITE);
		txtContactPrsEmailTag.setFont(new Font("Calibri", Font.BOLD, 20));
		txtContactPrsEmailTag.setEditable(false);
		txtContactPrsEmailTag.setColumns(10);
		txtContactPrsEmailTag.setBorder(null);
		txtContactPrsEmailTag.setBounds(10, 11, 125, 20);
		pnlEmCnctEmail.add(txtContactPrsEmailTag);
		
		txtAdvisory = new JTextField();
		txtAdvisory.setOpaque(false);
		txtAdvisory.setText("*For changing of your Name, StudentID/Application Number or Email, please contact our IT support through email (itro@national-u.edu.ph) or visit our Admin in registrar office.");
		txtAdvisory.setForeground(new Color(0, 0, 0));
		txtAdvisory.setFont(new Font("Calibri", Font.BOLD, 15));
		txtAdvisory.setEditable(false);
		txtAdvisory.setColumns(10);
		txtAdvisory.setBorder(null);
		txtAdvisory.setBounds(118, 684, 1093, 20);
		layeredPane.add(txtAdvisory, JLayeredPane.PALETTE_LAYER);
				
		txtFldName = new JTextField();
		txtFldName.setDisabledTextColor(new Color(51, 51, 51));
		txtFldName.setEditable(false);
		txtFldName.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				 if (txtFldName.getText().equals(" Enter your fullname")) { 
					 txtFldName.setText(""); 
	             }
	    		
	         }
	         @Override 
	         public void focusLost(FocusEvent e) { 
	             if (txtFldName.getText().isEmpty()) { 
	            	 txtFldName.setText(" Enter your fullname"); 
	             }
	         }
	     });
		
		txtFldName.setForeground(new Color(153, 153, 153));
		txtFldName.setFont(new Font("Calibri", Font.PLAIN, 15));
		txtFldName.setBorder(new LineBorder(new Color(0, 0, 0)));
		txtFldName.setBounds(252, 421, 308, 36);
		layeredPane.add(txtFldName);
		txtFldName.setColumns(10);
		layeredPane.add(txtFldName, JLayeredPane.PALETTE_LAYER);
	
		
		txtFldStudentID = new JTextField();
		txtFldStudentID.setDisabledTextColor(new Color(51, 51, 51));
		txtFldStudentID.setEditable(false);
		txtFldStudentID.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				 if (txtFldStudentID.getText().equals(" Enter your Student ID/Application No.")) { 
					 txtFldStudentID.setText(""); 
	             }
	    		
	         }
	         @Override 
	         public void focusLost(FocusEvent e) { 
	             if (txtFldStudentID.getText().isEmpty()) { 
	            	 txtFldStudentID.setText(" Enter your Student ID/Application No."); 
	             }
	         }
	     });
	
		txtFldStudentID.setForeground(new Color(153, 153, 153));
		txtFldStudentID.setFont(new Font("Calibri", Font.PLAIN, 15));
		txtFldStudentID.setColumns(10);
		txtFldStudentID.setBorder(new LineBorder(new Color(0, 0, 0)));
		txtFldStudentID.setBounds(856, 421, 355, 36);
		layeredPane.add(txtFldStudentID, JLayeredPane.PALETTE_LAYER);

		
		txtFldAddress = new JTextField();
		txtFldAddress.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				 if (txtFldAddress.getText().equals(" Enter your address")) { 
					 txtFldAddress.setText(""); 
	             }
	    		
	         }
	         @Override 
	         public void focusLost(FocusEvent e) { 
	             if (txtFldAddress.getText().isEmpty()) { 
	            	 txtFldAddress.setText(" Enter your address"); 
	             }
	         }
	     });
		
		txtFldAddress.setForeground(new Color(0, 0, 0));
		txtFldAddress.setFont(new Font("Calibri", Font.PLAIN, 15));
		txtFldAddress.setColumns(10);
		txtFldAddress.setBorder(new LineBorder(new Color(0, 0, 0)));
		txtFldAddress.setBounds(252, 456, 959, 36);
		layeredPane.add(txtFldAddress, JLayeredPane.PALETTE_LAYER);
	
		
		txtFldContact = new JTextField();
		txtFldContact.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				 if (txtFldContact.getText().equals(" Enter your phone or mobile number")) { 
					 txtFldContact.setText(""); 
	             }
	    		
	         }
	         @Override 
	         public void focusLost(FocusEvent e) { 
	             if (txtFldContact.getText().isEmpty()) { 
	            	 txtFldContact.setText(" Enter your phone or mobile number"); 
	             }
	         }
	     });
		txtFldContact.setForeground(new Color(0, 0, 0));
		txtFldContact.setFont(new Font("Calibri", Font.PLAIN, 15));
		txtFldContact.setColumns(10);
		txtFldContact.setBorder(new LineBorder(new Color(0, 0, 0)));
		txtFldContact.setBounds(252, 491, 309, 36);
		layeredPane.add(txtFldContact, JLayeredPane.PALETTE_LAYER);
	
		
		txtFldEmail = new JTextField();
		txtFldEmail.setDisabledTextColor(new Color(51, 51, 51));
		txtFldEmail.setEditable(false);
		txtFldEmail.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				 if (txtFldEmail.getText().equals(" Enter your email address")) { 
					 txtFldEmail.setText(""); 
	             }
	    		
	         }
	         @Override 
	         public void focusLost(FocusEvent e) { 
	             if (txtFldEmail.getText().isEmpty()) { 
	            	 txtFldEmail.setText(" Enter your email address"); 
	             }
	         }
	     });
		txtFldEmail.setForeground(new Color(153, 153, 153));
		txtFldEmail.setFont(new Font("Calibri", Font.PLAIN, 15));
		txtFldEmail.setColumns(10);
		txtFldEmail.setBorder(new LineBorder(new Color(0, 0, 0)));
		txtFldEmail.setBounds(712, 491, 499, 36);
		layeredPane.add(txtFldEmail, JLayeredPane.PALETTE_LAYER);
	
		
		txtFldEmCnctName = new JTextField();
		txtFldEmCnctName.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				 if (txtFldEmCnctName.getText().equals(" Enter name of contact person")) { 
					 txtFldEmCnctName.setText(""); 
	             }
	    		
	         }
	         @Override 
	         public void focusLost(FocusEvent e) { 
	             if (txtFldEmCnctName.getText().isEmpty()) { 
	            	 txtFldEmCnctName.setText(" Enter name of contact person"); 
	             }
	         }
	     });
		txtFldEmCnctName.setForeground(new Color(0, 0, 0));
		txtFldEmCnctName.setFont(new Font("Calibri", Font.PLAIN, 15));
		txtFldEmCnctName.setColumns(10);
		txtFldEmCnctName.setBorder(new LineBorder(new Color(0, 0, 0)));
		txtFldEmCnctName.setBounds(495, 526, 268, 36);
		layeredPane.add(txtFldEmCnctName, JLayeredPane.PALETTE_LAYER);

		
		txtFldRela = new JTextField();
		txtFldRela.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				 if (txtFldRela.getText().equals(" Enter relationship")) { 
					 txtFldRela.setText(""); 
	             }
	    		
	         }
	         @Override 
	         public void focusLost(FocusEvent e) { 
	             if (txtFldRela.getText().isEmpty()) { 
	            	 txtFldRela.setText(" Enter relationship"); 
	             }
	         }
	     });
		txtFldRela.setForeground(new Color(0, 0, 0));
		txtFldRela.setFont(new Font("Calibri", Font.PLAIN, 15));
		txtFldRela.setColumns(10);
		txtFldRela.setBorder(new LineBorder(new Color(0, 0, 0)));
		txtFldRela.setBounds(902, 526, 309, 36);
		layeredPane.add(txtFldRela, JLayeredPane.PALETTE_LAYER);
	
		
		txtFldEmCnctNo = new JTextField();
		txtFldEmCnctNo.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				 if (txtFldEmCnctNo.getText().equals(" Enter phone or mobile number")) { 
					 txtFldEmCnctNo.setText(""); 
	             }
	    		
	         }
	         @Override 
	         public void focusLost(FocusEvent e) { 
	             if (txtFldEmCnctNo.getText().isEmpty()) { 
	            	 txtFldEmCnctNo.setText(" Enter phone or mobile number"); 
	             }
	         }
	     });
		txtFldEmCnctNo.setForeground(new Color(0, 0, 0));
		txtFldEmCnctNo.setFont(new Font("Calibri", Font.PLAIN, 15));
		txtFldEmCnctNo.setColumns(10);
		txtFldEmCnctNo.setBorder(new LineBorder(new Color(0, 0, 0)));
		txtFldEmCnctNo.setBounds(252, 561, 309, 36);
		layeredPane.add(txtFldEmCnctNo, JLayeredPane.PALETTE_LAYER);

		
		txtFldEmCnctEmail = new JTextField();
		txtFldEmCnctEmail.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				 if (txtFldEmCnctEmail.getText().equals(" Enter email address")) { 
					 txtFldEmCnctEmail.setText(""); 
	             }
	    		
	         }
	         @Override 
	         public void focusLost(FocusEvent e) { 
	             if (txtFldEmCnctEmail.getText().isEmpty()) { 
	            	 txtFldEmCnctEmail.setText(" Enter email address"); 
	             }
	         }
	     });
		txtFldEmCnctEmail.setForeground(new Color(0, 0, 0));
		txtFldEmCnctEmail.setFont(new Font("Calibri", Font.PLAIN, 15));
		txtFldEmCnctEmail.setColumns(10);
		txtFldEmCnctEmail.setBorder(new LineBorder(new Color(0, 0, 0)));
		txtFldEmCnctEmail.setBounds(700, 561, 511, 36);
		layeredPane.add(txtFldEmCnctEmail, JLayeredPane.PALETTE_LAYER);
		
						
		txtMyProfile = new JTextField();
		txtMyProfile.setEditable(false);
		txtMyProfile.setBackground(new Color(255, 255, 255));
		txtMyProfile.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		txtMyProfile.setOpaque(false);
		txtMyProfile.setForeground(new Color(255, 255, 255));
		txtMyProfile.setFont(new Font("Calibri", Font.BOLD, 40));
		txtMyProfile.setBorder(null);
		txtMyProfile.setText("My Profile");
		txtMyProfile.setBounds(580, 296, 175, 42);
		txtMyProfile.setColumns(10);
		layeredPane.add(txtMyProfile, JLayeredPane.PALETTE_LAYER);
		
		btnUpdate = new JButton("UPDATE");
		btnUpdate.setHorizontalTextPosition(SwingConstants.CENTER);
		btnUpdate.setBorderPainted(false);
		btnUpdate.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnUpdate.setFocusPainted(false);
		btnUpdate.setFont(new Font("Calibri", Font.BOLD, 20));
		btnUpdate.setForeground(new Color(255, 255, 255));
		btnUpdate.setBackground(new Color(51, 51, 204));
		btnUpdate.setBorder(new LineBorder(new Color(0, 0, 0)));
		btnUpdate.setBounds(1070, 596, 141, 36);
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 try {
			            List<String> lines = Files.readAllLines(Paths.get("src/nubos/FileCabinet.txt"), StandardCharsets.UTF_8);
			            String email = "Email: " + txtFldEmail.getText();
			            boolean hasEmail = lines.stream().anyMatch(line -> line.contains(email));
			            List<String> updatedLines = new ArrayList<>();
			            boolean inGroup = false;
			           
			            
			               for (String line : lines) {
			                    if (line.equals(email)) {
			                        inGroup = true;
			                    } else if (line.startsWith("Email: ")) {
			                        inGroup = false;
			                    }
			                    
			                    if (inGroup) {
			                    	  if (line.startsWith("Address: ")) {
			                              line = "Address: " + txtFldAddress.getText();
			                          } else if (line.startsWith("Contact: ")) {
			                              line = "Contact: " + txtFldContact.getText();
			                          } else if (line.startsWith("Contact Person Name: ")) {
			                              line = "Contact Person Name: " + txtFldEmCnctName.getText();
			                          } else if (line.startsWith("Relation: ")) {
			                              line = "Relation: " + txtFldRela.getText();
			                          } else if (line.startsWith("Contact Person Number: ")) {
			                              line = "Contact Person Number: " + txtFldEmCnctNo.getText();
			                          } else if (line.startsWith("Contact Person Email: ")) {
			                              line = "Contact Person Email: " + txtFldEmCnctEmail.getText();
			                          }
			                      }

			                      updatedLines.add(line);
			                  }

			                  if (!hasEmail) {
			                      updatedLines.add("");
			                      updatedLines.add(email);
			                      updatedLines.add("Address: " + txtFldAddress.getText());
			                      updatedLines.add("Contact: " + txtFldContact.getText());
			                      updatedLines.add("Contact Person Name: " + txtFldEmCnctName.getText());
			                      updatedLines.add("Relation: " + txtFldRela.getText());
			                      updatedLines.add("Contact Person Number: " + txtFldEmCnctNo.getText());
			                      updatedLines.add("Contact Person Email: " + txtFldEmCnctEmail.getText());
			                  }

			                  Files.write(Paths.get("src/nubos/FileCabinet.txt"), updatedLines, StandardCharsets.UTF_8);
			                  JOptionPane.showMessageDialog(null, "Profile update successful!!");
			              } catch (IOException ex) {
			                  ex.printStackTrace();
			              }
				 			
			          }
			      });
		layeredPane.add(btnUpdate, JLayeredPane.PALETTE_LAYER);
		
		setVisible(true);
		
		}
	
	
		public User getUserData(String email) {
		    User user = null;
		    try (BufferedReader br = new BufferedReader(new FileReader("src/nubos/FileCabinet.txt"))) {
		        String line;
		        while ((line = br.readLine()) != null) {
		            if (line.contains("Email:'" + email + "'")) {
		                String[] parts = line.split("', ");
		                String fullName = parts[0].split("'")[1];
		                String password = parts[2].split("'")[1];
		                String studentId = parts[3].split("'")[1];
		                String address = parts[4].split("'")[1];
		                int contact = Integer.parseInt(parts[5].split("'")[1]);
		                String contactPname = parts[6].split("'")[1];
		                String relation = parts[7].split("'")[1];
		                int contactPnum = Integer.parseInt(parts[8].split("'")[1]);
		                String contactPemail = parts[9].split("'")[1];
		                user = new User(fullName, email, password, studentId, address, contact, contactPname, relation, contactPnum, contactPemail);
		                break;
		            }
		        }
		    } catch (IOException ioException) {
		        ioException.printStackTrace();
		    }
		    return user;
		}
		public void initialize() {
			String email = UserSession.getLoggedInUserEmail();
			User user = getUserData(email);
			if (user != null) {
		        txtFldName.setText(user.getFullName());
		        txtFldEmail.setText(user.getEmailAddress());
		        txtFldStudentID.setText(user.getStudentId());
		        txtFldAddress.setText(user.getAddress());
		        txtFldContact.setText(String.valueOf(user.getContact()));
		        txtFldEmCnctName.setText(user.getContactPname());
		        txtFldRela.setText(user.getRelation());
		        txtFldEmCnctNo.setText(String.valueOf(user.getContactPnum()));
		        txtFldEmCnctEmail.setText(user.getContactPemail());
		}
	}
}
	
	
	
