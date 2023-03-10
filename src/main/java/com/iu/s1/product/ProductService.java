package com.iu.s1.product;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
	
	@Autowired
	private ProductDAO productDAO;
	
	
	
	public ProductDTO getProductDetail(ProductDTO productDTO)throws Exception{
		return productDAO.getProductDetail(productDTO);
	}
	
	public List<ProductDTO> getProductList()throws Exception{
		return productDAO.getProductList();
	}
	
	
	public int setAddProduct(ProductDTO productDTO)throws Exception{
		
		
		return productDAO.setAddProduct(productDTO);	
	}

}