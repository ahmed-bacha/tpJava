package com.bankonet.test;

import org.apache.logging.log4j.LogManager;

import com.backonet.domain.CompteCourant;
import com.backonet.domain.CompteEpargne;
import com.backonet.exception.CreditException;
import com.backonet.exception.DebitException;

public class TestVirement {
	
	private static final org.apache.logging.log4j.Logger logger = LogManager.getLogger();

	public static void main(String[] args){
		
		CompteEpargne ce = new CompteEpargne("CE1","CE1",1000.0,1.5,10000.0);
		
		CompteCourant cc = new CompteCourant("CC1","CC1", 1000.0, 200.0);
		
		try {
			ce.effectuerVirement(cc, 900.00);
			
		} catch (DebitException | CreditException e) {
		
			logger.info(e.getMessage());
		}
		
		logger.info("Apres 1er debit : "+ce);
		logger.info("Apres 2me debit : "+cc);
		
		
		try {
			ce.effectuerVirement(cc, 200.00);
			
		} catch (DebitException | CreditException e) {
			
			logger.info(e.getMessage());
		}
		
		logger.info("Apres 1er debit : "+ce);
		logger.info("Apres 2me debit : "+cc);
		
		
	}
}
