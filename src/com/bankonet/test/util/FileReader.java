package com.bankonet.test.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

import org.apache.commons.lang.exception.ExceptionUtils;
import org.apache.logging.log4j.LogManager;

public class FileReader {
	
	private static final org.apache.logging.log4j.Logger logger = LogManager.getLogger();

	public static String simpleReadTextFile(String filepath){
		
		logger.info("lecture simple du fichier "+filepath);
		
		File file = new File(filepath);
		
		try(FileInputStream fis 	= new FileInputStream(file);
			InputStreamReader isr 	= new InputStreamReader(fis);
			BufferedReader br  		= new BufferedReader(isr);
			) {
			
			StringBuilder sb = null;
			
			String readLine = null;
			
			while ((readLine = br.readLine()) != null) {
				
				sb.append(readLine).append("\n");
			}
			
			logger.info("Simple read text file done.");
			
			return sb.toString();
			
		} catch (Exception e) {
			logger.error("Error while reading file : " + filepath);

			logger.error(ExceptionUtils.getFullStackTrace(e));
			
			return null;
		}
	}
	
	
	
}
