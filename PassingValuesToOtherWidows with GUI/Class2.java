package PassingValuesToOtherWidows;

import java.awt.FlowLayout;
import java.awt.Window;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class Class2 extends JFrame{
	JTextField text;
	public Class2(Class1 parent) {
		setBounds(50, 300, 300, 200);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("W3");
		
		text = new JTextField(10);
		
		add(text);
		
		text.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				parent.text1.setText(text.getText()	);
				
			}
		});
	}

}
