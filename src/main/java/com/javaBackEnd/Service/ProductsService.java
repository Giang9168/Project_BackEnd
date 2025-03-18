package com.javaBackEnd.Service;

import java.util.List;

import com.javaBackEnd.Model.PageProductsDTO;
import com.javaBackEnd.Model.ProductsDTO;
import com.javaBackEnd.Respository.Entity.ProductsEntity;

public interface ProductsService {
	PageProductsDTO productsDTO(Integer limit, Integer skip);
	
}
