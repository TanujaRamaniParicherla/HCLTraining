package org.hcl.domain;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args)
	{
	ApplicationContext context=new ClassPathXmlApplicationContext("spring-beans.xml");
	Emp e=context.getBean(Emp.class);
	System.out.println(e.getId()+"\t"+e.getName());
	Address ad=e.getAddress();
	System.out.println(ad.getHno()+"\n"+ad.getStreetname()+"\n"+ad.getLandmark());
	University unv=context.getBean(University.class);
	System.out.println(unv.getId()+"\t"+unv.getName()+"\t");
	List<Course> courses=unv.getCoursesOffered();
	System.out.println("the offered couses");
	courses.stream().forEach(cour->{
		System.out.println(cour.getCid()+"\t"+cour.getCname()+"\t"+cour.getCdur());
	});
}
}
