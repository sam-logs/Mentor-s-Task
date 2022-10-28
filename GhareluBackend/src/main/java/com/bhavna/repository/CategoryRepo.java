package com.bhavna.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bhavna.model.Category;

public interface CategoryRepo extends JpaRepository<Category, Integer>{

}
