package com.bankonet.test;

import org.apache.logging.log4j.LogManager;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.backonet.util.FileReader;

public class TestFile {

	private static final org.apache.logging.log4j.Logger logger = LogManager.getLogger();
	
	@BeforeClass
	public static void initGlobal(){
		 
		logger.info("Init global ...");
		
		logger.info("Init global done.");
	}
	
	@Before
	public void init(){
		
		logger.info("Init test ...");
		
		logger.info("Init test done.");
	}
	

	@Test
	public void testSimpleReadTextFile(){
		
		logger.info("Test simpleReadTextFile ...");
		
		String fichier1Content = FileReader.simpleReadTextFile("/Users/ahmed/Documents/Hello2.txt");
		
		logger.info(fichier1Content);
		
		Assert.assertEquals("Hello from J//Academie", fichier1Content);
		
		logger.info("Testing simpleReadTextFile done ! ");
		
	}
	
	
	@Test
	public void testAdvancedReadTextFile(){
		
		logger.info("Test advancedReadTextFile ...");
		
		String fichier1Content = FileReader.advancedReadTextFile("/Users/ahmed/Documents/Hello2.txt");
		
		logger.info(fichier1Content);
		
		Assert.assertEquals("Hello from J//Academie", fichier1Content);
		
		logger.info("Testing advancedReadTextFile done ! ");
		
	}
	

}
