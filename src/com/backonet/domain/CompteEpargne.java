package com.backonet.domain;

import static com.backonert.constants.Constants.*;

import com.backonert.constants.Constants;
import com.backonet.exception.DebitException;

public class CompteEpargne extends Compte {
	
	private Double tauxInteret;
	
	private Double plafond;
	
	
	public CompteEpargne(String numero, String intitule, Double solde,
			Double tauxInteret,Double plafond) {
		
		super(numero,intitule,solde);
		
		this.tauxInteret = tauxInteret;
		
		this.plafond 	 = plafond;
	}


	public CompteEpargne() {
		
		super();
		
		this.tauxInteret = Constants.DEFAULT_TAUX_INTERET;
		
		this.plafond 	 = Constants.DEFAULT_PLAFOND;
	}

	@Override
	protected boolean iscreditAutorise(Double montant) {
		return (this.getSolde() + montant <= this.plafond);
	}
	
	
	public Double getPlafond() {
		return plafond;
	}


	public void setPlafond(Double plafond) {
		this.plafond = plafond;
	}


	@Override
	public String toString() {
		String result = super.toString();
		return result+", tauxInteret : "+this.tauxInteret+", plafond : "+this.plafond;
	}
	
	
	@Override
	protected boolean isDebitAutorise(Double montant) {
		return ((this.getSolde() - montant) >= 0);
	}
	
	@Override
	public TypeCompte getTypeCompte(){
		return TypeCompte.COMPTE_EPARGNE;
	}

	public Double getTauxInteret() {
		return tauxInteret;
	}

	public void setTauxInteret(Double tauxInteret) {
		this.tauxInteret = tauxInteret;
	}

	
	
	
}
