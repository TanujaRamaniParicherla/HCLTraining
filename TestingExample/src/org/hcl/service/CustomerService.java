package org.hcl.service;
import java.util.List;

import org.hcl.domain.Customer;
public interface CustomerService {
	boolean addCustomer(Customer customer);
	boolean deleteCustomer(int id);
	List<Customer> getCustomers();

}
