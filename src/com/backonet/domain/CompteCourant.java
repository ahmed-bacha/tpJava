package com.backonet.domain;

import com.backonert.constants.Constants;

public class CompteCourant extends Compte{
	
	private Double montantDecouvertAutorise;
	private static Integer nbComptesCourants = 0;
	
	public CompteCourant() {
		super();
		this.montantDecouvertAutorise = 0.0;
		CompteCourant.nbComptesCourants++;
	}

	public CompteCourant(String numero, String intitule, Double solde,
			Double montantDecouvertAutorise) {
		
		super(numero, intitule, solde);
		
		this.montantDecouvertAutorise = montantDecouvertAutorise;
		CompteCourant.nbComptesCourants++;
	}
	
	@Override
	protected boolean iscreditAutorise(Double montant) {
		return true;
	}
	
	@Override
	public String toString() {
		String result = super.toString();
		return result+", montantDecouvertAutorise : "+this.montantDecouvertAutorise;
	}

	
	@Override
	protected boolean isDebitAutorise(Double montant) {
		return ((this.getSolde() + this.montantDecouvertAutorise - montant) >= 0);
	}
	
	@Override
	public TypeCompte getTypeCompte(){
		return TypeCompte.COMPTE_COURANT;
	}
	
	public void methodeCompteCourant(){
		System.out.println("methodeCompteCourant");
	}
	
	public Double getMontantDecouvertAutorise() {
		return montantDecouvertAutorise;
	}

	public void setMontantDecouvertAutorise(Double montantDecouvertAutorise) {
		this.montantDecouvertAutorise = montantDecouvertAutorise;
	}

	public static Integer getNbComptesCourants() {
		return nbComptesCourants;
	}

	public static void setNbComptesCourants(Integer nbComptesCourants) {
		CompteCourant.nbComptesCourants = nbComptesCourants;
	}



	
}
