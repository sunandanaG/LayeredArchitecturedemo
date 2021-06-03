package com.vm.client;

import com.vm.bean.Product;
import com.vm.service.ProductService;

public class Client 
{
	public static void main(String[] args) {
		
		ProductService ps=new ProductService();
		Product product=ps.getProductById(100 );
		System.out.println("product id");
		System.out.println(product.getProductId()+" "+product.getProductName()+" "+product.getQuantity());
		
		System.out.println(ps.getAllproducts());
		
	}

}
