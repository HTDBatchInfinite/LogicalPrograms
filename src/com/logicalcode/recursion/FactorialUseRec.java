package com.logicalcode.recursion;

public class FactorialUseRec {
	public static void main(String[] args) {
		int value=factorial(5);
		System.out.println("value:::"+value);
	}

	private static int factorial(int num) {
		if (num == 1){      
            return 1;
		}
          else{      
            return(num * factorial(num-1)); 
          }
		
	}
	

}
