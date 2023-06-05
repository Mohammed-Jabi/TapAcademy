package com.Tap.maps;

import java.util.HashMap;
import java.util.Set;

public class HashMaps {

	public static void main(String[] args) {
	
	HashMap<String, Integer> map= new HashMap<String,Integer>();
	
	map.put("India", 900);
	map.put("Pakista", 400);
	map.put("UAE", 300);
	map.put("China", 10000);
	map.put("USA", 400);
	map.put("US", 300);
	
	System.out.println(map);
	
	System.out.println();
	
	Set<String> keys = map.keySet();
	
	System.out.println(keys);
	
	System.out.println();
	
	for(String key :keys) {
		Integer value = map.get(key);
		System.out.println(key +" : "+value);
	}
	}

}
