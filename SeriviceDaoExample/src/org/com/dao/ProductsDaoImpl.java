package org.com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.com.domain.Products;
import org.com.model.DbCredentials;
import org.com.service.ProductImpl;
import org.com.service.ProductsService;
import org.com.util.DbUtilities;

public class ProductsDaoImpl implements ProductsDao {
	
	Products pr = new Products();
	ArrayList<Products> arr = new ArrayList<Products>();

	@Override
	public boolean insert(Products pr) {
		Connection con = null;
		PreparedStatement pst = null;
		boolean b = false;
		DbCredentials credentials = DbUtilities.getCredentials();
		try {
			con = DbUtilities.getConnection(credentials.getDriver(), credentials.getUrl(), credentials.getUname(),
					credentials.getPwd());
			System.out.println("Connected to databse");
			if (con != null) {
				pst = con.prepareStatement("insert into products values(?,?,?)");
				System.out.println("Preparing to insert");
				pst.setInt(1, pr.getId());
				pst.setString(2, pr.getName());
				pst.setString(3, pr.getReason());

				int i = pst.executeUpdate();
				System.out.println("Data entered successfully");
				if (i > 0)
					b = true;
				con.close();
			}
		} catch (Exception e2) {
			e2.printStackTrace();
		}
		return b;
	}

	@Override
	public boolean delete(int n) {
		// TODO Auto-generated method stub
			Connection con=null;
			PreparedStatement pst=null;
			boolean b=false;
			DbCredentials credentials=DbUtilities.getCredentials();
			try {
			con=DbUtilities.getConnection(credentials.getDriver(), credentials.getUrl(), credentials.getUname(), credentials.getPwd());
			System.out.println("Connected to databse");
			if(con!=null)
			{
			pst=con.prepareStatement("delete  from  products where  id= ?") ;
			System.out.println("Preparing to delete");
			pst.setInt(1,n);
			
			int i=pst.executeUpdate();
			System.out.println("Data deleted successfully");
			if(i>0)
			b=true;
			con.close();
			}
			} catch (Exception e2) {
			e2.printStackTrace();
			}
			return b;
			}

	@Override
	public void update(String name,int id) {
		Connection con=null;
		PreparedStatement pst=null;
		boolean b=false;
		DbCredentials credentials=DbUtilities.getCredentials();
		try {
		con=DbUtilities.getConnection(credentials.getDriver(), credentials.getUrl(), credentials.getUname(), credentials.getPwd());
		System.out.println("Connected to databse");
		if(con!=null)
		{
			
		pst=con.prepareStatement("update products set name= ? where id= ?") ;
		System.out.println("Preparing to update");
		pst.setString(1,name);
		pst.setInt(2, id);
		
		int i=pst.executeUpdate();
		System.out.println("Data updated successfully");
		if(i>0)
		b=true;
		con.close();
		}
		} catch (Exception e2) {
		e2.printStackTrace();
		}
		//return b;
		}
		// TODO Auto-generated method stub

	@Override
	public List<Products> getProducts() {
		Connection con=null;
		PreparedStatement pst=null;
		ResultSet rs=null;
		boolean b=false;
		DbCredentials credentials=DbUtilities.getCredentials();
		try {
		con=DbUtilities.getConnection(credentials.getDriver(), credentials.getUrl(), credentials.getUname(), credentials.getPwd());
		System.out.println("Connected to databse");
		if(con!=null)
		{
			
		pst=con.prepareStatement(" select * from products") ;
		System.out.println("Preparing to retrieve");
		rs=pst.executeQuery();
		while(rs.next())
		{
			
			arr.add(new Products(rs.getInt(1),rs.getString(2),rs.getString(3)));
		}
		System.out.println("Data retrieved successfully");
	
		
		con.close();
		}
		} catch (Exception e2) {
		e2.printStackTrace();
		}
		// TODO Auto-generated method stub
		return arr;
	}
		
		
	}



// TODO Auto-generated method stub

