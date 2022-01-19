import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JFrame{
	public Login() {
		JPanel panel = new JPanel();
		JLabel label = new JLabel("ID   ");
		JLabel pswd = new JLabel("Password   ");
		JTextField txtID = new JTextField(10);
		JPasswordField txtPass = new JPasswordField(10);
		JButton btn1 = new JButton("Log In");
		
		
		panel.add(label);
		panel.add(txtID);
		panel.add(pswd);
		panel.add(txtPass);
		panel.add(btn1);
		
		
		btn1.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				String ID="Han";
				String pass="123";
				
				if(ID.equals(txtID.getText()) && pass.equals(txtPass.getText())){
					JOptionPane.showMessageDialog(null, "correct!!!");
				}
				else {
					JOptionPane.showMessageDialog(null, "wrong!!!");
				}
			}
		});
		
		add(panel);
		
		setVisible(true);
		setSize(600,400);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	
	public static void main(String args[]) {
		new Login();
	}
}
