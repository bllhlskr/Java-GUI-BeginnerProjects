package fileIO;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class PhoneBookGUI extends JFrame{
	private JPanel backGround;
	private JTextField txtName;
	private JTextField txtPhoneNumber;
	private JButton btnAdd;
	JFrame phoneBookList;
	JList<Contact> lstContacts;
	DefaultListModel<Contact> dlm;
	File file = new File("PhoneBook.txt");

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PhoneBookGUI frame = new PhoneBookGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public PhoneBookGUI() {//GUI implementatiton
		setTitle("Phone Book");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 280, 131);
		backGround = new JPanel();
		backGround.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(backGround);
		backGround.setLayout(null);

		JLabel lblName = new JLabel("Name:");
		lblName.setBounds(10, 14, 75, 14);
		backGround.add(lblName);

		JLabel lblPhoneNumber = new JLabel("Phone Number");
		lblPhoneNumber.setBounds(10, 39, 102, 14);
		backGround.add(lblPhoneNumber);

		txtName = new JTextField();
		txtName.setBounds(122, 11, 132, 20);
		backGround.add(txtName);
		txtName.setColumns(10);

		txtPhoneNumber = new JTextField();
		txtPhoneNumber.setBounds(122, 36, 132, 20);
		backGround.add(txtPhoneNumber);
		txtPhoneNumber.setColumns(10);

		phoneBookList = new JFrame("Contact List");
		dlm = new DefaultListModel<Contact>();
		lstContacts = new JList<Contact>(dlm);
		phoneBookList.getContentPane().add(lstContacts);
		phoneBookList.setSize(200, 300);
		phoneBookList.setVisible(true);
		txtPhoneNumber.addKeyListener(new KeyListener() {// this is understands enter and does the btnAdd click 

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
				// TODO Auto-generated method stub
				
					  if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					     btnAdd.doClick();
					   }
					
			}
			
		});
		txtName.addKeyListener(new KeyListener() {

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
				// TODO Auto-generated method stub

				  if(e.getKeyCode() == KeyEvent.VK_ENTER) {
				     btnAdd.doClick();
				   }
			}
			
		});
	  

		try {
			FileInputStream fis = new FileInputStream(file);//this code add phonebook list to the Jlist from file
			ObjectInputStream ois = new ObjectInputStream(fis);
			DefaultListModel<Contact> dlmTemp = (DefaultListModel<Contact>) ois.readObject();
			for (int i = 0; i < dlmTemp.size(); i++) {
				dlm.addElement(dlmTemp.get(i));
			}
		} catch (IOException e1) {
			e1.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				Contact contact = new Contact(txtName.getText(), txtPhoneNumber.getText());
				phoneBookList.setVisible(true);
				dlm.addElement(contact);
				try {
					FileOutputStream fos = new FileOutputStream(file);
					ObjectOutputStream oos = new ObjectOutputStream(fos);
					oos.writeObject(dlm);
					System.out.println("saved " + dlm.size() + " contacts");
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		btnAdd.setBounds(165, 67, 89, 23);
		backGround.add(btnAdd);
		}
	
		public JButton getBtnAdd() {
			return btnAdd;
		}
}
