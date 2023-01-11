import java.io.IOException;

/*
 * File name: OrderHandler.java
 * Author: Bing Xie,041069827
 * Course: CST8284-OOP
 * Assignment: Assignment 02
 * Date: 2022-11-24
 * Professor: Daniel Cormier
 */
/**
 * This class is used to practice order of exception catching
 * 
 * @author Bing Xie
 * @version 1.0
 * @since javac 11.0.15
 */
public class OrderHandler {
	
	/**
	 * 
	 * @param args command line argument
	 */
	public static void main(String[] args) {
		Exception supperClassException=new Exception();
		IOException subClassException=new IOException();
		try {
			throw subClassException;
		} catch (IOException newioe) {
			System.out.println("catch subclass exception ");
			newioe.printStackTrace();
		} catch (Exception e) {
			//didn't catch this one because sub class was throw before superclass exception.
			System.out.println("second to catch the superclass exeception"); 
			e.printStackTrace();
		}
		
		/*new try and catch to show above no compilation error.*/
		try {
			throw new Exception();
		}catch(IOException e) {
			System.out.println("retry catch subclass exception ");
			e.printStackTrace();
		}catch(Exception e) {
			System.out.println(" retry second to catch the superclass exeception");
			e.printStackTrace();
		}
		
	}

}
