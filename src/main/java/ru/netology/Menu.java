package ru.netology;

import java.util.Map;

// Dependency inversion principle
public interface Menu {
	public void printMenu(Map<Integer, Product> products);
}
