package com.backonet.domain;

public enum TypeCompte {
	
	COMPTE_EPARGNE("Compte Epargne"),
	COMPTE_COURANT("Compte Courant");
	
	private String label;
	
	private TypeCompte(String label){
		this.label = label;
	}
	
	public String toString(){
		return this.label;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}
	
	
}
