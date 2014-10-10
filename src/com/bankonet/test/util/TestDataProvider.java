package com.bankonet.test.util;

import com.backonet.domain.CompteCourant;
import com.backonet.domain.CompteEpargne;
import com.backonet.domain.Tresor;
import com.backonet.util.SoldeConsultable;

public class TestDataProvider {

	public static SoldeConsultable[] buildSoldeConsultableData(){
		SoldeConsultable[] result = new SoldeConsultable[6];
		
		result[0] = new CompteEpargne("CE0","CE0", 1000.0, 1.5, 5000.0);
		result[1] = new CompteCourant("CC1","CC1", 2000.0, 200.0);
		
		result[2] = new CompteEpargne("CE1","CE1", 3000.0, 1.5,5000.0);
		result[3] = new CompteCourant("CC2","CC2", 4000.0, 200.0);
		
		result[4] = new CompteEpargne("CE2","CE2", 5000.0, 1.5,5000.0);
		result[5] = new CompteCourant("CC3","CC3", 6000.0, 200.0);
		
		return result;
		
	}
	
	public static SoldeConsultable[] buildSoldeConsultableDataSecondSet() {
		
		SoldeConsultable[] result = new SoldeConsultable[2];
		
		result[0] = new Tresor(100);
		result[1] = new Tresor(50);
		
		return result;
	}
}
