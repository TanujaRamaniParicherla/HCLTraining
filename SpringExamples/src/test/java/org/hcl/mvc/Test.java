package org.hcl.mvc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {

	public static void main(String[] args) {
		/*ApplicationContext context=new ClassPathXmlApplicationContext("spring1.xml");
		MyController mc=context.getBean(MyController.class);
		mc.display();*/
		ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
		MyController controller=context.getBean(MyController.class);
		controller.display();
	}

}
