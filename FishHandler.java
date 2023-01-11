/*
 * File name: FishHandler.java
 * Author: Bing Xie,041069827
 * Course: CST8284-OOP
 * Assignment: Assignment 02
 * Date: 2022-11-24
 * Professor: Daniel Cormier
 */
/**
 * This class is used to practice exception throw
 * 
 * @author Bing Xie
 * @version 1.0
 * @since javac 11.0.15
 */

public class FishHandler {
	/**
	 * 
	 * @throws IllegalArgumentException a type of exception
	 */
	public void easterEnding() throws IllegalArgumentException {
		throw new IllegalArgumentException("Exception through in easterEnding");
	}

	/**
	 * method to catch an exception and rethrow it
	 */
	public void easterStarting() {
		try {
			easterEnding();
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage() + "\n");
			throw e;
		}
	}
	/**
	 * 
	 * @param args command line argument
	 */
	public static void main(String[] args) {
		FishHandler test = new FishHandler();
		/**
		 * catch the rethrown exception in main
		 */
		try {
			test.easterStarting();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
	}

}
