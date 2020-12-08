package org.serialization.example;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SeriliaztionEx {
	 public static void main(String args[]){  
	  try{  
	  //Creating the object  
	  //Student s1 =new Student(211,"ravi");  
	  //Creating stream and writing the object  
	  FileOutputStream fout=new FileOutputStream("f.txt");  
	  ObjectOutputStream out=new ObjectOutputStream(fout);  
	  out.writeObject("hello");  
	  out.flush();  
	  //closing the stream  
	  out.close();  
	  System.out.println("success");  
	  }catch(Exception e)
	  {
		  System.out.println(e);
		  }  
	 }  
	}  


