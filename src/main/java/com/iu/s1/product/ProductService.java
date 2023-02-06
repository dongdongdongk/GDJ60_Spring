package com.iu.s1.product;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ProductService {

	private ProductDAO productDAO;
	
	public ProductService() {
		this.productDAO = new ProductDAO();
	}
	
	public List<ProductDTO> getProductList() throws Exception {
		
		return productDAO.getProductList();
	}
}
