package com.vm.Dao;

import java.util.Map;

import com.vm.bean.Product;
import com.vm.util.CollectionUtil;

public class ProductDAO implements IproductDAO{

	
	//CollectionUtil cu=new CollectionUtil();

	@Override
	public Product getProductById(int id) 
	{
		Map<Integer,Product> hashmap=CollectionUtil.getProducts();
		Product product=hashmap.get(id);
		return product;
	}

	@Override
	public Map getAllProducts() {
		// TODO Auto-generated method stub
		return CollectionUtil.getProducts();
	}
	

}
