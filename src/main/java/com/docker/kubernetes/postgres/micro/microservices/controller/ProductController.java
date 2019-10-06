package com.docker.kubernetes.postgres.micro.microservices.controller;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.docker.kubernetes.postgres.micro.microservices.entity.Product;
import com.docker.kubernetes.postgres.micro.microservices.repository.ProductRepository;

@RestController
public class ProductController {
	
	@Autowired
	 private ProductRepository productRepository;

	@GetMapping("/products")
	public List<Product> getProducts() {
		 return productRepository.findAll();
	}

	@PostMapping("/products")
	public Product save(@RequestBody Product product) {
		return productRepository.save(product);
	}
}