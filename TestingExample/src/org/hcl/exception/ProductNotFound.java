package org.hcl.exception;

public class ProductNotFound extends RuntimeException{
public ProductNotFound(String desc) {
super(desc);
}
}
