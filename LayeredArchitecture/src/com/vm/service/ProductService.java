package com.vm.service;

import java.util.Map;

import com.vm.Dao.IproductDAO;
import com.vm.Dao.ProductDAO;
import com.vm.bean.Product;

public class ProductService implements IProductService{

	
	IproductDAO ip=new ProductDAO();
	
	@Override
	public Product getProductById(int id) 
	{
		// TODO Auto-generated method stub
		return ip.getProductById(id);
	}

	@Override
	public Map<Integer, Product> getAllproducts() {
		// TODO Auto-generated method stub
		return ip.getAllProducts();
	}

}
