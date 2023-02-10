package com.jsp.product.review.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.product.review.dao.ProductDao;
import com.jsp.product.review.dto.Product;
import com.jsp.product.review.dto.Review;
import com.jsp.product.review.service.ProductService;

public class Productdriver {
	public static void main(String[] args) {

		// insert product

//		Product product = new Product();
//		product.setName(null);
//		product.setBrand(null);
//		product.setType(null);
//		product.setCost(0);
//
//		ProductService productService = new ProductService();
//		productService.saveProduct(product);

		// get by id

//		ProductService productService1 = new ProductService();
//		Product product2 = productService1.getByIDProduct(1);
//		System.out.println(product2.getId());
//		System.out.println(product2.getName());
//		System.out.println(product2.getBrand());
//		System.out.println(product2.getType());
//		System.out.println(product2.getCost());

		// delete product

//		Product product3 = new Product();
//		product3.setId(1);
//
//		ProductService productService2 = new ProductService();
//		productService2.deleteProduct(product3);

		// update

//		Product product4 = new Product();
//		product4.setId(3);
//		product4.setName("abc");
//		product4.setBrand("abc");
//		product4.setType("abc");
//		product4.setCost(1000);
//
//		ProductService productService3 = new ProductService();
//		productService3.updateProduct(product4);

		// Get all details

//		ProductService productService4 = new ProductService();
//		productService4.getAllDetails();

	}

}
