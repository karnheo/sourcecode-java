package bookStore;

public class Book {
	//Properties
	private int id;
	private String name;
	private double price;
	public double getPrice() {
		return price;
	}
	//Constructor
	public Book(int id, String name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
}
