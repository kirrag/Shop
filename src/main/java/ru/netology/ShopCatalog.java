package ru.netology;

import java.util.Map;
import java.util.HashMap;

public class ShopCatalog {
	private static final Product moloko = new Product(1, "Молоко", 100.0);
	private static final Product hleb = new Product(2, "Хлеб", 50.0);
	private static final Product grechka = new Product(3, "Гречневая крупа", 150.0);

	// Don’t Repeat Yourself
	// getProducts() создает и возращает справочник товаров (продуктов)
	public Map<Integer, Product> getProducts() {

		Map<Integer, Product> products = new HashMap<>();

		products.put(moloko.getId(), moloko);
		products.put(hleb.getId(), hleb);
		products.put(grechka.getId(), grechka);

		return products;
	}
}
