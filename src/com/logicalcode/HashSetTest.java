package com.logicalcode;

import java.util.HashSet;

import com.logicalcode.bean.Sample1;

public class HashSetTest {
	public static void main(String[] args) {
		Sample1 s1=new Sample1();
		Sample1 s2=new Sample1();
		s1=setData(s1);
		s2=setData(s2);
		HashSet<Sample1> hashSet=new HashSet<Sample1>();
		hashSet.add(s1);
		hashSet.add(s2);
		Sample1 s3=new Sample1();
		s3.setFirstName("siva");
		s3.setLastName("ujjina");
		hashSet.add(s3);
		System.out.println("size::"+hashSet.size());
		for(Sample1 obj :hashSet){
			System.out.println(obj);
		}
	}

	private static Sample1 setData(Sample1 obj) {
		if(obj instanceof Sample1){
		obj.setFirstName("chandu");
		obj.setLastName("ujjina");
		}
		return obj;
	}

}
