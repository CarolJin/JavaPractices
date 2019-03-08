package evenHandler;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class LoginForm extends JFrame{
	private JTextField userNameLabel;
	private JTextField userName;
	private JTextField passwordLabel;
	private JPasswordField password;
	private JButton btnConfirm;
	private JLabel statusLabel;
	
	public LoginForm() {
	super("The JFrame Tile.");
	setLayout(new FlowLayout());
	
	userNameLabel = new JTextField("User Name:", 10);
	userNameLabel.setEditable(false);
	add(userNameLabel);
	userName = new JTextField(12);
	add(userName);
	passwordLabel = new JTextField("Pasword: ", 10);
	passwordLabel.setEditable(false);
	add(passwordLabel);
	password = new JPasswordField("mypassword", 10);
	add(password);
	btnConfirm = new JButton("Submit");
	add(btnConfirm);
	statusLabel = new JLabel("",JLabel.CENTER);    
    statusLabel.setSize(350,100);
    add(statusLabel);
	
	TheHandler handler = new TheHandler();
	userNameLabel.addActionListener(handler);
	userName.addActionListener(handler);
	passwordLabel.addActionListener(handler);
	password.addActionListener(handler);
	btnConfirm.addActionListener(handler);
	}
	
	private class TheHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			String message = "";
			
			if(e.getSource()==userName) {
				message = String.format("The user name is: %s", e.getActionCommand());
				JOptionPane.showMessageDialog(null, message);
			}
			else if(e.getSource()==password) {
				message = String.format("The password is: %s", e.getActionCommand());
				JOptionPane.showMessageDialog(null, message);
			}
			else if(e.getSource()==btnConfirm) statusLabel.setText("Logged in successfully.");		
		}
	}

}
