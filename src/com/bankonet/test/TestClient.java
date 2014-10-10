package com.bankonet.test;

import com.backonet.domain.Client;
import com.backonet.domain.CompteCourant;
import com.backonet.domain.CompteEpargne;

public class TestClient {

	public static void main(String[] args) {
		Client[] tabClients = new Client[3];

		for (int i = 0; i < tabClients.length; i++) {

			CompteCourant cc = new CompteCourant();
			cc.setSolde(1000D);
			cc.setIntitule("Compte Courant" + i);
			cc.setNumero("cc" + i);
			cc.setMontantDecouvertAutorise(1000D);

			CompteEpargne ce = null;
			
			if (i != (tabClients.length - 1)) {
				ce = new CompteEpargne();
				ce.setSolde(1000D);
				ce.setIntitule("Compte Courant" + i);
				ce.setNumero("cc" + i);
				ce.setTauxInteret(1.5D);
			}

			Client c = new Client("id" + i, "nom" + i, "prenom" + i, cc, ce);
			tabClients[i] = c;
		}

		for (Client c : tabClients) {
			System.out.println(c);
		}

	}
}
