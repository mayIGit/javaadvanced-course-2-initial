package com.busyqa.course.functional.stream;

import java.util.ArrayList;
import java.util.List;


public class Stream01ManualFilter {
		
	public static void main(String[] args) {
		
		List<Product> products = ProductList.generate();
		
		List<Float> productPriceList = new ArrayList<Float>();
		
		for (Product product : products) {

			/* filtering data of list */
			if (product.price < 30000) {
				productPriceList.add(product.price); /* adding price to a productPriceList */
			}
		}
		
		System.out.println(productPriceList); /* displaying data */
	}
}