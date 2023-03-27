package com.day14.Collection2;

import java.util.HashMap;

public class HashmakEce {
	public static void main(String[] args) {
		HashMap<String,Long> hm= new HashMap<>();
		hm.put("Shanmu", 14785236945l);
		hm.put("Raj", 748596123654l);
		System.out.println(hm.get("Raj"));
		for(String k:hm.keySet()) {
			System.out.println(k);
			System.out.println(hm.get(k));
		}
		for(long l:hm.values()) {
			System.out.println(l);
			}
		hm.forEach((k,l)->System.out.println(k+" "+l));
	}
}

