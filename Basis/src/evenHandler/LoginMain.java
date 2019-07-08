package evenHandler;

import javax.swing.JFrame;

public class LoginMain {

	public static void main(String[] args) {
	LoginForm login = new LoginForm();
	login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	login.setSize(300, 220);
	login.setVisible(true);
	}
}
