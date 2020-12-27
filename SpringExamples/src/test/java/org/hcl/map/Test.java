package org.hcl.map;

import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {

	public static void main(String[] args) {
		Resource resource=new ClassPathResource("spring.xml");
		BeanFactory factory=new XmlBeanFactory(resource);
		Quiz   questionBean=(Quiz)factory.getBean("quiz");
		      System.out.println("Question :"+ questionBean.getQuestion());
		Map<String,String>  map=questionBean.getAnswers();
		Set<String>    keys=map.keySet();
		for(String key:keys){
		String  value=map.get(key);
		System.out.println("Posted By : "+key+" \tAnswer : "+value);
		}
		}

}
