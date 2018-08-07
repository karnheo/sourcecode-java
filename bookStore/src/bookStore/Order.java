package bookStore;

import java.awt.List;
import java.util.Date;

public class Order {
	private int id;
	private double totalPrice;
	private double discountPrice;
	private double netPrice;
	private Orderitem[] items = new Orderitem[2] ;
	private Date orderDate;
	private int counter;
	
	public double getDiscountPrice() {
		return discountPrice;
	}
	public void setDiscountPrice(double discountPrice) {
		this.discountPrice = discountPrice;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public double getNetPrice() {
		return netPrice;
	}
	public void setNetPrice(double netPrice) {
		this.netPrice = netPrice;
	}
	
	public void addItem(Orderitem orderItem1) {
		items[counter++] = orderItem1;
		
	}
	public void sumTotal() {
		
		for(Orderitem orderItem : items) {
			totalPrice += orderItem.book.getPrice();
		}
	}
	public static void main(String[] args) {
		
		Book book1 = new Book(1,"First Book", 8);
		Book book2 = new Book(2,"Second Book", 8);
		
		Orderitem orderItem1 = new Orderitem(book1, 1);
		Orderitem orderItem2 = new Orderitem(book2, 1);
		
		Order order = new Order();
		order.addItem(orderItem1);
		order.addItem(orderItem2);
		order.sumTotal();
		System.out.println();
		System.out.println(order.getTotalPrice());
		System.out.println(order.getDiscountPrice());
		System.out.println(order.getNetPrice());
	}
	 
}


