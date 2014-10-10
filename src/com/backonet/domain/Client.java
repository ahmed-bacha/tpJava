package com.backonet.domain;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Client {
	
	private String identifiant;
	
	private String nom;
	
	private String prenom;
	
	private Map<String , Compte> comptesMap;
	
	
	public Client(String identifiant, String nom, String prenom) {
		super();
		
		this.identifiant = identifiant;
		
		this.nom = nom;
		
		this.prenom = prenom;
		
		this.comptesMap = new HashMap<>();
	}


	public Client() {
		super();
	}

	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("Client [identifiant="+identifiant+", pernom="+prenom+", nom=" + nom + ", nbrComptes= "+this.getNbComptes()+ ", NbCC= "+this.getNbCompteCourant()+", NbCE="+this.getNbCompteEpargne()+ "]");
		
		sb.append(" Avoir Global : ").append(this.calculerAvoirGlobal());
		
		return sb.toString();
	}
	
	
	public Double calculerAvoirGlobal(){
		
		Double total = 0.0;
		
		for(Compte compte : this.getComptes()){
			
			total += compte.getSolde();
			
		}
		return total;
	}
	
	public Integer getNbComptes(){
		
		return this.comptesMap.size();
	}
	
	private Integer getNbComptesForType(TypeCompte typeCompte){
		
		Integer result = 0;
		
		for(Compte compte : this.getComptes()){
			
			if(compte.getTypeCompte() == typeCompte){
				result++;
			}
		}
		return result;
	}
	
	public Integer getNbCompteCourant(){
		
		return this.getNbComptesForType(TypeCompte.COMPTE_COURANT);
	}
	
	public Integer getNbCompteEpargne(){
		
		return this.getNbComptesForType(TypeCompte.COMPTE_EPARGNE);
	}
	
	public void ajouterCompte(Compte compte){
		
		this.comptesMap.put(compte.getNumero(), compte);
		
	}
	
	public void supprimerCompte(Compte compte){
		
		this.comptesMap.remove(compte.getNumero());
		
	}
	
	public Compte retrouverCompte(String numero){
		
		Compte result = this.comptesMap.get(numero);
	
		return result;
		
	}

	public void supprimerCompte(String numero){
	
		this.comptesMap.remove(numero);
	}
	
	public Collection<Compte> getComptes() {
		return this.comptesMap.values();
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



	

}
