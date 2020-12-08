package org.hcl.service;
import java.util.ArrayList;
import java.util.List;


import org.hcl.domain.Product;
import org.hcl.exception.ProductNotFound;
public class ProductServiceImpl implements ProductService {
List<Product> products=new ArrayList<>();
@Override
public boolean addProducts(Product product) {
if(product!=null)
return products.add(product);
else
return false;

}
@Override
public boolean deleteProducts(int id)throws ProductNotFound {
boolean b=false;
Product product=getProduct(id);
if(product!=null)
b=products.remove(product);
else
{
throw new ProductNotFound("no customer existed with id");
}
return b;
}

@Override
public List<Product> getProducts() {

return products;
}
private Product getProduct(int id)
{
Product product=null;
for(Product product2:products)
{
if(id==product2.getId())
{
product=product2;
break;
}
}
return product;
}

}