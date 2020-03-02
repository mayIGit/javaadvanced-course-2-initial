package com.busyqa.course.functional.stream;

import java.util.ArrayList;
import java.util.List;

class Product {
	
	int id;
	String name;
	float price;

	Product(int id, String name, float price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
	  
    float getPrice() {  
        return price;  
    }  	
}

public class ProductList {

	 static List<Product> generate() {
		 
		List<Product> products = new ArrayList<>();
		
		/* Adding Products */
		products.add(new Product(1, "HP Laptop", 25000f));
		products.add(new Product(2, "Dell Laptop", 30000f));
		products.add(new Product(3, "Lenevo Laptop", 28000f));
		products.add(new Product(4, "Sony Laptop", 28000f));
		products.add(new Product(5, "Apple Laptop", 90000f));
		
		return products;
	}
}
