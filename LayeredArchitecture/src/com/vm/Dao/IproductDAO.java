package com.vm.Dao;

import java.util.Map;

import com.vm.bean.Product;

public interface IproductDAO 
{
	Product getProductById(int id);

	Map <Integer,Product>getAllProducts();
	
}


