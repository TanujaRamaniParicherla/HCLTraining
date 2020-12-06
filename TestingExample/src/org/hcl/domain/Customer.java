package org.hcl.domain;

import java.io.Serializable;

public class Customer implements Serializable {
private Integer id;
private String name;
private String address;
public Customer() {
// TODO Auto-generated constructor stub
}
public Customer(Integer id, String name, String address) {
super();
this.id = id;
this.name = name;
this.address = address;
}
public Integer getId() {
return id;
}
public void setId(Integer id) {
this.id = id;
}
public String getName() {
return name;
}
public void setName(String name) {
this.name = name;
}
public String getAddress() {
return address;
}
public void setAddress(String address) {
this.address = address;
}
@Override
public String toString() {
return String.format("%d\t%s\t%s", id,name,address);
}


}
