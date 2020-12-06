package org.hcl.exception;

public class CustomerNotFound extends RuntimeException{
public CustomerNotFound(String desc) {
super(desc);
}
}
