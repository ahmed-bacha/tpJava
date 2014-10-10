package com.bankonet.test;

import com.backonet.domain.CompteCourant;
import com.backonet.domain.CompteEpargne;
import com.backonet.exception.CreditException;
import com.backonet.exception.DebitException;

public class TestVirement {

	
	public static void main(String[] args){
		
		CompteEpargne ce = new CompteEpargne("CE1","CE1",1000.0,1.5,10000.0);
		
		CompteCourant cc = new CompteCourant("CC1","CC1", 1000.0, 200.0);
		
		try {
			ce.effectuerVirement(cc, 900.00);
			
		} catch (DebitException | CreditException e) {
		
			System.out.println(e.getMessage());
		}
		
		System.out.println("Apres 1er debit : "+ce);
		System.out.println("Apres 2me debit : "+cc);
		
		
		try {
			ce.effectuerVirement(cc, 200.00);
			
		} catch (DebitException | CreditException e) {
			
			System.out.println(e.getMessage());
		}
		
		System.out.println("Apres 1er debit : "+ce);
		System.out.println("Apres 2me debit : "+cc);
		
		
	}
}
