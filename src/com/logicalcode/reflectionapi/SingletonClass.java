package com.logicalcode.reflectionapi;

public class SingletonClass {
	private static String str="test";
	private static SingletonClass singleton;
	
  static{
	singleton=new SingletonClass();
  }
  private SingletonClass(){
	  
  }
  public static SingletonClass getInstance(){
	  return singleton;
  }
  public void testMethod(){
	  System.out.println("inside testMethod");
  }
  public static void main(String[] args) {
	  SingletonClass s= getInstance();
	  s.testMethod();
	  s.str	=s.str.toUpperCase();
	  System.out.println(s.hashCode()+" "+singleton.hashCode());
	  SingletonClass s1= getInstance();
	  System.out.println(s.hashCode()+" "+s1.hashCode());
	  System.out.println("str::"+s.str);
	  System.out.println("str::"+s1.str);
}
  
}
