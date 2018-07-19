package com.logicalcode.reflectionapi;

import java.lang.reflect.Method;

import com.logicalcode.bean.Sample;

public class PriavteMethodAccessTest {
public static void main(String[] args) throws Exception {
	Sample sample=new Sample();
	Class<?> cls= sample.getClass();
	Method method=cls.getDeclaredMethod("invokePrivate");
	method.setAccessible(true);
	method.invoke(sample);
}
}
