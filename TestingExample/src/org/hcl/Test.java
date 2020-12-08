package org.hcl;

	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;
	import java.util.List;

	import org.hcl.domain.Customer;
	import org.hcl.service.CustomerService;
	import org.hcl.service.CustomerServiceImpl;

	public class Test {

	public static void main(String[] args) throws NumberFormatException, IOException {

	CustomerService service=new CustomerServiceImpl();
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int ch;
	do
	{
	System.out.println("1.Insert");
	System.out.println("2.Delete");
	System.out.println("3.Display");
	System.out.println("4.exit");
	System.out.println("Enter your choice");
	ch=Integer.parseInt(br.readLine());
	switch(ch)
	{
	case 1:
	System.out.println("Enter the customer details");
	boolean b=service.addCustomer(getObject(br));
	if(b)
	System.out.println("Inserted Successfully");
	else
	System.out.println("Not inserted ");
	break;
	case 2:
	System.out.println("enter the customer id to delete");
	int id=Integer.parseInt(br.readLine());
	boolean b1=service.deleteCustomer(id);
	if(b1)
	System.out.println("deleted successfully");
	else
	System.out.println("not deleted");
	break;
	case 3:
	List<Customer> customers=service.getCustomers();
	System.out.println("the customers are");
	displayCustomers(customers);
	break;

	}


	}while(ch<=3);
	}
	private static Customer getObject(BufferedReader br) throws NumberFormatException, IOException {
	int id;
	String name,address;
	id=Integer.parseInt(br.readLine());
	name=br.readLine();
	address=br.readLine();
	return new Customer(id, name, address);
	}
	private static void displayCustomers(List<Customer> customers)
	{
	for(Customer customer:customers)
	{
	System.out.println(customer);
	}
	}
	}

}
