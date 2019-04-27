package labs;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class LoginSigUpPage extends JFrame {
	JRadioButton rLogin,rSignup;
	JLabel Lusername,lPassword,lEmail,lRols,hiddenPassword,l1;
	JTextField f1,f2;
	JPasswordField pass;
	JComboBox box;
	JPanel panel,panel2;
	JButton bclear,bLogin;
	ButtonGroup group;
	
	public LoginSigUpPage() {
		setLayout(new GridLayout(6,2));
		l1= new JLabel();
		rLogin = new JRadioButton("Login");
		rLogin.setSelected(true);
		rSignup  = new JRadioButton("Signup");
		Lusername = new JLabel("user name");
		lPassword = new JLabel("Password");
		lEmail = new JLabel("Email");
		
		lRols= new JLabel("Role");
		f1 = new JTextField(" ",10);
		f2 = new JTextField(" ",10 );
		f2.setEditable(false);
		pass= new JPasswordField();
		box = new JComboBox(roles.values());
		panel= new JPanel(new FlowLayout());
		panel2= new JPanel(new FlowLayout());
		bclear= new JButton ("clear");
		bLogin = new JButton("login");
		hiddenPassword= new JLabel();
		group = new ButtonGroup();
		group.add(rLogin);
		group.add(rSignup);
		panel.add(rLogin);
		panel.add(rSignup);
		panel2.add(bclear);
		panel2.add(bLogin);
		add(hiddenPassword);
		add(panel);
		add(Lusername);
		add(f1);
		add(lPassword);
		add(pass);
		add(lEmail);
		add(f2);
		add(lRols);
		add(box);
		add(l1);
		add(panel2);
		
		pass.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyReleased(KeyEvent e) {
				hiddenPassword.setText(String.format("%s", pass.getText()));
				
			}
			
		});
		pass.addFocusListener(new FocusListener() {

			@Override
			public void focusGained(FocusEvent e) {
				// TODO Auto-generated method stub
				hiddenPassword.show();
			}

			@Override
			public void focusLost(FocusEvent e) {
				// TODO Auto-generated method stub
				hiddenPassword.hide();
			}
			
		});
		rSignup.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				bLogin.setText("Sign Up");
				f2.setEditable(true);
				
			}
			
		});
		rLogin.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				bLogin.setText("Login");
				f2.setEditable(false);
			}
			
		});
		f1.addKeyListener(new KeyListener() {

			

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				f1.setText(f1.getText().replace(" ", ""));
				 f1.setText(f1.getText().replace(",", ""));
				 f1.setText(f1.getText().replace("_", ""));
				 f1.setText(f1.getText().trim());
				}
			

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				 
			}
		});
		
		bclear.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				f1.setText("");
				f2.setText("");
				pass.setText("");
				hiddenPassword.setText("");
				rLogin.setSelected(true);
			}
			
		});
		bLogin.addActionListener(new ActionListener() {
            JOptionPane a = new JOptionPane();
			@Override
			public void actionPerformed(ActionEvent e) {
				if(rLogin.isSelected()==true) {
					String ab= f1.getText()+","+pass.getText()+","+box.getSelectedItem();
					a.showMessageDialog(null, ab);
					
					
				}else if(rSignup.isSelected()==true) {
					String b= f1.getText()+","+pass.getText()+","+box.getSelectedItem()+","+f2.getText();
					a.showMessageDialog(null, b);
					
				}
					
				
			}
			
		});
		
		


		
	}
	
	public static void main(String[] args) {
		LoginSigUpPage a = new LoginSigUpPage();
		a.setVisible(true);
		a.setSize(400,400);
		a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}
