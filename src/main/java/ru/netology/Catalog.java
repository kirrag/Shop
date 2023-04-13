package ru.netology;

import java.util.Map;

// Dependency inversion principle
public interface Catalog {
	public Map<Integer, Product> getProducts();
}
