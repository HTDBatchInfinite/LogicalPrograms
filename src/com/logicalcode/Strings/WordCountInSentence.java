package com.logicalcode.Strings;

public class WordCountInSentence {
public static void main(String[] args) {
	/*String name="Test1,ALL,Test2";
	LiteralString(name);*/
	String name1=" chandu  ujjina  Test ";
	int count=LiteralString(name1);
	System.out.println("count::"+count);
	
}

private static int LiteralString(String name) {
	int count=0;
	String[] wordList=name.split(" ");
	for(String names :wordList){
		if(!names.equals("")){
		count=count+1;
		}
	}
   return count;
}
}
