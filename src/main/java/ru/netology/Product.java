package ru.netology;

// Single-responsibility principle
// Liskov substitution principle
public class Product {
	private int id; // Номер продукта
	private String name; // Наименование продукта
	private double price; // Цена продукта

	public Product(int id, String name, double price) {
		this.id = id;
		this.name = name;
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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "{ " + id + ", " + name + ", " + price + " }";
	}
}
