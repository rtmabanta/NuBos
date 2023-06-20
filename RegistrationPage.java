package nubos;

import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyAdapter;

import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JTextPane;
import java.awt.Cursor;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import java.awt.event.KeyEvent;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JPasswordField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Dimension;

public class RegistrationPage extends JFrame {

	private JPanel contentPane;
	private JTextField txtFldFullname, txtFldEmail, txtFldPassword, txtFldStudentID;
	private JTextArea txtRegister, txtFullName, txtEmail, txtPassword, txtStudentId, txtNoStudentNo, txtLogIn;
	private JLayeredPane lyrdPaneReg;
	private JButton btnNuQuest, btnTerms, btnLogin, btnSignUp, btnClose;
	private JCheckBox chkBoxAgreement;
	private JLabel lblRegistrationBg;
	private JPasswordField pswFldPassword;
	private JButton btnEye;

	public RegistrationPage() {
		
			
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setSize(840, 520);
	    setLocationRelativeTo(null);
	    setUndecorated(true);
		

		lyrdPaneReg = new JLayeredPane(); 
        lyrdPaneReg.setBounds(0, 0, 840, 520);
        getContentPane().add(lyrdPaneReg);
        lyrdPaneReg.setLayout(null);
        
        btnEye = new JButton("");
        btnEye.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnEye.setSelectedIcon(new ImageIcon(RegistrationPage.class.getResource("/nubos/Assets/eyeOpenSmall.png")));
        btnEye.setRequestFocusEnabled(false);
        btnEye.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mousePressed(MouseEvent e) {
        		pswFldPassword.setEchoChar((char)0);
        	}
        	
        	 @Override
        	    public void mouseReleased(MouseEvent e) {
        		 pswFldPassword.setEchoChar('*');
        	    }
        });
        btnEye.setIcon(new ImageIcon(RegistrationPage.class.getResource("/nubos/Assets/eyeOpenSmall.png")));
        btnEye.setFocusPainted(false);
        btnEye.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), null, null, null));
        btnEye.setBounds(756, 239, 38, 29);
        lyrdPaneReg.add(btnEye);
        
        txtRegister = new JTextArea();
        txtRegister.setFocusable(false);
        txtRegister.setFocusTraversalKeysEnabled(false);
        txtRegister.setEditable(false);
        txtRegister.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
        txtRegister.setText("Register");
        txtRegister.setOpaque(false);
        txtRegister.setWrapStyleWord(true);
        txtRegister.setLineWrap(true);
        txtRegister.setForeground(new Color(255, 255, 255));
        txtRegister.setFont(new Font("Calibri", Font.PLAIN, 30));
        txtRegister.setBorder(null);
        txtRegister.setBounds(459, 36, 105, 35);
        lyrdPaneReg.add(txtRegister);  
        
        txtFullName = new JTextArea();
        txtFullName.setFocusTraversalKeysEnabled(false);
        txtFullName.setEditable(false);
        txtFullName.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
        txtFullName.setWrapStyleWord(true);
        txtFullName.setText("FullName");
        txtFullName.setOpaque(false);
        txtFullName.setLineWrap(true);
        txtFullName.setForeground(Color.WHITE);
        txtFullName.setFont(new Font("Calibri", Font.PLAIN, 20));
        txtFullName.setBorder(null);
        txtFullName.setBounds(459, 82, 92, 25);
        lyrdPaneReg.add(txtFullName);
        
        txtEmail = new JTextArea();
        txtEmail.setFocusable(false);
        txtEmail.setFocusTraversalKeysEnabled(false);
        txtEmail.setEditable(false);
        txtEmail.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
        txtEmail.setWrapStyleWord(true);
        txtEmail.setText("Email");
        txtEmail.setOpaque(false);
        txtEmail.setLineWrap(true);
        txtEmail.setForeground(Color.WHITE);
        txtEmail.setFont(new Font("Calibri", Font.PLAIN, 20));
        txtEmail.setBorder(null);
        txtEmail.setBounds(459, 148, 92, 25);
        lyrdPaneReg.add(txtEmail);
        
        txtPassword = new JTextArea();
        txtPassword.setFocusable(false);
        txtPassword.setFocusTraversalKeysEnabled(false);
        txtPassword.setEditable(false);
        txtPassword.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
        txtPassword.setWrapStyleWord(true);
        txtPassword.setText("Password");
        txtPassword.setOpaque(false);
        txtPassword.setLineWrap(true);
        txtPassword.setForeground(Color.WHITE);
        txtPassword.setFont(new Font("Calibri", Font.PLAIN, 20));
        txtPassword.setBorder(null);
        txtPassword.setBounds(459, 212, 92, 25);
        lyrdPaneReg.add(txtPassword);
        
        txtStudentId = new JTextArea();
        txtStudentId.setFocusable(false);
        txtStudentId.setFocusTraversalKeysEnabled(false);
        txtStudentId.setEditable(false);
        txtStudentId.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
        txtStudentId.setWrapStyleWord(true);
        txtStudentId.setText("Student ID/Applicant No.");
        txtStudentId.setOpaque(false);
        txtStudentId.setLineWrap(true);
        txtStudentId.setForeground(Color.WHITE);
        txtStudentId.setFont(new Font("Calibri", Font.PLAIN, 20));
        txtStudentId.setBorder(null);
        txtStudentId.setBounds(459, 279, 228, 25);
        lyrdPaneReg.add(txtStudentId);
        
        txtNoStudentNo = new JTextArea();
        txtNoStudentNo.setFocusable(false);
        txtNoStudentNo.setFocusTraversalKeysEnabled(false);
        txtNoStudentNo.setEditable(false);
        txtNoStudentNo.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
        txtNoStudentNo.setWrapStyleWord(true);
        txtNoStudentNo.setText("No student application number? Please click");
        txtNoStudentNo.setOpaque(false);
        txtNoStudentNo.setLineWrap(true);
        txtNoStudentNo.setForeground(Color.WHITE);
        txtNoStudentNo.setFont(new Font("Calibri", Font.PLAIN, 15));
        txtNoStudentNo.setBorder(null);
        txtNoStudentNo.setBounds(459, 336, 345, 20);
        lyrdPaneReg.add(txtNoStudentNo);
        
        txtFldFullname = new JTextField();
        txtFldFullname.setForeground(new Color(153, 153, 153));
        txtFldFullname.setFont(new Font("Calibri", Font.PLAIN, 15));
        txtFldFullname.setText(" Enter your fullname");
        txtFldFullname.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        txtFldFullname.setBounds(459, 106, 335, 30);
        txtFldFullname.setColumns(10);
        txtFldFullname.addFocusListener(new FocusListener() {
        	@Override
        	public void focusGained(FocusEvent e) {
        		 if (txtFldFullname.getText().equals(" Enter your fullname")) { 
        			 txtFldFullname.setText(""); 
                 }
             }
             @Override 
             public void focusLost(FocusEvent e) { 
                 if (txtFldFullname.getText().isEmpty()) { 
                	 txtFldFullname.setText(" Enter your fullname"); 
                 }
             }
         });
        lyrdPaneReg.add(txtFldFullname);
        
        
        txtFldEmail = new JTextField();
        txtFldEmail.setText(" Enter your valid email");
        txtFldEmail.setForeground(new Color(153, 153, 153));
        txtFldEmail.setFont(new Font("Calibri", Font.PLAIN, 15));
        txtFldEmail.setColumns(10);
        txtFldEmail.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        txtFldEmail.setBounds(459, 171, 335, 30);
        txtFldEmail.addFocusListener(new FocusListener() {
        	
	        @Override
	    	public void focusGained(FocusEvent e) {
	    		 if (txtFldEmail.getText().equals(" Enter your valid email")) { 
	    			 txtFldEmail.setText(""); 
	             }
	    		
	         }
	         @Override 
	         public void focusLost(FocusEvent e) { 
	             if (txtFldEmail.getText().isEmpty()) { 
	            	 txtFldEmail.setText(" Enter your valid email"); 
	             }
	         }
	     });
        lyrdPaneReg.add(txtFldEmail);
        
        txtFldPassword = new JTextField(" Enter your password");
        txtFldPassword.setForeground(new Color(153, 153, 153));
        txtFldPassword.setFont(new Font("Calibri", Font.PLAIN, 15));
        txtFldPassword.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), null, null, null));
        txtFldPassword.setBounds(459, 238, 297, 30);
        txtFldPassword.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (txtFldPassword.getText().equals(" Enter your password")) {
                	txtFldPassword.setVisible(false);
                    pswFldPassword.setVisible(true);
                    pswFldPassword.requestFocusInWindow();
                }
            }

			@Override
			public void focusLost(FocusEvent e) {
				// TODO Auto-generated method stub
				
			}
        });
        lyrdPaneReg.add(txtFldPassword);
        
        pswFldPassword = new JPasswordField(" Enter your password");
        pswFldPassword.setRequestFocusEnabled(false);
	    pswFldPassword.setFont(new Font("Calibri", Font.PLAIN, 15));
	    pswFldPassword.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), null, null, null));
	    pswFldPassword.setBounds(459, 238, 297, 30);
	    pswFldPassword.addFocusListener(new FocusListener() {
	        @Override
	        public void focusGained(FocusEvent e) {
	        	 if (new String(pswFldPassword.getPassword()).equals(" Enter your password")) {
	                 pswFldPassword.setText("");
	        	 }
	        }
	        @Override
	        public void focusLost(FocusEvent e) {
	            if (pswFldPassword.getPassword().length == 0) {
	                pswFldPassword.setVisible(false);
	                txtFldPassword.setVisible(true);
	            }
	        }
	    });
	    lyrdPaneReg.add(pswFldPassword);
        
        txtFldStudentID = new JTextField();
        txtFldStudentID.setText(" Enter your Student ID or Applicant No.");
        txtFldStudentID.setForeground(new Color(153, 153, 153));
        txtFldStudentID.setFont(new Font("Calibri", Font.PLAIN, 15));
        txtFldStudentID.setColumns(10);
        txtFldStudentID.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        txtFldStudentID.setBounds(459, 301, 335, 30);
        txtFldStudentID.addFocusListener(new FocusListener() {
	        @Override
	    	public void focusGained(FocusEvent e) {
	    		 if (txtFldStudentID.getText().equals(" Enter your Student ID or Applicant No.")) { 
	    			 txtFldStudentID.setText(""); 
	             }
	         }
	         @Override 
	         public void focusLost(FocusEvent e) { 
	             if (txtFldStudentID.getText().isEmpty()) { 
	            	 txtFldStudentID.setText(" Enter your Student ID or Applicant No."); 
	             }
	         }
	     });
        lyrdPaneReg.add(txtFldStudentID);
                
        txtLogIn = new JTextArea();
        txtLogIn.setFocusable(false);
        txtLogIn.setFocusTraversalKeysEnabled(false);
        txtLogIn.setEditable(false);
        txtLogIn.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
        txtLogIn.setWrapStyleWord(true);
        txtLogIn.setText("Already have an account? Please click");
        txtLogIn.setOpaque(false);
        txtLogIn.setLineWrap(true);
        txtLogIn.setForeground(Color.WHITE);
        txtLogIn.setFont(new Font("Calibri", Font.PLAIN, 15));
        txtLogIn.setBorder(null);
        txtLogIn.setBounds(490, 468, 239, 20);
        lyrdPaneReg.add(txtLogIn);
        
        chkBoxAgreement = new JCheckBox("I agree all statements are true.");
        chkBoxAgreement.setFocusable(false);
        chkBoxAgreement.setVerticalTextPosition(SwingConstants.TOP);
        chkBoxAgreement.setForeground(new Color(255, 255, 255));
        chkBoxAgreement.setFocusPainted(false);
        chkBoxAgreement.setOpaque(false);
        chkBoxAgreement.setFont(new Font("Calibri", Font.PLAIN, 15));
        chkBoxAgreement.setContentAreaFilled(false);
        chkBoxAgreement.setBorder(null);
        chkBoxAgreement.setBounds(459, 373, 209, 23);
        lyrdPaneReg.add(chkBoxAgreement);
        
        btnNuQuest = new JButton("NuQuest");
        btnNuQuest.setFocusTraversalKeysEnabled(false);
        btnNuQuest.setFocusable(false);
        btnNuQuest.setHorizontalAlignment(SwingConstants.LEADING);
        btnNuQuest.setForeground(new Color(0, 51, 255));
        btnNuQuest.setFont(new Font("Calibri", Font.BOLD, 15));
        btnNuQuest.setFocusPainted(false);
        btnNuQuest.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnNuQuest.setContentAreaFilled(false);
        btnNuQuest.setBorderPainted(false);
        btnNuQuest.setBorder(null);
        btnNuQuest.setBounds(738, 335, 71, 23);
        lyrdPaneReg.add(btnNuQuest);
        
        btnTerms = new JButton("Terms of services.");
        btnTerms.setFocusable(false);
        btnTerms.setHorizontalAlignment(SwingConstants.LEADING);
        btnTerms.setForeground(new Color(0, 51, 255));
        btnTerms.setFont(new Font("Calibri", Font.BOLD, 15));
        btnTerms.setFocusPainted(false);
        btnTerms.setContentAreaFilled(false);
        btnTerms.setBorderPainted(false);
        btnTerms.setBorder(null);
        btnTerms.setBounds(670, 373, 117, 23);
        lyrdPaneReg.add(btnTerms);
               
        btnLogin = new JButton("Log In");
        btnLogin.setFocusable(false);
        btnLogin.setFocusTraversalKeysEnabled(false);
        btnLogin.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnLogin.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		new LoginPage();
        		dispose();
        	}
        });
        btnLogin.setOpaque(false);
        btnLogin.setForeground(new Color(0, 51, 255));
        btnLogin.setFont(new Font("Calibri", Font.BOLD, 15));
        btnLogin.setFocusPainted(false);
        btnLogin.setContentAreaFilled(false);
        btnLogin.setBorderPainted(false);
        btnLogin.setBorder(null);
        btnLogin.setBounds(716, 469, 55, 19);
        lyrdPaneReg.add(btnLogin);
        
        btnSignUp = new JButton("");
        btnSignUp.setFocusTraversalKeysEnabled(false);
        btnSignUp.setFocusable(false);
        btnSignUp.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        		String email = txtFldEmail.getText().trim();
        		String name = txtFldFullname.getText().trim();
        		String password = pswFldPassword.getText().trim();
        		String studentId = txtFldStudentID.getText().trim();
        		String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{8,}$";
        		
        		try {
                    File file = new File("src/nubos/FileCabinet.txt");
                    if (file.exists()) {
                        BufferedReader br = new BufferedReader(new FileReader(file));
                        String line;
                        while ((line = br.readLine()) != null) {
                            if (line.equalsIgnoreCase("Email: " + email)) {
                                JOptionPane.showMessageDialog(null, "This email is already registered.");
                                JOptionPane.showMessageDialog(null, "Please enter your valid email"); 
                                return;
                            }
                        }
                        br.close();
                    }
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, "Error in reading the file: " + ex.getMessage());
                }
        		
        		if (name.isEmpty() || name.equalsIgnoreCase("Enter your fullname")) {      			
    	            JOptionPane.showMessageDialog(null, "Please enter your fullname"); 
    	            return;        	            
    	        }  else {
    	        	
    	        }
        		
        		if (!email.contains("@") || !email.contains(".com") || email.isEmpty() || email.equalsIgnoreCase(" Enter your valid email")) { 
    	            JOptionPane.showMessageDialog(null, "Please enter your valid email"); 
    	            return;        	            
    	        }   else {
    	   	        	
    	        }
        		        		
        		if (!password.matches(regex) || password.isEmpty() || password.equalsIgnoreCase(" Enter your password")) { 
    	            JOptionPane.showMessageDialog(null, "Please enter your password \n Must contain with the following: \n At least 8 Alphanumeric characters \n At least one special character \n At least one uppercase letter \n At least one lowercase letter"); 
    	            return;      	            
    	        }   else {
    	       
    	        }
        		if (!studentId.matches("^(\\d{4}[-.\\s]?\\d{6})|(\\d{6})$") || studentId.isEmpty() || studentId.equalsIgnoreCase(" Enter your Student ID or Applicant No.")) { 
    	            JOptionPane.showMessageDialog(null, "Please enter your Student ID or Application No."); 
    	            return;     
        	    }   else {
        	    	
        	    	
    	    	if (!chkBoxAgreement.isSelected()) {
    	            JOptionPane.showMessageDialog(null, "You must agree to the statements to proceed.");
    	            return;
    	        }
        	    	
        	    	 BufferedWriter bw = null;
        	            try {
        	                File file = new File("src/nubos/FileCabinet.txt");
        	                if (!file.exists()) {
        	                    file.createNewFile();
        	                }

        	                FileWriter fw = new FileWriter(file.getAbsoluteFile(), true);
        	                bw = new BufferedWriter(fw);

        	                bw.write("Name: " + name);
        	                bw.newLine();
        	                bw.write("Email: " + email);
        	                bw.newLine();
        	                bw.write("Password: " + password); // Consider hashing this
        	                bw.newLine();
        	                bw.write("Student ID: " + studentId);
        	                bw.newLine();
        	                bw.newLine();

        	                JOptionPane.showMessageDialog(null, "Registered successful!");

        	            } catch (IOException ex) {
        	                JOptionPane.showMessageDialog(null, "Error in storing information: " + ex.getMessage());
        	            } finally {
        	                if(bw != null){
        	                    try {
        	                        bw.close();
        	                    } catch(IOException ex){
        	                        ex.printStackTrace();
        	                    }
        	                }
        	            }
        	        }
        		  	txtFldFullname.setText(" Enter your fullname");
        	        txtFldEmail.setText(" Enter your valid email");
        	        txtFldPassword.setVisible(true);
        	        txtFldStudentID.setText(" Enter your Student ID or Applicant No.");
        	        chkBoxAgreement.setSelected(false);
        	    }
        });
        btnSignUp.setFocusPainted(false);
        btnSignUp.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        ImageIcon originalIcon = new ImageIcon(RegistrationPage.class.getResource("/nubos/Assets/SignUpButton1.png"));
        Image originalImage = originalIcon.getImage();
        int newWidth = 335;
        int newHeight = 45;
        Image newImage = originalImage.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);
        ImageIcon newIcon = new ImageIcon(newImage);
        btnSignUp.setIcon(newIcon);
        btnSignUp.setContentAreaFilled(false);
        btnSignUp.setBorderPainted(false);
        btnSignUp.setBorder(null);
        btnSignUp.setOpaque(false);
        btnSignUp.setBounds(459, 401, 335, 50);
        lyrdPaneReg.add(btnSignUp);
        
        getRootPane().setDefaultButton(btnSignUp);
        
        btnClose = new JButton("X");
        btnClose.setFocusable(false);
        btnClose.setFocusTraversalKeysEnabled(false);
        btnClose.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnClose.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		System.exit(0);
        	}
        });
        btnClose.setOpaque(false);
        btnClose.setForeground(new Color(255, 255, 255));
        btnClose.setFont(new Font("Calibri", Font.BOLD, 20));
        btnClose.setFocusPainted(false);
        btnClose.setContentAreaFilled(false);
        btnClose.setBorderPainted(false);
        btnClose.setBorder(null);
        btnClose.setBounds(798, 11, 32, 36);
        lyrdPaneReg.add(btnClose);
        
                
        lblRegistrationBg = new JLabel("");
        lblRegistrationBg.setFocusTraversalKeysEnabled(false);
        lblRegistrationBg.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
        lblRegistrationBg.setIcon(new ImageIcon(RegistrationPage.class.getResource("/nubos/Assets/RegistrationP.png")));
        lblRegistrationBg.setBounds(0, 0, 840, 520);
        lyrdPaneReg.add(lblRegistrationBg);
        
       
        
       
        
       
        
        
        setVisible(true);
                
 	}
}
