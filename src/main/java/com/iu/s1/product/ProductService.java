package com.iu.s1.product;
import com.iu.s1.utill.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

//import com.iu.home.util.DBConnection;

@Service
public class ProductService {
	private ProductDAO productDAO;

	
	
	public ProductService() {
		this.productDAO = new ProductDAO();
	}
	public List<ProductDTO> getProductList() throws Exception {
	
		return productDAO.getProductList();
	}

	public int setAddProduct(ProductDTO productDTO, List<ProductOptionDTO> ar) throws Exception {
//product, option
		Long productNUM = productDAO.getProductNum();
		productDTO.setProductNum(productNUM);
		int result = productDAO.setaddProduct(productDTO);
		
		if(ar != null) {
			for (ProductOptionDTO productOptionDTO : ar) {
				productOptionDTO.setProductNum(productNUM);
				result = productDAO.setaddProductOption(productOptionDTO);
			
		}
		
		}
		return result;
	}

	public ProductDTO getproductDetail(ProductDTO productDTO) throws Exception {
		System.out.println(productDTO.getProductNum());
		Connection connection =DBConnection.getConnnection();
		String sql = "SELECT * FROM PRODUCT WHERE PRODUCTNUM=?";
		PreparedStatement st = connection.prepareStatement(sql);
		
		st.setLong(1,productDTO.getProductNum());
		
		ResultSet rs = st.executeQuery();
		if(rs.next()) {
			productDTO = new ProductDTO();
			productDTO.setProductNum(rs.getLong("PRODUCTNUM"));
			productDTO.setProductDetail(rs.getString("PRODUCTDETAIL"));
			productDTO.setProductName(rs.getString("PRODUCTNAME"));
			productDTO.setProductJumsu(rs.getDouble("PRODUCTJUMSU"));
		}else {
			productDTO = null;
		}
		DBConnection.disConnect(st, connection);
		return productDTO;
	
		
	}

}