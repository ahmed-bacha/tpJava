package com.backonet.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.exception.ExceptionUtils;
import org.apache.logging.log4j.LogManager;

public class FileReader {
	
	private static final org.apache.logging.log4j.Logger logger = LogManager.getLogger();

	public static String simpleReadTextFile(String filepath){
		
		logger.info("Simple Read text file "+filepath);
		
		File file = new File(filepath);
		
		try(FileInputStream fis 	= new FileInputStream(file);
			InputStreamReader isr 	= new InputStreamReader(fis);
			BufferedReader br  		= new BufferedReader(isr);) {
			
			StringBuilder sb = new StringBuilder();
			
			String readLine = null;
			
			boolean isFirstLine = true;
			
			while ((readLine = br.readLine()) != null) {
				
				if (!isFirstLine) {
					sb.append("\n");
				}
				
				sb.append(readLine);
				
				isFirstLine = false;
			}
			
			logger.info("Simple read text file done.");
			
			return sb.toString();
			
		} catch (Exception e) {
			logger.error("Error while reading file : " + filepath);

			logger.error(ExceptionUtils.getFullStackTrace(e));
			
			return null;
		}
	}
	
	
	
	public static String advancedReadTextFile(String filepath){
		
		logger.info("Advanced read text file "+filepath);
		
		try {
			
			File file = new File(filepath);
			
			String result = FileUtils.readFileToString(file);
			
			logger.info("Advanced read text file done");
			
			return result;
			
		} catch (Exception e) {
			
			logger.error("Error while reading file : " + filepath);

			logger.error(ExceptionUtils.getFullStackTrace(e));
			
			return null;
		}
	
	}
	
	
}
