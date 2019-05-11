package GUI;
import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;

import javax.swing.*;


public class FontCahnger extends JFrame {
	private JTextField tf;
	private Font pf;
	private Font bf;
	private Font itf;
	private Font bif;
	private JRadioButton pb;
	private JRadioButton bb;

	private JRadioButton ib;
	private JRadioButton bib;
	private ButtonGroup group;
	
	public FontCahnger() {
		super("the title");
		setLayout(new FlowLayout());
	
		
		tf = new JTextField("Lorem ipsum dolor sit amet, consectetur adipiscing elit.",25);
	;add(tf);
		
		pb=new JRadioButton("plain",true);
		
		bb=new JRadioButton("bold",false);
		ib=new JRadioButton("italic",false);
		bib=new JRadioButton("bold and italic",false);
		add(pb);
		add(bb);
		add(ib);
		add(bib);

		group = new ButtonGroup();
		group.add(pb);
		group.add(bb);
		group.add(ib);
		group.add(bib);
		pf = new Font("Serif",Font.PLAIN,14);
		bf = new Font("Serif",Font.BOLD,14);
		itf = new Font("Serif",Font.ITALIC,14);
		bif = new Font("Serif",Font.BOLD + Font.ITALIC,14);

		tf.setFont(pf);
		
		pb.addItemListener(new HandlerClass(pf));
		bb.addItemListener(new HandlerClass(bf));

		ib.addItemListener(new HandlerClass(itf));
		bib.addItemListener(new HandlerClass(bif));

	}

	private class HandlerClass implements ItemListener{
		private Font font;
		public HandlerClass (Font f){
			font = f;
			
		}
		
		@Override
		public void itemStateChanged(ItemEvent e) {
			// TODO Auto-generated method stub
			tf.setFont(font);
		}

		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FontCahnger window = new FontCahnger();
window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
window.setSize(300,300);
window.setVisible(true);
	}

	
	
	

}
