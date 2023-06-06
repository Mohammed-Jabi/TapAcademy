package com.Tap.maps;

import java.util.Comparator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

class Compare implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {

		return o1.compareTo(o2) * -1;
	}





}

public class TreeMaps {

	public static void main(String[] args) {

		Compare com = new Compare();
		TreeMap<String, Integer> map= new TreeMap<String,Integer>(com);

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
		
		System.out.println();
		Set<Entry<String,Integer>> entry = map.entrySet();
		
		for(Entry<String, Integer> e : entry) {
			System.out.println(e.getKey()+" : "+ e.getValue());
		}
	}

}
