package org.hcl.util;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

import org.hcl.model.DbCredentials;

public class DbUtilities {

	public static final Connection getConnection(String driver,String url,String uname,String pwd) {
		Connection con=null;
		try {
		Class.forName(driver);
		con=DriverManager.getConnection(url,uname,pwd);
		} catch (Exception e) {
		e.printStackTrace();
		}
		return con;
		}
		public static DbCredentials getCredentials()
		{
		Properties properties=null;
		DbCredentials credentials=null;
		try {
		properties=new Properties();
		properties.load(new FileInputStream("C://HCL1//ProductInfo//dataBase.properties"));
		credentials=new DbCredentials();
		credentials.setDriver(properties.getProperty("driver"));
		credentials.setUrl(properties.getProperty("url"));
		credentials.setUname(properties.getProperty("uname"));
		credentials.setPwd(properties.getProperty("pwd"));
		} catch (Exception e) {
		e.printStackTrace();
		}
		return credentials;
		}

}
