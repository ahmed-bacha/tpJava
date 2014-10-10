package com.bankonet.test;

import com.backonet.exception.BusinessException;
import com.backonet.util.TestExceptionUtil;

public class TestException {

	public static void main(String[] args) {
	
		try {
			TestExceptionUtil.effectuerTraitement(5);
			
			TestExceptionUtil.effectuerTraitement(15);
			
		} catch (BusinessException e) {
			
			System.out.println(e.getMessage());
		}
		
		
		TestExceptionUtil.effectuerTraitement2(5);
		
		TestExceptionUtil.effectuerTraitement2(15);
	}
}
