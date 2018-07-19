package com.logicalcode.recursion;

public class StringRevRecusion {

	 public static String reverse(String str) 
	    {     
	        if ((str==null)||(str.length() <= 1) ){
	            return str;
	        }
	        return reverse(str.substring(1)) + str.charAt(0);
	    }
	    public static void main(String[] args) 
	    {
	    	//StringRevRecusion obj=new StringRevRecusion();
	        String name = "madam";
	       String rev= reverse(name);
	        System.out.println("rev::"+rev); 
	        if(name.equals(rev)){
	        	System.out.println("given String "+name+" is palindrome");
	        }
	        else{
	        	System.out.println("given String "+name+" is not palindrome");
	        }
	    }  
	

}
