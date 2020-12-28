package org.hcl.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Optional;

import javax.sql.DataSource;


import org.hcl.domain.User;
import org.springframework.beans.factory.annotation.Autowired;

public class UserDaoImpl implements UserDao {
	private DataSource datasource;

	public UserDaoImpl() {
		// TODO Auto-generated constructor stub
	}
	
	@Autowired
	public UserDaoImpl(DataSource datasource) {
		super();
		this.datasource = datasource;
	}


	@Override
	public boolean insert(User user) {
		Connection con=null;
		PreparedStatement pst=null;
		ResultSet rs=null;
		boolean b = false;
		
		try {
			con=datasource.getConnection();
			System.out.println("Connected to databse");
			if (con != null) {
				pst = con.prepareStatement("insert into User(id,username,password,phonenumber,address) values(?,?,?,?,?)");
				System.out.println("Preparing to insert");
				pst.setInt(1, user.getId());
				pst.setString(2, user.getUsername());
				pst.setString(3,user.getPassword() );
				pst.setString(4, user.getPhonenumber());
				pst.setString(5, user.getAddress());
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
	public boolean validate(User user) {
		Connection con=null;
		PreparedStatement pst=null;
		ResultSet rs=null;
		boolean b = false;
		
		try {
			con=datasource.getConnection();
			System.out.println("Connected to databse");
			if (con != null) {
				pst = con.prepareStatement("select * from User where username=? and password=?");
				pst.setString(1, user.getUsername());
				pst.setString(2,user.getPassword() );
				System.out.println("Preparing to insert");
				rs= pst.executeQuery();
				System.out.println("login successfully");
				rs=pst.executeQuery();
				//b=rs.next();
				if (rs.next())
					b = true;
				con.close();
			}
		} catch (Exception e2) {
			e2.printStackTrace();
		}
		return b;	
			
	}
	@Override
	public Optional<User> getUserByUserName(String userName) {
		Connection con=null;
		PreparedStatement pst=null;
		ResultSet rs=null;
		Optional<User> userOptional=null;
		boolean b=false;
		try {
			con=datasource.getConnection();
			
			if(con!=null)
			{
				pst=con.prepareStatement("select * from User where username=?");
				pst.setString(1, userName);
				rs=pst.executeQuery();
				rs.next();
				User user=new User(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
				userOptional=Optional.ofNullable(user);
			}
			con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return userOptional;
	}
	
}
