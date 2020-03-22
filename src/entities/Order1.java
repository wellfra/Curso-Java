package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import entities.OrderItem;

import entities.enums.OrderStatus;

public class Order1 {
	
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	private Date moment;
	private OrderStatus status;
	private Client client;
	private List<OrderItem> item = new ArrayList<>(); 
	
	public Order1() {
		
	}

	public Order1(Date moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public void addItem(OrderItem itens) {
		item.add(itens);
	}

	public void removeItem(OrderItem itens) {
		item.remove(itens);
	}
	
	public double total() {
		double sum = 0.00;
		for (OrderItem x : item) {
			sum += x.subTotal();
		}
		return sum;
	}
	@Override

	public String toString() {

		StringBuilder sb = new StringBuilder();

		sb.append("Order moment: ");

		sb.append(sdf.format(moment) + "\n");

		sb.append("Order status: ");

		sb.append(status + "\n");

		sb.append("Client: ");

		sb.append(client + "\n");

		sb.append("Order items:\n");

		for (OrderItem item : item) {

			sb.append(item + "\n");

		}

		sb.append("Total price: $");

		sb.append(String.format("%.2f", total()));

		return sb.toString();

	}
		
}
