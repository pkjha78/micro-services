package com.docker.kubernetes.postgres.micro.microservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.docker.kubernetes.postgres.micro.microservices.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}