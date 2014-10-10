package com.bankonet.test;

import com.backonet.domain.Compte;
import com.backonet.domain.CompteCourant;
import com.backonet.domain.CompteEpargne;
import com.backonet.exception.DebitException;

public class TestDebit {

	public static void main(String[] args) throws DebitException {
		
		CompteEpargne ce = new CompteEpargne("CE1","CE1",1000.0,1.5,10000.0);
		
		ce.debiter(900.0);
		System.out.println("Apres 1er debit : "+ce);
		
		ce.debiter(200.0);
		System.out.println("Apres 2me debit : "+ce);
		
		System.out.println("");
		
		CompteCourant cc = new CompteCourant("CC1","CC1", 1000.0, 200.0);
		cc.debiter(900.0);
		System.out.println("Apres 1er debit : "+cc);
		
		cc.debiter(200.0);
		System.out.println("Apres 2me debit : "+cc);
		
		cc.debiter(200.0);
		System.out.println("Apres 3me debit : "+cc);
		
		
		/*Polymorphisme 
		 * Les methodes possibles sont seulement celles du type declare
		 * Dans notre cas, Compte
		 */
		
		/*
		Compte cc0 = new CompteCourant("CC0","CC0", 1000.0, 200.0);
		//System.out.println(cc0);
		
		Compte cc1 = new CompteCourant("CC1","CC1", 1000.0, 200.0);
		//System.out.println(cc1);
		
		Compte ce0 = new CompteEpargne("CE0","CE0", 1000.0, 1.5);
		//System.out.println(ce0);
		
		Compte ce1 = new CompteEpargne("CE1","CE1", 1000.0, 1.4);
		//System.out.println(ce1);
		
		Compte[] tabComptes = new Compte[4];
		tabComptes[0] = cc0;
		tabComptes[1] = cc1;
		tabComptes[2] = ce0;
		tabComptes[3] = ce1;
		
		
		for (Compte compte : tabComptes){
			System.out.println(compte);
			
			if(compte instanceof CompteCourant){
				CompteCourant compteCourant = (CompteCourant)compte;
				compteCourant.methodeCompteCourant();
			}
		}
		*/

	}

}
