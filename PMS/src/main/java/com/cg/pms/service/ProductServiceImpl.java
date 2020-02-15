package com.cg.pms.service;

import java.util.List;

import com.cg.pms.bean.Product;
import com.cg.pms.exception.ProductException;

public class ProductServiceImpl implements ProductService {
	
	

	@Override
	public boolean validateName(String productName) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int addProduct(Product product) throws ProductException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Product findProduct(int productId) throws ProductException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product deleteProduct(int productId) throws ProductException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> findAllProduct() throws ProductException {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	

}
