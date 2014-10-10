package com.backonet.util;

import com.backonert.constants.Constants;
import com.backonet.exception.BusinessException;
import com.backonet.exception.TechnicalException;

public class TestExceptionUtil {
	
	public static void effectuerTraitement(int number) throws BusinessException{
		
		if(number <= Constants.MAX_ITERATION){
			for (int i = 0; i < number; i++) {
				System.out.println("traitement N0 : "+i);
			}
		}else{
			throw new BusinessException(Constants.MAX_ITERATION_EXCEEDED + number);
		}
	}
	
	
	public static void effectuerTraitement2(int number){
		
		if(number <= Constants.MAX_ITERATION){
			for (int i = 0; i < number; i++) {
				System.out.println("traitement N0 : "+i);
			}
		}else{
			throw new TechnicalException(Constants.MAX_ITERATION_EXCEEDED + number);
		}
	}

}
