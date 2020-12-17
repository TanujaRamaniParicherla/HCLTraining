
package org.com.dao;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	//import java.sql.SQLException;
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




