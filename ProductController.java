package com.niit.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.niit.model.ProductDAO;

import com.niit.pojo.Product;

@Controller
public class ProductController {
	@Autowired
	private ProductDAO productDAOImpl;
	
	@ModelAttribute("product")
	public Product createProductModel()
	{
		Product product=new Product();
		return product;
		
		
	}
	
	@RequestMapping(value = { "/Product" })
	public String showProductPage() {
		return "Product";
	}

@RequestMapping(value ="getProduct",method=RequestMethod.POST)
	
	public String showRegisterPage(@ModelAttribute Product product, Model m) 
	{
		System.out.println("getting the product ");
		m.addAttribute("product", product);
		productDAOImpl.addProduct(product);
		
				return "Product";
	}

}

