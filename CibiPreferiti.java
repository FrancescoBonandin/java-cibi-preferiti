package org.lessons.java.array;

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
		
		String[] favouriteFood = {"pizza", "pasta", "sushi", "patatine", "pane"} ;
		
		System.out.println(favouriteFood.length);
		System.out.println(favouriteFood[0]);
		System.out.println(favouriteFood[favouriteFood.length-1]);

	}

}
