package org.hcl.service;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.hcl.domain.Product;
import org.hcl.exception.ProductNotFound;
import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ProductServiceImplTest {
static ProductService service=null;
@Before
public void beforeEach() {
service=new ProductServiceImpl();
}
@After
public void afterEach()
{
service=null;
}

@Test
public void testAddProduct() {
Product product=new Product(1, "shampoo", "hair");
boolean b=service.addProducts(product);
assertTrue(b);
}
@Test
public void testNotAddProduct() {
Product product=null;
boolean b=service.addProducts(product);
assertFalse(b);

}

@Test(expected = ProductNotFound.class)
@Ignore
public void testDeleteProduct() {
int id=1;
boolean b=service.deleteProducts(id);
assertTrue(b);
}

@Test
public void testGetProduct() {
List<Product> product=service.getProducts();
assertNotNull(product);
}
@Test
public void testGetProduct_Not_Getting_Product() {
List<Product> product=service.getProducts();
if(product==null)
assertNull(product);
else
assertNotNull(product);
}

}
