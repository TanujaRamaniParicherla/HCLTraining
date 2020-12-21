package org.com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.com.domain.Product;
import org.com.model.DbCredentials;
import org.com.util.DbUtilities;

public class ProductDaoImpl implements ProductDao {

	@Override
	public List<Product> getAll() {
		DbCredentials credentials = DbUtilities.getCredentials();
			Connection con=null;
			Statement st=null;
			ResultSet rs=null;
			List<Product> products=new ArrayList<>();
			con=DbUtilities.getConnection(credentials.getDriver(), credentials.getUrl(), credentials.getUname(), credentials.getPwd());
			PreparedStatement pst=null;
			
			try {
				System.out.println("Connected to databse");
				if(con!=null)
				{
					
				pst=con.prepareStatement(" select * from Products1") ;
				System.out.println("Preparing to retrieve");
				rs=pst.executeQuery();
				while(rs.next())
				{
					
					products.add(new Product(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4), rs.getInt(5)));
				}
				System.out.println("Data retrieved successfully");
			
				
				con.close();
				}
				} catch (Exception e2) {
				e2.printStackTrace();
				}
				// TODO Auto-generated method stub
				return products;
			}
				
	

	@Override
	public boolean add(Product product) {
		DbCredentials credentials = DbUtilities.getCredentials();
		Connection con=null;
		PreparedStatement pst=null;
		boolean b=false;
		try {
			con=DbUtilities.getConnection(credentials.getDriver(), credentials.getUrl(), credentials.getUname(),
					credentials.getPwd());
			
			if(con!=null)
			{
				pst=con.prepareStatement("insert into Products1 values(?,?,?,?,?)");
				pst.setInt(1, product.getPid());
				pst.setString(2, product.getProductName());
				pst.setString(3, product.getImageUrl());
				pst.setString(4, product.getDescription());
				pst.setInt(5, product.getPrice());
				int i=pst.executeUpdate();
				if(i>0)
					b=true;
				con.close();
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return b;
	}

}
