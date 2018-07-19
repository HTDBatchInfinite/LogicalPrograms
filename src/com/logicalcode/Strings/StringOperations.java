package com.logicalcode.Strings;

public class StringOperations {

	public static void main(String[] args) {
		String s1="Test1";
		String s2=new String("Test1");
		String s3=new String("Test1").intern();
		String s5="Test2";
		String s4=new String("Test2").intern();
		System.out.println("s1 == s2 ? "+(s1==s2));
		System.out.println("s1 == s3 ? "+(s1==s3));
		/*if(s1==s2){
			System.out.println("s1==S2");
		}*/
		 /*if(s1==s3){
			System.out.println("s1==S3");
		}*/
	   if(s1.equals(s3)){
			System.out.println("s1 equals s2");
		}
	   if(s2.equals(s3)){
		  System.out.println("s2 equals s3");
	  }
	   if(s2==s3){
		  System.out.println("s2 equals s3");
	  }
	   if(s5==s4){
		   System.out.println("s5==s4"); 
	   }
		

	}

}
