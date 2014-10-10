package com.backonet.domain;

import java.util.Collection;
import java.util.HashSet;

public class Client {
	
	private String identifiant;
	
	private String nom;
	
	private String prenom;
	
	private Collection<Compte> comptes;
	
	
	public Client(String identifiant, String nom, String prenom) {
		super();
		
		this.identifiant = identifiant;
		
		this.nom = nom;
		
		this.prenom = prenom;
		
		this.comptes = new HashSet<Compte>();
	}


	public Client() {
		super();
	}

	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("Client [identifiant="+identifiant+", pernom="+prenom+", nom=" + nom + ", nbrComptes= "+this.comptes.size()+ " ]");
		
		sb.append(" Avoir Global : ").append(this.calculerAvoirGlobal());
		
		return sb.toString();
	}
	
	
	public Double calculerAvoirGlobal(){
		
		Double total = 0.0;
		
		for(Compte compte : this.comptes){
			
			total += compte.getSolde();
			
		}
		return total;
	}
	
	public void ajouterCompte(Compte compte){
		
		this.comptes.add(compte);
		
	}
	
	public void supprimerCompte(Compte compte){
		
		this.comptes.remove(compte);
		
	}
	
	public Compte retrouverCompte(String numero){
		
		Compte result = null;
		
		for(Compte compte : comptes){
			
			if(compte.getNumero().equals(numero)){
				result = compte;
				break;
			}
		}
		
		return result;
		
	}

	public void supprimerCompte(String numero){
	
			Compte compte = this.retrouverCompte(numero);
			
			if(compte != null ){
				
				this.supprimerCompte(compte);
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


	public Collection<Compte> getComptes() {
		return comptes;
	}



	

}
