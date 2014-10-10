package com.bankonet.test;

import com.backonet.batch.AverageCalculator;
import com.backonet.util.SoldeConsultable;
import com.bankonet.test.util.TestDataProvider;

public class TestAverageCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SoldeConsultable[] testData = TestDataProvider.buildSoldeConsultableData();
		System.out.println("Average 1 : "+(AverageCalculator.calculateAverage(testData)));
		
		SoldeConsultable[] testData2 = TestDataProvider.buildSoldeConsultableDataSecondSet();
		System.out.println("Average 2 : "+(AverageCalculator.calculateAverage(testData2)));
	
		

	}

}
