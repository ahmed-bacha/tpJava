package com.backonet.domain;

import com.backonert.constants.Constants;
import com.backonet.exception.CreditException;
import com.backonet.exception.DebitException;
import com.backonet.util.SoldeConsultable;

public abstract class Compte implements SoldeConsultable {

	private String numero;
	
	private String intitule;
	
	private Double solde;
	

	public Compte(String numero, String intitule, Double solde) {
		super();
		this.numero = numero;
		this.intitule = intitule;

		if (solde >= 0) {
			this.solde = solde;
		} else {
			this.solde = 0D;
		}
	}

	public Compte() {
		super();
		this.solde = 0D;
	}

	public void debiter(Double montant) throws DebitException {
		
		if(!this.isDebitAutorise(montant)){
	
			throw new DebitException(Constants.DEBIT_REFUSE + " " + this.toString() + " " + montant);
			
		}else{
			
			System.out.println(Constants.DEBIT_ACCEPTE);
			this.solde -= montant;
		}
	}
	
	public void effectuerVirement(Compte compteCible, Double montant) throws DebitException, CreditException{
		
		// step 01
		try {
			
			this.debiter(montant);
			
		} catch (DebitException e) {
			
			throw e;
		}
		
		// step 02
		try {
			
			compteCible.crediter(montant);
			
		} catch (CreditException ce) {
			
			this.crediter(montant);
			
			throw ce;
		}
		
		
		
		
	}
	
	abstract protected boolean isDebitAutorise(Double montant);
	
	abstract protected boolean iscreditAutorise(Double montant);
	
	abstract public TypeCompte getTypeCompte();
	
	
	
	
	public void crediter(Double montant) throws CreditException {
		
		if(!this.iscreditAutorise(montant)){
			
			throw new CreditException(Constants.DEBIT_REFUSE + " " + this.toString() + " " + montant);
			
		}else{
		
			this.solde += montant;
		}
		
	}
	
	@Override
	public String toString() {
		return this.getTypeCompte()+" |  numero=" + numero + ", intitule=" + intitule
				+ ", solde=" + solde;
	}
	
	@Override
	public Double consulteSolde(){
		return this.getSolde();
	}
	
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getIntitule() {
		return intitule;
	}

	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}

	public Double getSolde() {
		return solde;
	}

	public void setSolde(Double solde) {
		this.solde = solde;
	}


}
