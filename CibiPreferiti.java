package org.lessons.java.array;

import java.util.Arrays;
import java.util.Random;

// Todo
//Nel progetto` java-cibi-preferiti` aggiungete la classe `CibiPreferiti` nel package `org.lessons.java.array` col suo metodo `main`.
//Nel programma inizializzate un array (con i metodi visti a lezione) con la classifica dei vostri cibi preferiti (minimo 5, massimo 10 elementi).
//
//Stampate poi a video:
//- la lunghezza della classifica
//- il vostro cibo top (prima posizione della classifica)
//- il vostro cibo preferito ma non troppo (ultima posizione della classifica)

public class CibiPreferiti {

	public static void main(String[] args) {
		
		String[] favouriteFood1 = {"pizza", "pasta", "sushi", "patatine", "pane"} ;
		
		System.out.println("lunghezza classifica:" + favouriteFood1.length);
		System.out.println("Top of the top foods: " + favouriteFood1[0]);
		System.out.println("Bottom of the top foods: " + favouriteFood1[favouriteFood1.length-1]);
		
		
		
		System.out.println("\n ");

		//--------BONUS-----------
		System.err.println("**BONUS**");
		String [] favouriteFood2 = {"pizza", "pasta", "sushi", "patatine", "pane", "arrosto"} ;
		
		Random rnd = new Random() ;
		boolean randBoolValue=rnd.nextBoolean();
		
		String[] chosenArray = randBoolValue ? favouriteFood1 : favouriteFood2;		
		
		System.out.println("l'array scelto ha lunghezza: " + chosenArray.length + " ed è composto da questi elementi" + Arrays.toString(chosenArray));
			
		if(chosenArray.length %2 == 0) {
			
			 System.out.println("The middle elements are: ");
		         
	         //	Pari
	         String leftMediumValue = chosenArray[(chosenArray.length/2) - 1];
	         System.out.println(leftMediumValue);
	         String rightMediumValue = chosenArray[chosenArray.length/2];
	         System.out.println(rightMediumValue);
		}
		
		else {
			//	Dispari	
			
			System.out.println("The middle element is: ");
			String mediumValue = chosenArray[chosenArray.length/2];
			System.out.println(mediumValue);
			
		}
		
	}

}
