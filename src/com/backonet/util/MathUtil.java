package com.backonet.util;

import java.util.List;

public class MathUtil {


	public static Double calculerMoyenne(List<Double> list) {
		
		if(list != null){
			
			Double moyenne = 0.0;
			
			if(list.isEmpty()){
				
				return moyenne;
				
			}else{
				
				for(Double i : list){
					moyenne += i;
				}
				
				return (moyenne / list.size());
			}
		}
		
		return null;
		
	}
	
}
