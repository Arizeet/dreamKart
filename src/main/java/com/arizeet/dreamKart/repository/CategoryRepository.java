package com.arizeet.dreamKart.repository;

import com.arizeet.dreamKart.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    Category findByName(String name);
}
