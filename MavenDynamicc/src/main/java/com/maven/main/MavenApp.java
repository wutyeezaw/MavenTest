package com.maven.main;

import java.io.File;



public class MavenApp {
	

	
	public static void main() {
		MavenApp  mavenapp = new MavenApp();
		mavenapp.greetMe("Hello Maven!");
		
//		File file = new File("D:\\");
//		file.exists();
		
	}

	/**
	 * greetMe return your greeting word.
	 * @param String
	 */

	public String greetMe(String greet) {

		return greet;
	}

	/**
	 * Validation null or empty for object.
	 */
	public static boolean isNullOrEmpty(Object obj) {
		if (obj == null) {
			return true;
		}
		if (obj instanceof String) {
			// obj is a String
			if (((String) obj).length() == 0) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
}
