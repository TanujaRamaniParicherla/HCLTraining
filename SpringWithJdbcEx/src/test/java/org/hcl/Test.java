package org.hcl;

import java.util.List;

import org.hcl.config.AppConfig;
import org.hcl.domain.Products;
import org.hcl.service.ProductService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
		//ApplicationContext context=new ClassPathXmlApplicationContext("spring-bean.xml");
		ProductService service=context.getBean(ProductService.class);
		List<Products> pro=service.getProducts();
		pro.stream().forEach(product->{
			System.out.println(product.getId()+"\t"+product.getName()+"\t"+product.getReason());
		});
	
				// TODO Auto-generated method stub

	}

}
