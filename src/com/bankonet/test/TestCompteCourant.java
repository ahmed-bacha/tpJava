package com.bankonet.test;
import org.apache.logging.log4j.LogManager;

import com.backonet.domain.CompteCourant;
import com.backonet.exception.CreditException;
import com.backonet.exception.DebitException;

public class TestCompteCourant {
	
	private static final org.apache.logging.log4j.Logger logger = LogManager.getLogger();

	public static void main(String[] args) throws DebitException {
		
		CompteCourant compteCourant1 = new CompteCourant("4444","Jean",3455567.00,500.00);
		CompteCourant compteCourant2 = new CompteCourant("4445","Tim",367.00,50.00);
		CompteCourant compteCourant3 = new CompteCourant("4446","Steve",67.00,50.00);
		
		CompteCourant[] tabCompteCourant = {compteCourant1,compteCourant2,compteCourant3};

		for(CompteCourant cc : tabCompteCourant){
			logger.info(cc);
		}
		
		compteCourant1.debiter(500.0);
		try {
			compteCourant2.crediter(500.0);
		} catch (CreditException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			compteCourant3.crediter(1000.0);
		} catch (CreditException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		compteCourant3.debiter(100500.0);
		
		for(CompteCourant cc : tabCompteCourant){
			logger.info(cc);
		}
		
		logger.info("nbr d'instances : "+CompteCourant.getNbComptesCourants());
	}
}
