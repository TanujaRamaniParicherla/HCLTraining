package org.com.listners;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class ContextListener implements HttpSessionListener {

	@Override
	public void sessionCreated(HttpSessionEvent se) {
		HttpSession session=se.getSession();
		
		System.out.println("session created");
		session.getAttribute("hi");
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent se) {
		
		System.out.println("Session destroyed");
	}

}
