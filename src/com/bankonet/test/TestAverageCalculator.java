package com.bankonet.test;

import org.apache.logging.log4j.LogManager;

import com.backonet.batch.AverageCalculator;
import com.backonet.util.SoldeConsultable;
import com.bankonet.test.util.TestDataProvider;

public class TestAverageCalculator {
	
	private static final org.apache.logging.log4j.Logger logger = LogManager.getLogger();
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SoldeConsultable[] testData = TestDataProvider.buildSoldeConsultableData();
		logger.info("Average 1 : "+(AverageCalculator.calculateAverage(testData)));
		
		SoldeConsultable[] testData2 = TestDataProvider.buildSoldeConsultableDataSecondSet();
		logger.info("Average 2 : "+(AverageCalculator.calculateAverage(testData2)));
		
		logger.error("No one !");
	
		

	}

}
