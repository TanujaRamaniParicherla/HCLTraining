package org.hcl;

import org.hcl.entities.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {
	public static void main(String args[])
	{
	Configuration configuration=new Configuration();
	configuration.configure("hibernate.cfg.xml");
	SessionFactory factory=configuration.buildSessionFactory();
	Session session=factory.openSession();
	Transaction trans=session.beginTransaction();
	//Student st=session.get(Student.class, 2);
	//st.setAddress("relangi");
	//session.delete(st);
	//trans.commit();
	//System.out.println("deleted");
	//System.out.println(st.getId()+"\t"+st.getName()+"\t"+st.getAddress());
	Student st=new Student(1,"ramani","tanuku");
	session.save(st);
	//System.out.println(st.getId()+"\t"+st.getName()+"\t"+st.getAddress());
	//session.delete(st);
	//System.out.println("dleted");
	trans.commit();
	session.close();

}
}
