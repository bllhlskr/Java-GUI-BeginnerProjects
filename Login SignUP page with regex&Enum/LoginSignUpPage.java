package labs;
import javax.swing.*;



import java.awt.*;
import java.awt.event.*;
public class LoginSignUpPage extends JFrame{
	private JTextField txtUser, txtDate, txtName, txtSurname, txtPhone, txtPost;
	private JPasswordField passwordField;
	private JTextField txtEmail;
	private JComboBox<Gender> comboGender;
	DefaultComboBoxModel<String> dcmGender;
	private JComboBox<Role> comboRole;
	private JRadioButton rb2;
	private JRadioButton rbLogin;
	private JLabel lblInfo;
	private JButton buttonClear;
	private JButton buttonEnter;

	enum Role {
		STUDENT,TEACHER,ADMIN,GUEST;

	}

	enum Gender {
		MALE,FEMALE;

	}
	public LoginSignUpPage() {
		setTitle("Login/sign up page");
		setLayout(new GridLayout(12, 2, 0, 0));
		setSize(400, 383);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		ButtonGroup bg = new ButtonGroup();
		JPanel pnlRadio = new JPanel(new FlowLayout(FlowLayout.LEFT));
		rbLogin = new JRadioButton("Login", true);
		rb2 = new JRadioButton("Sign up");
		lblInfo = new JLabel();
		add(lblInfo);
		bg.add(rbLogin);
		bg.add(rb2);
		pnlRadio.add(rbLogin);
		pnlRadio.add(rb2);
		add(pnlRadio);

		JLabel lblName = new JLabel("User Name");
		add(lblName);

		txtUser = new JTextField();
		add(txtUser);

		JLabel lblPassword = new JLabel("Password");
		add(lblPassword);

		passwordField = new JPasswordField();
		add(passwordField);

		JLabel lblRole = new JLabel("Role");
		add(lblRole);

		comboRole = new JComboBox(Role.values());
		add(comboRole);

		add(new JLabel("Name"));
		txtName = new JTextField();
		add(txtName);

		add(new JLabel("Surname"));
		txtSurname = new JTextField();
		add(txtSurname);

		add(new JLabel("Gender"));
		dcmGender = new DefaultComboBoxModel<>();
		comboGender = new JComboBox<>(Gender.values());

		add(comboGender);

		add(new JLabel("Birth date(DD.MM.YYYY)"));
		txtDate = new JTextField();
		add(txtDate);

		add(new JLabel("Phone Number"));
		txtPhone = new JTextField();
		add(txtPhone);

		add(new JLabel("Post Code"));
		txtPost = new JTextField();
		add(txtPost);

		JLabel lblEmail = new JLabel("Email");
		add(lblEmail);

		txtEmail = new JTextField();
		add(txtEmail);
		txtEmail.setColumns(10);

		buttonClear = new JButton("Clear");
		buttonEnter = new JButton("Login");

		JPanel pnlButton = new JPanel(new FlowLayout(FlowLayout.RIGHT));

		pnlButton.add(buttonClear);
		pnlButton.add(buttonEnter);
		add(new JLabel(""));
		add(pnlButton);
		txtDate.setEditable(false);
		txtName.setEditable(false);
		txtSurname.setEditable(false);
		txtPhone.setEditable(false);
		txtPost.setEditable(false);
		txtEmail.setEditable(false);
		comboRole.setEnabled(false);
		comboGender.setEnabled(false);
		lblInfo.setText("halislkara");
		passwordField.addKeyListener(new Inter() {

			@Override
			public void keyReleased(KeyEvent e) {
				passwordField.setText(passwordField.getText().replaceAll("\\s", ""));
			}

		});

		//txtUser, txtDate, txtName, txtSurname, txtPhone, txtPost;

		rb2.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				txtDate.setEditable(true);
				txtName.setEditable(true);
				txtSurname.setEditable(true);
				txtPhone.setEditable(true);
				txtPost.setEditable(true);
				txtEmail.setEditable(true);
				comboRole.setEnabled(true);
				comboGender.setEnabled(true);
				buttonEnter.setText("SignUp");

			}

		});
		rbLogin.addItemListener(new ItemListener(){

			@Override
			public void itemStateChanged(ItemEvent e) {
				txtDate.setEditable(false);
				txtName.setEditable(false);
				txtSurname.setEditable(false);
				txtPhone.setEditable(false);
				txtPost.setEditable(false);
				txtEmail.setEditable(false);
				comboRole.setEnabled(false);
				comboGender.setEnabled(false);
				txtDate.setText("");
				txtDate.setText("");
				txtName.setText("");
				txtSurname.setText("");
				txtPhone.setText("");
				txtPhone.setText("");
				txtPost.setText("");
				txtEmail.setText("");
				passwordField.setText("");
				txtUser.setText("");

				buttonEnter.setText("Login");
			}

		});
		passwordField.addKeyListener(new Inter() {

			@Override
			public void keyReleased(KeyEvent e) {
			passwordField.setText(passwordField.getText().replaceAll("\\s", ""));
			}

		});
		txtUser.addKeyListener(new Inter(){

			@Override
			public void keyTyped(KeyEvent e) {
				if(txtUser.getText().matches("[A-Za-z]{1}[._]*[A-Za-z0-9]{4,}")) {
					lblInfo.setText("");
				}else {
					lblInfo.setText("incorrect UserName");
				}
			}




		});
		passwordField.addKeyListener(new Inter() {

			@Override
			public void keyTyped(KeyEvent e) {
				if(passwordField.getText().matches(".{6,}")) {
					lblInfo.setText("");
				}
				else {
					lblInfo.setText("incorrect password password mus be at least 6 character");
				}
			}

		});
		txtName.addKeyListener(new Inter() {

			@Override
			public void keyTyped(KeyEvent e) {
				if(txtName.getText().matches("[a-zA-Z]{2,}[ ]?[a-zA-Z]*"))  {
					lblInfo.setText("");
				}else {
					lblInfo.setText("incorrect name");
				}
			}

		});
		txtSurname.addKeyListener(new Inter() {

			@Override
			public void keyTyped(KeyEvent e) {
				if(txtName.getText().matches("[a-zA-Z]{2,}[ ]?[a-zA-Z]*"))  {
					lblInfo.setText("");
				}else {
					lblInfo.setText("incorrect Surname");
				}

			}


		});
		txtDate.addKeyListener(new Inter(){

			@Override
			public void keyTyped(KeyEvent e) {
				if(txtDate.getText().matches("[0-9]{2}.[0-9]{2}.[0-9]{4}")) {
					lblInfo.setText("");
				}else {
					lblInfo.setText("incorrect date type");
				}
			}

		});
		txtPhone.addKeyListener(new Inter() {

			@Override
			public void keyTyped(KeyEvent e) {
				if(txtPhone.getText().matches("[+]{1}[0-9]{2}[0-9]{10}|[0]{2}[0-9]{2}[0-9]{10}|[0-9]{10}")) {
					lblInfo.setText("");

				}else {
					lblInfo.setText("incorrect phone number");
				}
			}

		});
		txtPost.addKeyListener(new Inter() {

			@Override
			public void keyTyped(KeyEvent e) {
				if(txtPost.getText().matches("[0-9]{5}")) {
					lblInfo.setText("");

				}else {
					lblInfo.setText("incorrect postcode");
				}
			}

		});
		txtEmail.addKeyListener(new Inter() {
				String extensions= "(com|edu|k12|org|net|edu|gov|mil|biz|info|mobi)";
				String serviceName="(gmail|outlook|hotmail|skype)";
			@Override
			public void keyTyped(KeyEvent e) {
				if(txtEmail.getText().matches("([a-zA-Z]{2,}[a-zA-Z0-9]{4,}@)("+ serviceName +")([.]{1})("+extensions+")([.]{1}[a-zA-Z]{1})")) {
					lblInfo.setText("");
				}else {
					lblInfo.setText("incorrect email type");
				}

			}

		});
		buttonClear.addActionListener(new Inter() {

			@Override
			public void actionPerformed(ActionEvent e) {
				txtDate.setText("");
				txtDate.setText("");
				txtName.setText("");
				txtSurname.setText("");
				txtPhone.setText("");
				txtPhone.setText("");
				txtPost.setText("");
				txtEmail.setText("");
				passwordField.setText("");
				txtUser.setText("");
			}

		});
		}
		buttonEnter.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(rb2.isSelected()) {
					try {
						File file = new File ("signUp.txt");
						FileWriter fw = new FileWriter(file);
						fw.write(txtUser.getText()+"\t"+passwordField.getText()+ "\t"+comboRole.getSelectedItem()+ "\t"+ "\t"+txtName.getText()+ "\t"+txtSurname.getText()+ "\t"
						+comboGender.getSelectedItem()+ "\t"+txtDate.getText()+ "\t"+txtPhone.getText()+ "\t"+txtPost.getText()+ "\t"+txtEmail.getText());
						fw.flush();
						fw.close();
					}catch(IOException a) {
						a.printStackTrace();

					}
				}
			}

		});
		passwordField.addKeyListener(new Inter() {

			@Override
			public void keyReleased(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER && rbLogin.isSelected()) {
					buttonEnter.doClick();
				}
			}

		});
		txtEmail.addKeyListener(new Inter() {

			@Override
			public void keyReleased(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER && rb2.isSelected()) {
					buttonEnter.doClick();
				}
			}

		});



	public static void main(String[] args) {
		new LoginSignUpPage().setVisible(true);

		Inter handle = new Inter();


	}
}
