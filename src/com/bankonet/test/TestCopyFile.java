package com.bankonet.test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;

public class TestCopyFile {
	
	private static final org.apache.logging.log4j.Logger logger = LogManager.getLogger();
	
	public static void main(String[] args) {
		File srcFile = new File("/Users/ahmed/Documents/fileTest.txt.rtf");
		File destFile = new File("/Users/ahmed/Documents/fileTest2.txt.rtf");
		
		try {
			logger.info("En cours de copie ...");
			
			FileUtils.copyFile(srcFile, destFile);
			
			logger.info("Well done!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
