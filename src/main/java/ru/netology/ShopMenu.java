package ru.netology;

import java.util.Map;

public class ShopMenu implements Menu {
	// Don’t Repeat Yourself
	// printMenu() - вводит пользовательское меню
	public void printMenu(Map<Integer, Product> products) {
		System.out.println("{ Номер, Наименование, Цена }");
		for (Product product : products.values()) {
			System.out.println(product.toString());
		}
		System.out.println("Ввердите номер товара и количество через пробел");
		System.out.println("Для завершения покупки введите \"end\"");
	}
}
