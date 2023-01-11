import java.io.IOException;

/*
 * File name: DogHandler.java
 * Author: Bing Xie,041069827
 * Course: CST8284-OOP
 * Assignment: Assignment 02
 * Date: 2022-11-24
 * Professor: Daniel Cormier
 */
/**
 * This class is used to practice to catch subclass exceptions by superclass
 * exception.
 * 
 * @author Bing Xie
 * @version 1.0
 * @since javac 11.0.15
 */

public class DogHandler {
	/**
	 * define a subclass exception ExceptionDog extends exception
	 *
	 */

	public class ExceptionDog extends Exception {

	}

	/**
	 * define a subclass exception ExceptionPuppy extends ExceptionDog
	 *
	 */
	public class ExceptionPuppy extends ExceptionDog {

	}

	/**
	 * 
	 * @throws ExceptionPuppy self defined exception extends ExceptionDog
	 */
	public void ThrowTest1() throws ExceptionPuppy {
		throw new ExceptionPuppy();
	}

	/**
	 * 
	 * @throws ExceptionDog self defined exception extends Exception
	 */
	public void ThrowTest2() throws ExceptionDog {
		throw new ExceptionDog();
	}

	/**
	 * 
	 * @throws NullPointerException a type of exception
	 */
	public void ThrowTest3() throws NullPointerException {
		throw new NullPointerException();
	}

	/**
	 * 
	 * @throws IOException a type of exception
	 */
	public void ThrowTest4() throws IOException {
		throw new IOException();
	}

	/**
	 * 
	 * @param args command line argument
	 */
	public static void main(String[] args) {
		DogHandler handler = new DogHandler();

		try {
			handler.ThrowTest1();
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			handler.ThrowTest2();
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			handler.ThrowTest3();
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			handler.ThrowTest4();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
