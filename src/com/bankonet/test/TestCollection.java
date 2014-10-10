package com.bankonet.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.backonet.domain.Point;

public class TestCollection {

	public static void main(String[] args) {
	
		// list (interface) et ArrayList (implementation)
		Collection<Integer> integers1 = new ArrayList<>();
		
		integers1.add(1);
		
		integers1.add(2);
		
		integers1.add(3);
		
		for(Integer i : integers1){
			System.out.println(i);
		}
		
		System.out.println("Taille de integers1 "+ integers1.size());
		
		Collection<Integer> integers2 = new ArrayList<>();
		
		integers2.add(4);
		
		integers2.add(2);
		
		integers2.add(5);
		
		integers2.add(1);
		
		for(Integer i : integers2){
			System.out.println(i);
		}
		
		System.out.println("Taille de integers2 "+ integers2.size());
		
		Set<Integer> integersSet = new HashSet<>();
		
		integersSet.addAll(integers1);
		
		integersSet.addAll(integers2);
		
		System.out.println("Taille de integersSet "+ integersSet.size());
		
		
		
		Collection<String> strings = new ArrayList<>();
		
		strings.add("ch1");
		
		strings.add("ch2");
		
		strings.add("ch3");
		
		for(String s : strings){
			System.out.println(s);
		}
		
		System.out.println("Taille de strings : "+ strings.size());
		
		// Set , HashSet
		Set<Integer> set = new HashSet<>();
		
		set.add(1);
		
		set.add(2);
		
		set.add(3);
		
		set.add(4);
		
		set.add(2);
		
		set.add(3);
		
		set.add(4);
		
		System.out.println("Taille de strings : "+ set.size());
		
		System.out.println();
		
		// Map , HashMap
		
		Map<Integer , Collection<String>> villesMap = new HashMap<>();
		
		villesMap.put(75,new ArrayList<String>());
		villesMap.get(75).add("Paris");
		
		villesMap.put(69,new ArrayList<String>());
		villesMap.get(69).add("Lyon");
		villesMap.get(69).add("Givort");
		
		villesMap.put(38,new ArrayList<String>());
		villesMap.get(38).add("Grenoble");
		
		villesMap.put(13,new ArrayList<String>());
		villesMap.get(13).add("Marseille");

		
		for(Integer cleDepartement : villesMap.keySet()){
			
			Collection<String> villes = villesMap.get(cleDepartement);
			
			System.out.println("Departement -> " + cleDepartement);
			
			for(String city : villes){
				System.out.println("\tVille : "+ city);
			}
		}
		
		
		Map<String, Integer> notesMap = new HashMap<>();
		
		notesMap.put("student 1 ", 14);
		
		notesMap.put("student 2 ", 16);
		
		notesMap.put("student 3 ", 18);
		
		Collection<Integer> notes = notesMap.values();
		
		for(Integer note : notes){
			
			System.out.println("Note : "+ note);
		}
		
		Set<Map.Entry<String , Integer>>  entries = notesMap.entrySet();
		
		for(Map.Entry<String, Integer> entry : entries){
			
			System.out.println("Entre : " + entry.getValue() + " Note : "+ entry.getValue());
			
		}
		
		// Test des points , equals et hash
		
		System.out.println();
		
		Collection<Point> listePoints = new HashSet<>();
		
		listePoints.add(new Point(1,3));
		
		listePoints.add(new Point(2,5));
		
		listePoints.add(new Point(1,5));
		
		listePoints.add(new Point(1,3));
		
		System.out.println("ListePoints : "+ listePoints);
		System.out.println("Taille de la listePoints : "+ listePoints.size());
		
		
		
		

	}

}
