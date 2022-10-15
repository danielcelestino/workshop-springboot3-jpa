package com.aulajpamaven.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aulajpamaven.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
