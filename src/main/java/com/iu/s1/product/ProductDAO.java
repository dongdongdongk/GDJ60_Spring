package com.iu.s1.product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.iu.s1.utill.DBConnection;

@Repository
public class ProductDAO {

	public ArrayList<ProductDTO> getProductList() throws Exception {
		ProductDTO productDTO = new ProductDTO();
		ArrayList<ProductDTO> ar = new ArrayList<ProductDTO>();
		Connection connection = DBConnection.getConnnection();
		String sql = "SELECT PRODUCTNUM,PRODUCTNAME,PRODUCTJUMSU "
				+ "FROM PRODUCT";
		PreparedStatement st = connection.prepareStatement(sql);
		ResultSet rs = st.executeQuery();
		while(rs.next()) {
			productDTO.setProductNum(rs.getLong("PRODUCTNUM"));
			productDTO.setProductName(rs.getString("PRODUCTNAME"));
			productDTO.setProductJumsu(rs.getDouble("PRODUCTJUMSU"));
			ar.add(productDTO);
		}
		DBConnection.disConnect(st, connection);
		return ar;
	}
	
}
