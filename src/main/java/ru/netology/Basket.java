package ru.netology;

import java.util.Map;
import java.util.HashMap;

public class Basket {

	private Map<Product, Integer> basket;
	
	public Basket() {
		basket = new HashMap<>();
	}

	public void add(Product product, Integer quantity) {
		if(basket.get(product) != null) {
			basket.put(product, basket.get(product) + quantity);
 		} else {
			basket.put(product, quantity);
		}
	}
	
	public void remove (Product product, Integer quantity) {
		if(basket.get(product) != null && basket.get(product) - quantity > 0) {
			basket.put(product, basket.get(product) - quantity);
		} else {
			basket.remove(product);
		}
	}

	public void clear () {
		basket.clear();
	}

	public void printOrder() {
		double total = 0.0;
		for (Product item : basket.keySet()) {
			System.out.println(item.getName() + ", " +  basket.get(item) + ", " + item.getPrice());
			total += basket.get(item) * item.getPrice();
		}
		System.out.println("-----------------------------------------------");
		System.out.println("Итого: " + total);
	}
} 
