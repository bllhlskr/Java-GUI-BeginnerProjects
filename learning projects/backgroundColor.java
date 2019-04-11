package GUI;
import java.awt.*;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class backgroundColor extends JFrame{
	private JList list ;
	private static String [] colornames = {"black","blue","red","white"};
	private static Color[] colors = {Color.BLACK,Color.BLUE,Color.RED,Color.WHITE,};
	
	public backgroundColor() {
		super("title");
		setLayout(new FlowLayout());
		
		list = new JList(colornames);
		list.setVisibleRowCount(4);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
	    add(new JScrollPane(list));	
	    list.addListSelectionListener(
	    		new ListSelectionListener() {

					@Override
					public void valueChanged(ListSelectionEvent e) {
						getContentPane().setBackground(colors[list.getSelectedIndex()]);
					
						
					}
	    			
	    		}
	    		
	    		);
	    
	    

	
	
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		backgroundColor window = new backgroundColor();
window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
window.setSize(300,300);
window.setVisible(true);
	}
}
