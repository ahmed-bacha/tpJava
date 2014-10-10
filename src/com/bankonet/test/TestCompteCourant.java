package com.bankonet.test;
import com.backonet.domain.CompteCourant;
import com.backonet.exception.CreditException;
import com.backonet.exception.DebitException;

public class TestCompteCourant {

	public static void main(String[] args) throws DebitException {
		
		CompteCourant compteCourant1 = new CompteCourant("4444","Jean",3455567.00,500.00);
		CompteCourant compteCourant2 = new CompteCourant("4445","Tim",367.00,50.00);
		CompteCourant compteCourant3 = new CompteCourant("4446","Steve",67.00,50.00);
		
		CompteCourant[] tabCompteCourant = {compteCourant1,compteCourant2,compteCourant3};

		for(CompteCourant cc : tabCompteCourant){
			System.out.println(cc);
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
		System.out.println();
		
		for(CompteCourant cc : tabCompteCourant){
			System.out.println(cc);
		}
		
		System.out.println("nbr d'instances : "+CompteCourant.getNbComptesCourants());
	}
}
