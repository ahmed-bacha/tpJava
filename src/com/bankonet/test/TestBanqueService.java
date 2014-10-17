package com.bankonet.test;

import org.apache.logging.log4j.LogManager;

import com.backonet.batch.AverageCalculator;
import com.backonet.service.BanqueService;
import com.backonet.service.ServiceFactory;

public class TestBanqueService {

	private static final org.apache.logging.log4j.Logger logger = LogManager.getLogger();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BanqueService banqueService = ServiceFactory.getBanqueService();
		
		logger.info(banqueService.calculerFonds(1));

	}

}
