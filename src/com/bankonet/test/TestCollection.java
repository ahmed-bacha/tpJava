package com.bankonet.test;

import java.util.ArrayList;
import java.util.List;

public class TestCollection {

	public static void main(String[] args) {
	
		// list (interface) et ArrayList (implementation)
		List<Integer> listeIntegers = new ArrayList<>();
		
		listeIntegers.add(1);
		
		listeIntegers.add(2);
		
		listeIntegers.add(3);
		
		listeIntegers.add(4);
		
		for(Integer i : listeIntegers){
			System.out.println(i);
		}
		
		
		
		List<String> listeStrings = new ArrayList<>();
		
		listeStrings.add("ch1");
		
		listeStrings.add("ch2");
		
		listeStrings.add("ch3");
		
		
		for(String s : listeStrings){
			System.out.println(s);
		}
		

	}

}
