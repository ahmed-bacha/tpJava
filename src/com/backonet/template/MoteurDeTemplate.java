package com.backonet.template;

import java.util.Map;

import org.apache.commons.lang.StringUtils;

import com.backonet.exception.MissingValueException;

public class MoteurDeTemplate {

	private String phrase;
	
	public MoteurDeTemplate(String p){
		this.phrase = p;
	}

	public String evaluate(Map<String, String> context) throws MissingValueException{
		
		String result = this.phrase;
		
		for(String key : context.keySet()){
			
			String decoratedVariable = "${"+key+"}";
			
			result = StringUtils.replace(result, decoratedVariable, context.get(key));
		}
		
		if(result.contains("${")){
			throw new MissingValueException();
		}
			
		return result;
	}
	
	
}
