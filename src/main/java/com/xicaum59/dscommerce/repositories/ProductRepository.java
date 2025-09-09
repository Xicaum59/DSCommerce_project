package com.xicaum59.dscommerce.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xicaum59.dscommerce.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

	Optional<Product> findById(long id);

}
