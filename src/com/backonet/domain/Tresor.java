package com.backonet.domain;

import com.backonert.constants.Constants;
import com.backonet.util.SoldeConsultable;

public class Tresor implements SoldeConsultable {

	private Integer nbGoldenPieces;
	
	public Tresor(Integer nbGoldenPieces) {
		
		this.nbGoldenPieces = nbGoldenPieces;
	}
	
	@Override
	public Double consulteSolde() {
		return this.nbGoldenPieces * Constants.GOLD_RATE;
	}

	public Integer getNbGoldenPieces() {
		return nbGoldenPieces;
	}

	public void setNbGoldenPieces(Integer nbGoldenPieces) {
		this.nbGoldenPieces = nbGoldenPieces;
	}
}
