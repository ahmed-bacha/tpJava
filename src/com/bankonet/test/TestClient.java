package com.bankonet.test;

import java.util.Collection;
import java.util.HashSet;

import org.apache.logging.log4j.LogManager;

import com.backonet.domain.Client;
import com.backonet.domain.Compte;
import com.backonet.domain.CompteCourant;
import com.backonet.domain.CompteEpargne;

public class TestClient {
	
	private static final org.apache.logging.log4j.Logger logger = LogManager.getLogger();

	public static void main(String[] args) {
		
		Client c = new Client("id" , "nom", "prenom");
		
		Collection<Client> clients = new HashSet<>();

		for (int i = 0; i < 10; i++) {

			CompteCourant cc = new CompteCourant();
			cc.setSolde(1000D);
			cc.setIntitule("Compte Courant" + i);
			cc.setNumero("cc" + i);
			cc.setMontantDecouvertAutorise(1000D);

			CompteEpargne ce = null;
			
			if (i%2 ==  1) {
				ce = new CompteEpargne();
				ce.setSolde(1000D);
				ce.setIntitule("Compte Courant" + i);
				ce.setNumero("cc" + i);
				ce.setTauxInteret(1.5D);
			}
			
			// ajouter compte courant
			if( cc != null ){
				
				c.ajouterCompte(cc);
				
			}
			
			// ajouter compte epargne
			if( ce != null ){
				
				c.ajouterCompte(ce);
			}
			
			clients.add(c);
		}
		
		logger.info("Before removing");
		
		logger.info(c);
			
		// traitement de suppression
		Compte cc4 = c.retrouverCompte("cc4");
			
		if( cc4 != null ){
				
			logger.info("CC4 : "+ cc4);
			
			c.supprimerCompte(cc4);
		}
		
		logger.info("After removing");
		
		logger.info(c);
		
	}
}
