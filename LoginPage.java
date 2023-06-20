package nubos;

import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JCheckBox;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;


public class LoginPage extends JFrame {

	private JPanel contentPane;
	private JTextField txtUserNameEmail, txtSignUp;
	private JCheckBox chkBxRememberMe;
	private JButton btnForgotPwd, btnLogin, btnCreateNewAcct, btnClose, btnEye;
	private JLabel lblGiconBg, lblLoginBg;
	private JLayeredPane layeredPane;
	private JPasswordField pswEnterPassword;
	private JTextField txtPassword;


	public LoginPage() {
		//Sets the properties of the JFrame windows.
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
	    setSize(840, 520);
	    setLocationRelativeTo(null);
	    setUndecorated(true);
	    
	   		
	    //Instantiate JLayeredPane and sets the size to match the frame size.
		layeredPane = new JLayeredPane(); 
        layeredPane.setBounds(0, 0, 840, 520);
        getContentPane().add(layeredPane);
        
        initialize();
        
	}
        public void initialize() {
	            
        txtUserNameEmail = new JTextField();
        txtUserNameEmail.addFocusListener(new FocusListener() {
        	@Override
        	public void focusGained(FocusEvent e) {
        		 if (txtUserNameEmail.getText().equals(" Enter your username or email")) { 
        			 txtUserNameEmail.setText(""); 
                 }
             }
             @Override 
             public void focusLost(FocusEvent e) { 
                 if (txtUserNameEmail.getText().isEmpty()) { 
                	 txtUserNameEmail.setText(" Enter your username or email"); 
                 }
             }
         });
        txtUserNameEmail.setForeground(new Color(153, 153, 153));
        txtUserNameEmail.setHorizontalAlignment(SwingConstants.LEFT);
        txtUserNameEmail.setFont(new Font("Calibri", Font.BOLD, 15));
        txtUserNameEmail.setText(" Enter your username or email");
        txtUserNameEmail.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        txtUserNameEmail.setBounds(476, 153, 311, 36);
        layeredPane.add(txtUserNameEmail);
        txtUserNameEmail.setColumns(10);
        
        File loggedInUserFile = new File("src/nubos/LoggedInUser.txt");
        if (loggedInUserFile.exists()) {
            try (BufferedReader in = new BufferedReader(new FileReader(loggedInUserFile))) {
                String email = in.readLine();
                if (email != null) {
                    txtUserNameEmail.setText(email);
                    // You may want to automatically log in the user here, instead of just filling in the email
                }
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Error in reading session: " + ex.getMessage());
            }
        }
        
        txtPassword = new JTextField(" Enter your password");
        txtPassword.setHorizontalAlignment(SwingConstants.LEFT);
        txtPassword.setForeground(new Color(153, 153, 153));
        txtPassword.setFont(new Font("Calibri", Font.BOLD, 15));
        txtPassword.setColumns(10);
        txtPassword.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        txtPassword.setBounds(476, 200, 272, 36);
        txtPassword.addFocusListener(new FocusAdapter() {
        	@Override
        	public void focusGained(FocusEvent e) {
        		if (txtPassword.getText().equals(" Enter your password")) {
        			txtPassword.setVisible(false);
        			pswEnterPassword.setVisible(true);
        			pswEnterPassword.requestFocusInWindow();
                }
            }

			@Override
			public void focusLost(FocusEvent e) {
				// TODO Auto-generated method stub
				
			}
        });
        layeredPane.add(txtPassword);
        
        
        pswEnterPassword = new JPasswordField(" Enter your password");
        pswEnterPassword.setToolTipText("Password should have at least 8 alphanumeric characters, 1 upper case and 1 lower case letter\r\n\r\n");
        pswEnterPassword.setForeground(new Color(153, 153, 153));
        pswEnterPassword.setHorizontalAlignment(SwingConstants.LEFT);
        pswEnterPassword.setFont(new Font("Calibri", Font.BOLD, 15));
        pswEnterPassword.setColumns(10);
        pswEnterPassword.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        pswEnterPassword.setBounds(476, 200, 272, 36);
        pswEnterPassword.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (new String(pswEnterPassword.getPassword()).equals(" Enter your password")) {
                	pswEnterPassword.setText("");
               
                }
            }
            @Override 
            public void focusLost(FocusEvent e) { 
                if (pswEnterPassword.getPassword().length == 0) {
                	pswEnterPassword.setVisible(false);
                	txtPassword.setVisible(true);
                     // reset to default echo character (which shows the actual text)
                }
            }
        });
        layeredPane.add(pswEnterPassword);
        
        txtSignUp = new JTextField();
        txtSignUp.setEditable(false);
        txtSignUp.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
        txtSignUp.setFont(new Font("Calibri", Font.BOLD, 15));
        txtSignUp.setOpaque(false);
        txtSignUp.setText("Or Sign Up using");
        txtSignUp.setHorizontalAlignment(SwingConstants.CENTER);
        txtSignUp.setBorder(null);
        txtSignUp.setBounds(577, 356, 108, 20);
        layeredPane.add(txtSignUp);
        txtSignUp.setColumns(10);
        
        chkBxRememberMe = new JCheckBox("Remember me");
        chkBxRememberMe.setVerticalTextPosition(SwingConstants.TOP);
        chkBxRememberMe.setOpaque(false);
        chkBxRememberMe.setIconTextGap(5);
        chkBxRememberMe.setForeground(new Color(0, 51, 255));
        chkBxRememberMe.setFont(new Font("Calibri", Font.BOLD, 15));
        chkBxRememberMe.setFocusPainted(false);
        chkBxRememberMe.setContentAreaFilled(false);
        chkBxRememberMe.setBorder(null);
        chkBxRememberMe.setBounds(486, 247, 117, 23);
        layeredPane.add(chkBxRememberMe);
        
        btnEye = new JButton("");
        btnEye.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnEye.setSelectedIcon(new ImageIcon(LoginPage.class.getResource("/nubos/Assets/eyeOpenSmall.png")));
        btnEye.setRequestFocusEnabled(false);
        btnEye.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mousePressed(MouseEvent e) {
        		pswEnterPassword.setEchoChar((char)0);
        	}
        	
        	 @Override
        	    public void mouseReleased(MouseEvent e) {
        		 pswEnterPassword.setEchoChar('*');
        	    }
        });
        btnEye.setIcon(new ImageIcon(LoginPage.class.getResource("/nubos/Assets/eyeOpenSmall.png")));
        btnEye.setFocusPainted(false);
        btnEye.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), null, null, null));
        btnEye.setBounds(749, 200, 38, 36);
        layeredPane.add(btnEye);
        
        btnForgotPwd = new JButton("Forgot password ?");
        btnForgotPwd.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnForgotPwd.setOpaque(false);
        btnForgotPwd.setForeground(new Color(0, 51, 255));
        btnForgotPwd.setFont(new Font("Calibri", Font.BOLD, 15));
        btnForgotPwd.setFocusPainted(false);
        btnForgotPwd.setContentAreaFilled(false);
        btnForgotPwd.setBorderPainted(false);
        btnForgotPwd.setBorder(null);
        btnForgotPwd.setBounds(663, 247, 117, 23);
        layeredPane.add(btnForgotPwd);
        
        btnLogin = new JButton("");
        btnLogin.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        		String email = txtUserNameEmail.getText().trim();
        		String password = pswEnterPassword.getText().trim();
        		
        		try (BufferedReader br = new BufferedReader(new FileReader("src/nubos/FileCabinet.txt"))) {
        	            String line;
        	            boolean found = false;
        	            while ((line = br.readLine()) != null) {
        	            
        	                String[] parts = line.split(": ");

        	                // Check if the current line's field is email or password and matches with entered data
        	                if (parts.length >= 2) {
        	                    if (parts[0].equalsIgnoreCase("Email") && parts[1].equals(email)) {
        	                        // Matched email, check password
        	                        String passwordLine = br.readLine();
        	                        String[] passwordParts = passwordLine.split(": ");
        	                        if (passwordParts.length >= 2 && passwordParts[0].equalsIgnoreCase("Password") && passwordParts[1].equals(password)) {
        	                            // Matched password
        	                            found = true;
        	                            break;
        	                        }
        	                    }
        	                }
        	            }

        	            if (found) {
        	                JOptionPane.showMessageDialog(null, "Login successful!");
        	                if (chkBxRememberMe.isSelected()) {
        	                    try (PrintWriter out = new PrintWriter(new FileWriter("src/nubos/LoggedInUser.txt"))) {
        	                        out.print(email);
        	                    } catch (IOException ex) {
        	                        JOptionPane.showMessageDialog(null, "Error in storing session: " + ex.getMessage());
        	                    }
        	                }
        	                SchedulePage schedulePage = new SchedulePage();
        	                schedulePage.setVisible(true);
        	                dispose();
        	            } else {
        	                JOptionPane.showMessageDialog(null, "Invalid email or password!");
        	            }
        	        } catch (IOException ex) {
        	            JOptionPane.showMessageDialog(null, "Error in reading information: " + ex.getMessage());
        	        }
        	    }
        });
        btnLogin.setFocusPainted(false);
        btnLogin.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnLogin.setIcon(new ImageIcon(LoginPage.class.getResource("/nubos/Assets/LoginButton1.png")));
        btnLogin.setSize(new Dimension(11, 8));
        btnLogin.setOpaque(false);
        btnLogin.setHorizontalTextPosition(SwingConstants.CENTER);
        btnLogin.setContentAreaFilled(false);
        btnLogin.setBorderPainted(false);
        btnLogin.setBorder(null);
        btnLogin.setBounds(476, 294, 311, 51);
        layeredPane.add(btnLogin);
        
        btnCreateNewAcct = new JButton("Create new account?");
        btnCreateNewAcct.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		 new RegistrationPage();
        		 dispose();
        	}
        });
        btnCreateNewAcct.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnCreateNewAcct.setContentAreaFilled(false);
        btnCreateNewAcct.setFocusPainted(false);
        btnCreateNewAcct.setOpaque(false);
        btnCreateNewAcct.setForeground(new Color(0, 51, 255));
        btnCreateNewAcct.setFont(new Font("Calibri", Font.BOLD, 15));
        btnCreateNewAcct.setBorderPainted(false);
        btnCreateNewAcct.setBorder(null);
        btnCreateNewAcct.setBounds(570, 451, 140, 23);
        layeredPane.add(btnCreateNewAcct);
        
        btnClose = new JButton("X");
        btnClose.setToolTipText("CLOSE");
        btnClose.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		 File file = new File("src/nubos/LoggedInUser.txt");
        	        if (file.exists()) {
        	            file.delete();
        	        }
        		System.exit(0);
        	}
        });
        btnClose.setOpaque(false);
        btnClose.setForeground(new Color(102, 102, 102));
        btnClose.setFont(new Font("Calibri", Font.BOLD, 20));
        btnClose.setFocusPainted(false);
        btnClose.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnClose.setContentAreaFilled(false);
        btnClose.setBorderPainted(false);
        btnClose.setBorder(null);
        btnClose.setBounds(798, 11, 32, 36);
        layeredPane.add(btnClose);
        
        lblGiconBg = new JLabel("");
        lblGiconBg.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        lblGiconBg.setHorizontalTextPosition(SwingConstants.CENTER);
        lblGiconBg.setHorizontalAlignment(SwingConstants.CENTER);
        lblGiconBg.setIcon(new ImageIcon(LoginPage.class.getResource("/nubos/Assets/GIcon1.png")));
        lblGiconBg.setBounds(599, 387, 75, 57);
        layeredPane.add(lblGiconBg);
        
        lblLoginBg = new JLabel("");
        lblLoginBg.setIcon(new ImageIcon(LoginPage.class.getResource("/nubos/Assets/LoginPage.png")));
        lblLoginBg.setBounds(0, 0, 840, 520);
        layeredPane.add(lblLoginBg);
        
        
        setVisible(true);
        
	}
        
}