package com.bankonet.test;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

import com.backonet.exception.MissingValueException;
import com.backonet.template.MoteurDeTemplate;

public class MoteurDeTemplateTest {
	
	@Test
	public void testMoteurDeTemplateWithOneVariable() throws MissingValueException{
		
		MoteurDeTemplate moteur = new MoteurDeTemplate("Bonjour ${prenom}");
		
		Map<String, String> context = new HashMap<>();
		context.put("prenom","Remy");
		
		Assert.assertEquals("Bonjour Remy", moteur.evaluate(context));
	}
	
	@Test
	public void testMoteurDeTemplateWithMultipleVariable() throws MissingValueException{
		
		MoteurDeTemplate moteur = new MoteurDeTemplate("Bonjour ${prenom} ${nom}");
		
		Map<String, String> context = new HashMap<>();
		context.put("prenom","Remy");
		context.put("nom","Girodon");
		
		Assert.assertEquals("Bonjour Remy Girodon", moteur.evaluate(context));
	}
	
	
	@Test
	public void testMoteurDeTemplateWithTooMuchVariable() throws MissingValueException{
		
		MoteurDeTemplate moteur = new MoteurDeTemplate("Bonjour ${prenom} ${nom}");
		
		Map<String, String> context = new HashMap<>();
		context.put("prenom","Remy");
		context.put("nom","Girodon");
		context.put("age","33");
		
		Assert.assertEquals("Bonjour Remy Girodon", moteur.evaluate(context));
	}
	
	@Test
	public void testMoteurDeTemplateWithMissingVariable() throws MissingValueException{
		
		MoteurDeTemplate moteur = new MoteurDeTemplate("Bonjour ${prenom} ${nom}, age : ${age}");
		
		Map<String, String> context = new HashMap<>();
		context.put("prenom","Remy");
		context.put("nom","Girodon");
		context.put("age","33");
		
		try{
			
			moteur.evaluate(context);
			
			Assert.fail();
			
		}catch(MissingValueException mss){
			
			Assert.assertTrue(true);
		}
		
	}

}
