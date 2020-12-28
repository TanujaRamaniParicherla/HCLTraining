package org.hcl.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.hcl.domain.Products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository
public class ProductDaoImpl implements ProductDao {
	private DataSource datasource;

	public ProductDaoImpl() {
		// TODO Auto-generated constructor stub
	}
	@Autowired
	public ProductDaoImpl(DataSource datasource) {
		super();
		this.datasource = datasource;
	}

	public DataSource getDatasource() {
		return datasource;
	}

	public void setDatasource(DataSource datasource) {
		this.datasource = datasource;
	}

	@Override
	public List<Products> getAll() {
		Connection con=null;
		Statement st=null;
		ResultSet rs=null;
		List<Products> product=new ArrayList<>();
		boolean b=false;
		try {
			con=datasource.getConnection();
			System.out.println("Connected to databse");
			if(con!=null)
			{
				st=con.createStatement();
					rs=st.executeQuery("select * from products");
		
		System.out.println("Preparing to retrieve");
		
		while(rs.next())
		{
			
			product.add(new Products(rs.getInt(1),rs.getString(2),rs.getString(3)));
		}
		System.out.println("Data retrieved successfully");
	
		
		con.close();
		}
		} catch (Exception e2) {
		e2.printStackTrace();
		}
		// TODO Auto-generated method stub
		return product;
	}

}



