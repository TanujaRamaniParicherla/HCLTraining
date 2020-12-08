package org.hcl.domain;

import java.io.Serializable;

public class Product implements Serializable {
private Integer id;
private String name;
private String reason;
public Product() {
// TODO Auto-generated constructor stub
}
public Product(Integer id, String name, String reason) {
super();
this.id = id;
this.name = name;
this.reason = reason;
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
public String getReason() {
return reason;
}
public void setReason(String reason) {
this.reason = reason;
}
@Override
public String toString() {
return String.format("%d\t%s\t%s", id,name,reason);
}


}
