package org.hcl.service;
import java.util.List;

import org.hcl.domain.Product;
public interface ProductService {
	boolean addProducts(Product product);
	boolean deleteProducts(int id);
	List<Product> getProducts();

}
