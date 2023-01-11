/*
 * File name: CatHandler.java
 * Author: Bing Xie,041069827
 * Course: CST8284-OOP
 * Assignment: Assignment 02
 * Date: 2022-11-24
 * Professor: Daniel Cormier
 */
/**
 * This class holds inner classes and practice to catch exceptions of subclass.
 * 
 * @author Bing Xie
 * @version 1.0
 * @since javac 11.0.15
 */

public class CatHandler {

	/**
	 * define a new exception type ExceptionAlpha extends exception
	 *
	 */
	public class ExceptionAlpha extends Exception {

	}

	/**
	 * define an exception type ExceptionBeta extends ExceptionAlpha
	 *
	 */
	public class ExceptionBeta extends ExceptionAlpha {

	}

	/**
	 * define a new exception type ExceptionGammer extends ExceptionBeta
	 *
	 */
	public class ExceptionGammer extends ExceptionBeta {

	}

	/**
	 * @throws ExceptionGammer
	 */
	public void CatTest1() throws ExceptionGammer {
		throw new ExceptionGammer();
	}

	/**
	 * 
	 * @throws ExceptionBeta
	 */
	public void CatTest2() throws ExceptionBeta {
		throw new ExceptionBeta();
	}

	public static void main(String[] args) {
		CatHandler test = new CatHandler();

		try {
		test.CatTest1();
		} catch (ExceptionAlpha e) {
			System.out.println("Exception Gammer when call exception Alpha \n");

		}
		try {
		test.CatTest2();
		} catch (ExceptionAlpha e) {
			System.out.println("Exception Beta when call exception Alpha");

		}
	
	}

}
