package org.com.exception;

public class ProductNotFound extends RuntimeException{
	public ProductNotFound(String desc) {
		super(desc);
		}

}
