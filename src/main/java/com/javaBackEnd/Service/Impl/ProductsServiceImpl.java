package com.javaBackEnd.Service.Impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaBackEnd.Model.PageProductsDTO;
import com.javaBackEnd.Model.ProductsDTO;
import com.javaBackEnd.Respository.ProductsRepository;
import com.javaBackEnd.Respository.Entity.ProductsEntity;
import com.javaBackEnd.Service.ProductsService;

@Service
public class ProductsServiceImpl implements ProductsService {

	@Autowired
	ProductsRepository productsRepository;

	@Override
	public PageProductsDTO productsDTO(Integer limit, Integer skip) {
		// TODO Auto-generated method stub
		Integer s = (int) productsRepository.count();
		List<ProductsEntity> listProductRp;
		if (limit != null && skip != null) {
			if (s < (skip + limit)) {
				return null;
			}
			listProductRp = productsRepository.findByIdBetween(limit, skip + limit);
		} else if (limit != null && skip == null) {
			listProductRp = productsRepository.findByIdLessThanEqual(limit);
		} else if (limit == null && skip != null) {
			listProductRp = productsRepository.findByIdGreaterThanEqual(skip);
		} else {
			listProductRp = productsRepository.findAll();
		}
		PageProductsDTO pageProduct = new PageProductsDTO();
		List<ProductsDTO> listProductDTO = new ArrayList<ProductsDTO>();
		for (ProductsEntity x : listProductRp) {

			ProductsDTO a = new ProductsDTO();
			a.setAge(x.getAge());
			a.setPrice(x.getPrice());
			a.setName(x.getName());
			a.setId(x.getId());
			a.setDescription(x.getDescription());
			a.setQuantity(x.getQuantity());

			listProductDTO.add(a);
		}
		pageProduct.setProduct(listProductDTO);
		pageProduct.setLimit(limit);
		pageProduct.setSkip(skip);
		pageProduct.setTotal(s);

		return pageProduct;
	}

}
