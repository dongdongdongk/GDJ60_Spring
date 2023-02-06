package com.iu.s1.product;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/product/*") //product 아래 모든 하위
public class ProductController {

	@RequestMapping(value = "productList")
	public void getProductList() {
		System.out.println("productList");
		
	}
	
}
