package com.logicalcode.Strings;

import java.util.ArrayList;
import java.util.List;

public class RepeatedWordCount {
	public static void main(String[] args) {
		String name="chandu ujjina chandu ujjina siva ujjina chari ";
		repeatedWordandCount(name);
	}

	private static void repeatedWordandCount(String name) {
		List list=new ArrayList();
		String names[]=name.split("");
		for(String name1 :names){
		if(list.indexOf(name1)>0){
			list.add(name1);
		}
		else{
			list.add(name1);
		}
		System.out.println("list::"+list.toString());

	}

}
}