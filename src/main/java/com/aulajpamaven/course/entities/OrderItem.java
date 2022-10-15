package com.aulajpamaven.course.entities;

import java.util.Objects;

import com.aulajpamaven.course.entities.pk.OrderItemPK;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_order_item")
public class OrderItem {
	
	@EmbeddedId
	private OrderItemPK id;
	
	private Integer quantity;
	private Double price;
	
//	@OneToMany(mappedBy = "client")
//	private Set<Product> products = new HashSet<>();
//	private Set<Order> orders = new HashSet<>();
	
	public OrderItem() {
		super();
	}
	
	public OrderItem(Order order, Product product, Integer quantity, Double price) {
		super();
		id.setOrder(order);
		id.setProduct(product);
		this.quantity = quantity;
		this.price = price;
	}


	public OrderItemPK getId() {
		return id;
	}

	public void setId(OrderItemPK id) {
		this.id = id;
	}
	
	public Order getOrder() {
		return getId().getOrder();
	}
	
	public void setOrder(Order order) {
		getId().setOrder(order);
	}
	
	public Product getProduct() {
		return getId().getProduct();
	}
	
	public void setProduct(Product product) {
		getId().setProduct(product);
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

//	public Set<Product> getProducts() {
//		return products;
//	}
//
//	public Set<Order> getOrders() {
//		return orders;
//	}
	
	public Double subtotal() {
		return 0.0;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrderItem other = (OrderItem) obj;
		return Objects.equals(id, other.id);
	}

	

}