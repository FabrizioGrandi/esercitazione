package it.evento.calendario;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Inserisci il nome ");

	    String nome = myObj.nextLine();  // Read user input
	    System.out.println("Il nome é " + nome);
	    
	    System.out.println("Inserisci la descrizione ");

	    String descrizione = myObj.nextLine();  // Read user input
	    System.out.println("La descrizione " + descrizione);
	    
	    System.out.println("Inserisci il giorno ");

	    int giorno = myObj.nextInt();  // Read user input
	    System.out.println("Il giorno " + giorno);
	    
	    System.out.println("Inserisci il mese ");

	    int mese = myObj.nextInt();  // Read user input
	    System.out.println("Il mese é " + mese);
	    
	    System.out.println("Inserisci l'anno ");

	    int anno = myObj.nextInt();  // Read user input
	    System.out.println("L'anno é " + anno);
	    
	    System.out.println(nome+""+descrizione+""+""+giorno+""+""+mese+""+""+anno);
	    Calendario calendario = new Calendario(nome, descrizione);
	    Evento evento = new Evento("Franco","Stadio",12,8,2023);
	    
	    calendario.addEvento(evento);
	    System.out.println();
	    
	    
	}

}
