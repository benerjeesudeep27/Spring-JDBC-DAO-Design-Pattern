package com.spring.jdbc.main;

import java.util.Scanner;

import com.spring.jdbc.bean.ProductDetails;
import com.spring.jdbc.services.InsertionService;
import com.spring.jdbc.services.InsertionServiceImpl;

public class AppTesting {

	public static void main(String[] args) {
		ProductDetails product = new ProductDetails();
		Scanner sc = new Scanner(System .in);
		System.out.print("Enter the serial no of the product : ");
		product.setSerialno(sc.nextInt());
		
		System.out.print("Enter the name no of the product : ");
		product.setName(sc.next());
		
		System.out.print("Enter the category no of the product : ");
		product.setCategory(sc.next());
		
		System.out.print("Enter the price no of the product : ");
		product.setPrice(sc.nextFloat());
		
		System.out.print("Enter the discount no of the product : ");
		product.setDiscount(sc.nextFloat());
		
		InsertionService insertionService = new InsertionServiceImpl();
		boolean status =insertionService.insertProduct(product);
		if(status ==true) {
			System.out.println("Insertion successful");
		}else {
			System.err.println("Error occured");
		}
		
	}

}
