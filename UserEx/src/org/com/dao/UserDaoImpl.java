package org.com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Optional;

import org.com.domain.User;
import org.com.model.DbCredentials;
import org.com.util.DbUtilities;

public class UserDaoImpl implements UserDao{
	@Override
	public boolean insert(User user) {
		Connection con = null;
		PreparedStatement pst = null;
		boolean b = false;
		DbCredentials credentials = DbUtilities.getCredentials();
		try {
			con = DbUtilities.getConnection(credentials.getDriver(), credentials.getUrl(), credentials.getUname(),
					credentials.getPwd());
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
		Connection con = null;
		PreparedStatement pst = null;
		boolean b = false;
		DbCredentials credentials = DbUtilities.getCredentials();
		try {
			con = DbUtilities.getConnection(credentials.getDriver(), credentials.getUrl(), credentials.getUname(),
					credentials.getPwd());
			System.out.println("Connected to databse");
			if (con != null) {
				pst = con.prepareStatement("select * from User where username=? and password=?");
				pst.setString(1, user.getUsername());
				pst.setString(2,user.getPassword() );
				System.out.println("Preparing to insert");
				ResultSet rs= pst.executeQuery();
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
	public Optional<User> getUserByUserName(String userName) {
		DbCredentials credentials = DbUtilities.getCredentials();
		Connection con=null;
		PreparedStatement pst=null;
		ResultSet rs=null;
		Optional<User> userOptional=null;
		boolean b=false;
		try {
			con = DbUtilities.getConnection(credentials.getDriver(), credentials.getUrl(), credentials.getUname(),
					credentials.getPwd());
			
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
