package com.javaBackEnd.Respository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaBackEnd.Respository.Custom.ProductsRepositoryCustom;
import com.javaBackEnd.Respository.Entity.ProductsEntity;

public interface ProductsRepository extends JpaRepository<ProductsEntity,Integer>,ProductsRepositoryCustom {
	//List<ProductsEntity> getProduct(Integer limit, Integer skip);
	List<ProductsEntity> findByIdBetween(Integer limit,Integer skip);
	List<ProductsEntity> findByIdGreaterThanEqual(Integer skip);
	List<ProductsEntity> findByIdLessThanEqual(Integer id);
}
