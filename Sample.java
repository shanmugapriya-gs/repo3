package com.day14.Collection2;

import java.util.HashMap;

public class Sample {
	public static void main(String[] args) {
		HashMap<Integer,String> k=new HashMap<>();
		k.put(24,"Shanmu");
		k.put(20, "Raj");
		k.put(32, "Sangi");
		k.put(41, "Nisha");
		k.put(51, "Jeeva");
        int max=0;
        for(Integer j: k.keySet()) {
			if(j>max){	
				max=j;
			}
		}
		System.out.println(max);
		for(String l:k.values()) {
			if(l.length()%2==0) {
				System.out.println(l.toUpperCase());
			}
		}
		int min=max;
		String a=" ";
		for(Integer m:k.keySet()) {
			if(m<min) {
				min=m;
				a=k.get(min);
			}
		}

		System.out.println(a.toLowerCase());
	}

}
