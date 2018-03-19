package com.niit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.niit.model.CategoryDAO;
import com.niit.pojo.Category;

	@Controller
	public class CategoryController {
		@Autowired
		private CategoryDAO categoryDAOImpl;
		
		
		@ModelAttribute("category")
		public Category createCategoryModel()
		{
			Category category=new Category();
			return category;
			
			
		}
		
		@RequestMapping(value = { "/Category" })
		public String showCategoryPage() {
			return "Category";
		}
	@RequestMapping(value ="getCategory",method=RequestMethod.POST)
		
		public String showCategoryPage(@ModelAttribute Category category, Model m) 
		{
			System.out.println("getting the Category ");
			m.addAttribute("category",category);
			categoryDAOImpl.addCategory(category);
			
			
			
			return "Category";
		}
		

}
