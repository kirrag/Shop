package ru.netology;

public class Main {
	
	// Magic rule
	private static Product moloko = new Product("Молоко", 100.0);
	private static Product hleb = new Product("Хлеб", 50.0);
	private static Product grechka = new Product("Гречневая крупа", 150.0);

	public static void main(String[] args) {

		Basket basket = new Basket();

		basket.add(moloko, 2);
		basket.add(hleb, 1);
		basket.add(grechka, 1);
		basket.add(moloko, 3);
		basket.remove(moloko, 1);

		basket.printOrder();
	}
}
