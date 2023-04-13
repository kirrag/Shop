package ru.netology;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
	
	// Magic rule
	private static Product moloko = new Product("Молоко", 100.0);
	private static Product hleb = new Product("Хлеб", 50.0);
	private static Product grechka = new Product("Гречневая крупа", 150.0);

	private static Scanner scanner = new Scanner(System.in);

	private static void printMenu(List<Product> products) {
		for (Product product : products) {
			System.out.println(product.toString());
		}
		System.out.println("Для завершения покупки введите \"end\"");
	}

	public static void main(String[] args) {

		List<Product> products = new ArrayList<>();
		products.add(moloko);
		products.add(hleb);
		products.add(grechka);

		Basket basket = new Basket();

		printMenu(products);


		while (true) {
			String input = scanner.nextLine().trim();
			if ("end".equals(input)) break;
		}

		basket.add(moloko, 2);
		basket.add(hleb, 1);
		basket.add(grechka, 1);
		basket.add(moloko, 3);
		basket.remove(moloko, 1);

		basket.printOrder();
	}
}
