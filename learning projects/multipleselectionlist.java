package GUI;
import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;
public class multipleselectionlist extends JFrame{
	private JList leftList;
	private JList rightList;
	private JButton movebutton;
	private static String [] food = {"Halis","Bilal","Kara","Software","Developer"};
	
	public multipleselectionlist() {
		super("the title");
		setLayout(new FlowLayout());
		leftList = new JList(food);
		leftList.setVisibleRowCount(3);
		leftList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		add(new JScrollPane(leftList));
		
		movebutton = new JButton("move-->");
		
		movebutton.addActionListener(
				new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						rightList.setListData(leftList.getSelectedValues());
					}
					
				}
				
				);
		add(movebutton);
		rightList = new JList();
		rightList.setVisibleRowCount(3);
		rightList.setFixedCellHeight(100);
		rightList.setFixedCellWidth(150);
		rightList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		add(new JScrollPane(rightList));
		
		
		
		
	
	
	
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		multipleselectionlist window = new multipleselectionlist();
window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
window.setSize(300,300);
window.setVisible(true);
	}


}
