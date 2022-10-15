package com.aulajpamaven.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aulajpamaven.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product,Long>{

}
