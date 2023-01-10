package it.me.tv1;



import java.util.InputMismatchException;
import java.util.Scanner;

import org.apache.log4j.Logger;

public class TV {
	
	final static Logger logger = Logger.getLogger(TV.class);
	
	public static void main(String[] args) {
		TV tv = new TV();
		tv.setCan();
	}
	
	public void logCan() {
		String canale= "";
		Scanner scanner = new Scanner(System.in);
		System.out.println("INSERISCI CANALE");
        try {
			canale = scanner.next();
			scanner.close();
			logger.info("Il canale inserito é: " + canale);
		} catch (InputMismatchException inputMismatchException) {
			logger.error("Input Mismatch error", inputMismatchException);
		}
	}
	
	public void setCan() {
		String canale= "";
		Scanner scanner = new Scanner(System.in);
		System.out.println("INSERISCI  CANALE");
        try {
			canale = scanner.next();
			scanner.close();
			logger.info("Canale settato: " + canale);
		} catch (InputMismatchException inputMismatchException) {
			logger.error("Input Mismatch error", inputMismatchException);
		}
	}

}
