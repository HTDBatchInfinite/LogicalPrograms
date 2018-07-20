package com.logicalcode.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CommonElementsInArray {
	public static void main(String a[]){
		int[] arr1 = {4,7,3,9,2};
        int[] arr2 = {3,2,12,9,40,32,4};
		arrarDemo(arr1,arr2);
        List<Integer> list=collectionDemo(arr1,arr2);
        System.out.println("common Elements using Collection API:"+list.toString());
        
    }

	private static List<Integer> collectionDemo(int[] arr1, int[] arr2) {
		 Map<Integer,Integer> map1=setINMap(arr1);
		 Map<Integer,Integer> map2=setINMap(arr2);
		 Set<Integer> keyset= map1.keySet();
		 List<Integer> list=new ArrayList<Integer>();
		 for(int key :keyset){
			 if(null!=map2.get(key)){
				 //System.out.println(map2.get(key));
				 list.add(map2.get(key));
			 }
		 }
		 return list;
	}

	private static Map<Integer,Integer> setINMap(int[] arr) {
		Map<Integer,Integer> map=new HashMap<Integer,Integer>();
		for(int val :arr){
			map.put(val, val);
		}
		return map;
		
	}

	private static void arrarDemo(int[] arr1, int[] arr2) {
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    System.out.println(arr1[i]);
                }
            }
        }
		
	}

}
