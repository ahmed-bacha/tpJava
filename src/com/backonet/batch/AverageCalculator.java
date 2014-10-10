package com.backonet.batch;

import com.backonet.util.SoldeConsultable;

public class AverageCalculator {

	public static Double calculateAverage(SoldeConsultable[] soldeConsultables){
		Double result = 0.0;
		
		if(soldeConsultables.length != 0){
			for(SoldeConsultable soldeConsultable : soldeConsultables){
				result = result + soldeConsultable.consulteSolde();
			}
			
			result = result / soldeConsultables.length;
		}
		
		return result;
	}
}
