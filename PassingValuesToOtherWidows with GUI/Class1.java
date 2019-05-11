package PassingValuesToOtherWidows;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class Class1  {

	JTextField text1, text2;
	
	public Class1() {
		JFrame window1 = new JFrame("W1");
		JFrame window2 = new JFrame("W2");
		
		text1 = new JTextField(10);
		text2 = new JTextField(10);
		
		window1.add(text1);
		window2.add(text2);
		
		Class2 window3 = new Class2(this);
		window3.setVisible(true);
		
		text1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				text1.setText("");
				text2.setText("");
				
			}
		});
		
		text1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				text2.setText(text1.getText());
				window3.text.setText(text1.getText());
			}
		});
		
		text2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				text1.setText(text2.getText());

			}
		});
		
		
		window1.setBounds(50, 50, 300, 200);
		window2.setBounds(400, 50, 300, 200);
		
		window1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		window1.setLayout(new FlowLayout());
		window2.setLayout(new FlowLayout());
		
		window1.setVisible(true);
		window2.setVisible(true);
	}
	
	public static void main(String[] args) {
		new Class1();

	}

}
