package beanSort;

public class Vagitable implements Comparable<Vagitable>{

	int id;
	String name;
	int quantity;
	int price;
	
	public Vagitable(int id, String name, int quantity, int price) {
		
		this.id = id;
		this.name = name;
		this.quantity = quantity;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public int compareTo(Vagitable vagitable) {
		
		return vagitable.price-this.price;
	}
	
	@Override
	public String toString() {
		return String.format("%d %s %d %d", id,name,quantity,price);
		
	}
}
