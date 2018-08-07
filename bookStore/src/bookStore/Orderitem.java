package bookStore;

public class Orderitem {
	
	private int id;
	 Book book;
	private int quantity;
	public Orderitem(Book book, int quantity) {
		
		this.book = book;
		this.quantity = quantity;
	}
	
}
