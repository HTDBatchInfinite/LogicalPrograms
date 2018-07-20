package com.logicalcode.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SortedByValue {
	public static void main(String[] args) {
		Map<String,Integer> map=new HashMap<String,Integer> ();
		map.put("Test1",40);
		map.put("Test2",60);
		map.put("Test3",70);
		map.put("Test4",90);
		
		Set<Entry<String,Integer>> set=map.entrySet();
		List<Entry<String,Integer>> list=new ArrayList<Entry<String,Integer>>(set);
		Collections.sort(list, new Comparator<Map.Entry<String, Integer>>(){

			@Override
			public int compare(Map.Entry<String, Integer> o1,
					Map.Entry<String, Integer> o2) {
				// TODO Auto-generated method stub
				return (o2.getValue()).compareTo(o1.getValue());
			}
			});
		for(Map.Entry<String, Integer> mapEntry:list){
			System.out.println(mapEntry.getKey()+" "+mapEntry.getValue());
		}
		
		}
		
	}

