package com.cg.pms.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//import com.cg.ems.bean.Employee;
import com.cg.pms.bean.Product;
import com.cg.pms.exception.ProductException;

public class ProductDaoImpl implements ProductDao{

	
	
	private Map<Integer,Product> map;
	 
	public ProductDaoImpl()
	{
		map = new HashMap<Integer,Product>();
	}
	
	@Override
	public int addProduct(Product product) throws ProductException {
		
		boolean flag = map.containsKey(product.getProductId());
		
		if(flag)
		{
			throw new ProductException(" Id already exists");
		}
		
		map.put(product.getProductId(), product);
		
		return  product.getProductId();
	}

	@Override
	public Product findProduct(int productId) throws ProductException {
		
		boolean flag = map.containsKey(productId);
		Product product = null;
		
		if(flag)
		{
			product = map.get(productId);
		}
		else
		{
			throw new ProductException(" Id not found");
		}
		
		
		// TODO Auto-generated method stub
		return product;
	}

	@Override
	public Product deleteProduct(int productId) throws ProductException {
		
		Product product = null;
		boolean flag = map.containsKey(productId);
		if(flag)
		{
			product = map.remove(productId);
		}
				
		
		return product;
	}

	@Override
	public List<Product> findAllProduct() throws ProductException {
		
		Collection<Product> col = map.values();
		List<Product> list = new ArrayList<>(col);
		
		
		
		return list;
	}
	
	
	
	

}
