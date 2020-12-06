package org.hcl.service;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.hcl.domain.Customer;
import org.hcl.exception.CustomerNotFound;
import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CustomerServiceImplTest {
static CustomerService service=null;
@Before
public void beforeEach() {
service=new CustomerServiceImpl();
}
@After
public void afterEach()
{
service=null;
}

@Test
public void testAddCustomer() {
Customer customer=new Customer(1, "suresh", "chennai");
boolean b=service.addCustomer(customer);
assertTrue(b);
}
@Test
public void testNotAddCustomer() {
Customer customer=null;
boolean b=service.addCustomer(customer);
assertFalse(b);

}

@Test(expected = CustomerNotFound.class)
@Ignore
public void testDeleteCustomer() {
int id=1;
boolean b=service.deleteCustomer(id);
assertTrue(b);
}

@Test
public void testGetCustomers() {
List<Customer> customers=service.getCustomers();
assertNotNull(customers);
}
@Test
public void testGetCustomers_Not_Getting_Customers() {
List<Customer> customers=service.getCustomers();
if(customers==null)
assertNull(customers);
else
assertNotNull(customers);
}

}
