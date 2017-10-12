package com.run.script;

import java.io.File;

public class GetFileList {

	public static void main(String[] args) {
	
		File folder = new File("/home/karla/Documents/rfiles/scripts/Scripts/A");
		File[] listOfFiles = folder.listFiles();

		    for (int i = 0; i < listOfFiles.length; i++) {
		      if (listOfFiles[i].isFile()) {
		        System.out.println("File " + listOfFiles[i].getAbsolutePath());
		      } else if (listOfFiles[i].isDirectory()) {
		        System.out.println("Directory " + listOfFiles[i].getName());
		      }
		    }
	}
	
}
