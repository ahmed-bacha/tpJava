package com.bankonet.test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class TestCopyFile {
	
	public static void main(String[] args) {
		File srcFile = new File("/Users/ahmed/Documents/fileTest.txt.rtf");
		File destFile = new File("/Users/ahmed/Documents/fileTest2.txt.rtf");
		
		try {
			System.out.println("En cours de copie ...");
			
			FileUtils.copyFile(srcFile, destFile);
			
			System.out.println("Well done!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
