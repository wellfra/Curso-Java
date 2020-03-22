package entities;

public class OrderItem {
	private Integer quantity;
	private double price;
	private Procut2 product;
	
	public OrderItem() {
		
	}

	public OrderItem(Integer quantity, Double price, Procut2 product) {
		this.quantity = quantity;
		this.price = price;
		this.product = product;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Procut2 getProduct() {
		return product;
	}

	public void setProduct(Procut2 product) {
		this.product = product;
	}
	public double subTotal() {
		return quantity * price;
	}
	@Override

	public String toString() {

		return product.getName() 

				+ ", $" 

				+ String.format("%.2f", price) 

				+ ", Quantity: " 

				+ quantity + 

				", Subtotal: $" 

				+ String.format("%.2f", subTotal());
	}
}
