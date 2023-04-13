package ru.netology;

import java.util.Scanner;
import java.util.Map;

public class Main {

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		// Создаем справочник продуктов
		ShopCatalog catalog = new ShopCatalog();
		Map<Integer, Product> products = catalog.getProducts();

		// Создем корзину
		Basket basket = new Basket();

		// Вывод пользовательского меню
		ShopMenu menu = new ShopMenu();
		menu.printMenu(products);

		// Основной цикл программы
		while (true) {
			String input = scanner.nextLine().trim();
			if ("end".equals(input))
				break;
			String[] parm = input.split("\\W+");
			int id = Integer.parseInt(parm[0]);
			int quantity = Integer.parseInt(parm[1]);

			// Добавление продукта в корзину
			if (products.get(id) != null && quantity > 0) {
				basket.add(products.get(id), quantity);
			} else {
				System.out.println("Неправильно введен номер товара или количество!");
			}
		}
		// Вывод заказа
		basket.printOrder();
	}
}
