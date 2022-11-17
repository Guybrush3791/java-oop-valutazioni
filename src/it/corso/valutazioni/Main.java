package it.corso.valutazioni;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		Studente[] studenti = new Studente[20];
		
		int passStudentCounter = 0;
		for (int x=0;x<20;x++) {
			
			int rndPerc = rnd.nextInt(101);
			int rndRating = rnd.nextInt(6);
			
			Studente s = new Studente(x + 1, rndPerc, rndRating);
			studenti[x] = s;
			
			boolean isPass = s.isPass();
			if (isPass) {
			
				passStudentCounter++;
			}			
			
			System.out.println(s.getId() + ": " + isPass);
		}
		
		System.out.println("---------------------");
		System.out.println("Numero studenti promossi: " + passStudentCounter);
	}
}
