package com.iu.s1.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/product/*")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	
	@RequestMapping(value = "list")
	public String getProductList() throws Exception{ 
		System.out.println("ProductList");
		
		List<ProductDTO> ar = productService.getProductList();
		System.out.println(ar.size()>0);
		
		return "product/productList";
	}
	@RequestMapping(value = "detail")
	public String getProductDetail() {
		System.out.println("Product Detail");
		return "product/productDetail";
	}
	@RequestMapping(value = "productAdd")
	public String getProductAdd() {
		return "product/productAdd";
	}
	@RequestMapping(value = "productUpdate")
	public ModelAndView getProductUpdate() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("product/productUpdate");
		return mv;
		
	}
}
