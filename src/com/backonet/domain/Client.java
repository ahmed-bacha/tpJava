package com.backonet.domain;

public class Client {
	
	private String identifiant;
	private String nom;
	private String prenom;
	private CompteCourant compteCourant;
	private CompteEpargne compteEpargne;
	
	
	public Client(String identifiant, String nom, String prenom,
			CompteCourant compteCourant, CompteEpargne compteEpargne) {
		super();
		this.identifiant = identifiant;
		this.nom = nom;
		this.prenom = prenom;
		this.compteCourant = compteCourant;
		this.compteEpargne = compteEpargne;
	}


	public Client() {
		super();
	}

	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("Client [identifiant="+identifiant+", pernom="+prenom+", nom=" + nom
				+", compteCourant="+compteCourant+", compteEpargne="+compteEpargne+"]");
		
		sb.append("Avoir Global : ").append(this.calculerAvoirGlobal());
		
		return sb.toString();
	}
	
	
	public Double calculerAvoirGlobal(){
		
		if(this.compteCourant != null && this.compteEpargne != null){
			return this.compteCourant.getSolde() + this.compteEpargne.getSolde();
		}else if (this.compteCourant != null) {
			return this.compteCourant.getSolde();
		}else if (this.compteEpargne != null) {
			return this.compteEpargne.getSolde();
		}else{
			return 0D;
		}
		
	}

	public String getIdentifiant() {
		return identifiant;
	}


	public void setIdentifiant(String identifiant) {
		this.identifiant = identifiant;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public CompteCourant getCompteCourant() {
		return compteCourant;
	}


	public void setCompteCourant(CompteCourant compteCourant) {
		this.compteCourant = compteCourant;
	}


	public CompteEpargne getCompteEpargne() {
		return compteEpargne;
	}


	public void setCompteEpargne(CompteEpargne compteEpargne) {
		this.compteEpargne = compteEpargne;
	}


	

}
