package com.bhavna.services;

import java.util.List;

import com.bhavna.payload.CategoryDto;



public interface CategoryService {
	//used for loose coupling
	CategoryDto createCategory(CategoryDto categoryDto);
	
	CategoryDto updateCategory(CategoryDto categoryDto,Integer categoryId);
	
	public void deleteCategory(Integer categoryId);
	
	CategoryDto getCategory(Integer categoryId);
	
	List<CategoryDto> getCategories();
	

}
