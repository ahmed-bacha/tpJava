package com.bankonet.test;

import org.apache.logging.log4j.LogManager;

import com.backonet.exception.BusinessException;
import com.backonet.util.TestExceptionUtil;

public class TestException {
	
	private static final org.apache.logging.log4j.Logger logger = LogManager.getLogger();

	public static void main(String[] args) {
	
		try {
			TestExceptionUtil.effectuerTraitement(5);
			
			TestExceptionUtil.effectuerTraitement(15);
			
		} catch (BusinessException e) {
			
			logger.info(e.getMessage());
		}
		
		
		TestExceptionUtil.effectuerTraitement2(5);
		
		TestExceptionUtil.effectuerTraitement2(15);
	}
}
