
public class Order {
	String id, name, size, cargo;
	int quantity;
	double price;
	boolean gift;
	
	public Order(String id, String name, String size, String cargo, int quantity, double price, boolean gift) {
		this.id = id;
		this.name = name;
		this.size = size;
		this.cargo = cargo;
		this.quantity = quantity;
		this.price = price;
		this.gift = gift;
	}

	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", size=" + size + ", cargo=" + cargo + ", quantity=" + quantity
				+ ", price=" + price + ", gift=" + gift + ", total: " + total();
	}
	
	public double total(){
		return quantity * price + 
				(gift? 2 : 0) +
				(cargo.equals("A") ? 3 : 4);
	}
	
	
}
