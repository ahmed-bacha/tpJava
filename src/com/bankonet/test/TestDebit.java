package com.bankonet.test;

import org.junit.Assert;
import org.junit.Test;

import com.backonet.domain.CompteCourant;
import com.backonet.domain.CompteEpargne;
import com.backonet.exception.DebitException;

public class TestDebit {
	
	@Test
	public void testDebitCompteEpargneOK(){
		
		CompteEpargne ce = new CompteEpargne("CE1","CE1",1000.0,1.5,10000.0);
		
		try {
			ce.debiter(900.0);
		} catch (DebitException e) {
			Assert.fail();
		}
		
		Assert.assertEquals((Double)100.0, ce.getSolde());
		
	}
	
	@Test
	public void testDebitCompteEpargneNotOK(){
		
		CompteEpargne ce = new CompteEpargne("CE1","CE1",1000.0,1.5,10000.0);
		
		try {
			
			ce.debiter(1100.0);
	
			Assert.fail();
			
		} catch (DebitException e) {
			
			Assert.assertEquals((Double)1000.0, ce.getSolde());
		}
		
	}
	
	@Test
	public void testDebitCompteCourantOK(){
		
		CompteCourant cc = new CompteCourant("CC1","CC1", 1000.0, 200.0);
		
		try {
			
			cc.debiter(900.0);
	
		} catch (DebitException e) {
			
			Assert.fail();
		}
		
		Assert.assertEquals((Double)100.0, cc.getSolde());
		
	}
	
	@Test
	public void testDebitCompteCourantNotOK(){
		
		CompteCourant cc = new CompteCourant("CC1","CC1", 1000.0, 200.0);
		
		try {
			
			cc.debiter(1500.0);
	
			Assert.fail();
			
		} catch (DebitException e) {
			
			Assert.assertEquals((Double)1000.0, cc.getSolde());
		}
		
	}
	
	@Test
	public void testDebitCompteCourantOkAvecDecouvert() {
		
		CompteCourant cc = new CompteCourant("CC1","CC1", 1000.0, 200.0);
		
		try {
			
			cc.debiter(1100.0);
	
			
			
		} catch (DebitException e) {
			
			Assert.fail();
		}
		
		Assert.assertEquals(-100.0D, cc.getSolde(),0.001);
	}


}
