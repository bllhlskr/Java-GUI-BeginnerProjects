

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;

public class Basket extends JFrame {

	JList<Order> listOrders;
	DefaultListModel<Order> dlmOrders;
	
	JLabel basketTotal;

	public Basket() {
		super("Basket");
		setSize(600, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new BorderLayout());

		dlmOrders = new DefaultListModel<Order>();
		listOrders = new JList<Order>(dlmOrders);
		basketTotal = new JLabel();
		
		JPanel panelTotal = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		panelTotal.add(basketTotal);
		

		add(listOrders, BorderLayout.CENTER);
		add(panelTotal, BorderLayout.SOUTH);

	}

	public double calculteTotal() {
		double total = 0;
		for (int i = 0; i < dlmOrders.size(); i++) {
			total+= dlmOrders.get(i).total();
		}
		return total;
	}

	
	
}
