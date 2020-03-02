package com.busyqa.course.functional.stream;

import java.util.*;

public class Stream02FilterCollection {
	public static void main(String[] args) {

		List<Product> products = ProductList.generate();
		
		/* This is a more compact approach for filtering data */
		
		products.stream()
		   .filter(product -> product.price == 30000)
		   .forEach(product -> System.out.println(product.name));
	}
}
