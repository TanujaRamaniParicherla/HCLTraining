package org.hcl.dao;

import java.util.List;

import org.hcl.domain.Products;

public interface ProductDao {
	public List<Products> getAll();
}
