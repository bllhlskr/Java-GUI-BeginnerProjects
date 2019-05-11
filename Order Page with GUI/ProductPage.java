

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class ProductPage extends JFrame {

	JLabel lblId, lblName, lblPrice, lblSize, lblQuantity, lblInfo;
	JComboBox<String> cmbSize;
	DefaultComboBoxModel<String> dcmSize;
	JTextField txtQuantity;
	JCheckBox chkGiftWrapping;
	JRadioButton rdbCargo1, rdbCargo2;
	JButton btnAdd;
	
	int price = 400;
	String name = "jacket";
	String id = "123465789";

	public ProductPage() {
		super("Order Window");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(200, 500);
		setLocation(200, 200);
		setLayout(new GridLayout(9,1));

		lblId = new JLabel("Id: " + id);
		lblName = new JLabel("Name: " + name);
		lblPrice = new JLabel("Price: " + price);
		lblSize = new JLabel("Size:");
		lblQuantity = new JLabel("Quantity: ");
		txtQuantity = new JTextField("0",10);
		lblInfo = new JLabel("");
		dcmSize = new DefaultComboBoxModel<String>(); yapmış?
		cmbSize = new JComboBox<String>(dcmSize);
		chkGiftWrapping = new JCheckBox("Gift (+$2)");
		rdbCargo1 = new JRadioButton("A Cargo ($3)",true);
		rdbCargo2 = new JRadioButton("B Cargo ($4)");
		ButtonGroup bgCargo = new ButtonGroup();
		bgCargo.add(rdbCargo1);
		bgCargo.add(rdbCargo2);
		btnAdd = new JButton("Add");
		
		
		JPanel panelSize = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panelSize.add(lblSize);
		panelSize.add(cmbSize);
		
		JPanel panelQuantity = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panelQuantity.add(lblQuantity);
		panelQuantity.add(txtQuantity);
		
		JPanel panelCargo = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panelCargo.add(rdbCargo1);
		panelCargo.add(rdbCargo2);
		
		dcmSize.addElement("XS");
		dcmSize.addElement("S");
		dcmSize.addElement("M");
		dcmSize.addElement("L");
		dcmSize.addElement("XL");
		
		
		add(lblId);
		add(lblName);
		add(lblPrice);
//		add(lblSize);
//		add(cmbSize);
		add(panelSize);
		add(panelQuantity);
		add(chkGiftWrapping);
		add(panelCargo);
		add(lblInfo);
		add(btnAdd);
		
		Basket basket = new Basket();
		
		
		btnAdd.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(Integer.parseInt(txtQuantity.getText()) > 0) {
				//build an order obj
				Order o = new Order(id, name, 
						(String)cmbSize.getSelectedItem(), 
						(rdbCargo1.isSelected() ? "A" : "B"), 
						Integer.parseInt(txtQuantity.getText()), 
						price, 
						chkGiftWrapping.isSelected()
						);
				
				//pass order obj to the basket
				basket.setVisible(true);
				basket.dlmOrders.addElement(o);
				basket.basketTotal.setText("Total: " + basket.calculteTotal());
				}
				else
					JOptionPane.showMessageDialog(panelQuantity, "Number of orders must be selected");
				
			}
		});
		
		cmbSize.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				lblInfo.setText(cmbSize.getSelectedItem() + " size is selected");
				
			}
		});
		
		
		chkGiftWrapping.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(chkGiftWrapping.isSelected())
					lblInfo.setText("Gift is selected");
				else
					lblInfo.setText("Gift is de-selected");
				
			}
		});
		
		rdbCargo1.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(rdbCargo1.isSelected())
					lblInfo.setText("A cargo is selected" );
				else
					lblInfo.setText("B cargo is selected" );
				
			}
		});

		

	}

	public static void main(String[] args) {
		new ProductPage().setVisible(true);
		
	}
}
