package com.javaBackEnd.API;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.javaBackEnd.Model.PageProductsDTO;
import com.javaBackEnd.Model.ProductsDTO;
import com.javaBackEnd.Service.ProductsService;

@RestController
public class API {
	
	@Autowired
	private ProductsService productService;
	
    @CrossOrigin(origins = "http://127.0.0.1:5500", methods = { RequestMethod.GET, RequestMethod.POST })
	@GetMapping(value = "/products/")
	public PageProductsDTO testAPI(@RequestParam(value="limit",required=false) Integer limit ,@RequestParam(value="skip",required=false) Integer skip) {
		
		PageProductsDTO an = productService.productsDTO(limit,skip);
		return an;
		
	}

	@GetMapping(value = "/products/search")
	public String testAPI2(@RequestParam(value = "name", required = false) String a) {
		System.out.print("hhh");
		return a + " truot mon roi dcu cuoc doi";
	}

	@DeleteMapping(value = "/products/delete/{id}")
	public void deleteProduct(@PathVariable String id) {
		System.out.println(id);
	}
}
