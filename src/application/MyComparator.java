package application;

import java.util.Comparator;

import entities.Product;

public class MyComparator implements Comparator<Product> {

//	What is comparing one product with another returning integer? The principle is very similar to Comparable(T), that is,
//	the integer  has to be positive if the first is greater than the second, and this number has to be zero if the
//	both were equals or negative if the first was less than the second so it works the same .compareTo(T other)
	
	@Override
	public int compare(Product p1, Product p2) {
		return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
	}

}
