package com.bankonet.test;

import org.apache.logging.log4j.LogManager;

import com.backonet.domain.Compte;
import com.backonet.domain.CompteCourant;
import com.backonet.domain.CompteEpargne;
import com.backonet.exception.DebitException;

public class TestDebit {
	
	private static final org.apache.logging.log4j.Logger logger = LogManager.getLogger();

	public static void main(String[] args){
		
		CompteEpargne ce = new CompteEpargne("CE1","CE1",1000.0,1.5,10000.0);
		
		try {
			ce.debiter(900.0);
		} catch (DebitException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		logger.info("Apres 1er debit : "+ce);
		
		try {
			ce.debiter(200.0);
		} catch (DebitException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		logger.info("Apres 2me debit : "+ce);
		
		CompteCourant cc = new CompteCourant("CC1","CC1", 1000.0, 200.0);
		try {
			cc.debiter(900.0);
		} catch (DebitException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		logger.info("Apres 1er debit : "+cc);
		
		try {
			cc.debiter(200.0);
		} catch (DebitException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		logger.info("Apres 2me debit : "+cc);
		
		try {
			cc.debiter(200.0);
		} catch (DebitException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		logger.info("Apres 3me debit : "+cc);
		
		
		/*Polymorphisme 
		 * Les methodes possibles sont seulement celles du type declare
		 * Dans notre cas, Compte
		 */
		
		/*
		Compte cc0 = new CompteCourant("CC0","CC0", 1000.0, 200.0);
		//logger.info(cc0);
		
		Compte cc1 = new CompteCourant("CC1","CC1", 1000.0, 200.0);
		//logger.info(cc1);
		
		Compte ce0 = new CompteEpargne("CE0","CE0", 1000.0, 1.5);
		//logger.info(ce0);
		
		Compte ce1 = new CompteEpargne("CE1","CE1", 1000.0, 1.4);
		//logger.info(ce1);
		
		Compte[] tabComptes = new Compte[4];
		tabComptes[0] = cc0;
		tabComptes[1] = cc1;
		tabComptes[2] = ce0;
		tabComptes[3] = ce1;
		
		
		for (Compte compte : tabComptes){
			logger.info(compte);
			
			if(compte instanceof CompteCourant){
				CompteCourant compteCourant = (CompteCourant)compte;
				compteCourant.methodeCompteCourant();
			}
		}
		*/

	}

}
