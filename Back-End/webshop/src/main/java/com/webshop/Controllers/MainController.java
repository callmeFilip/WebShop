package com.webshop.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.webshop.Entities.Product_Item_Class;
import com.webshop.RepositoryAccess.ItemRepository;

@RestController
@RequestMapping(path="/EN")
public class MainController {
	
	public MainController() {
		System.out.print(" in Main\n\n\n\n");

	}
	@Autowired
	private ItemRepository repo;
	
	@GetMapping(path="/")
	public @ResponseBody Iterable<Product_Item_Class> getAllItems(){
		System.out.print(" /All");
		return repo.findAll();
	}
	
}
