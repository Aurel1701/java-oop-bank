package com.banca;


import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Come ti chiami?");
		
		String nomeConto = sc.next();
		
		int contoRandom = (int) (Math.random() * 1000 + 1);
		
		int scelta;
		
		Conto c = new Conto(contoRandom, nomeConto);
		do {	
			System.out.println("1:Prelevare \n 2:Versare \n 3:Uscire");
		
		 scelta = sc.nextInt();
		
		 switch (scelta) {
		 case 1:
			 System.out.println("quanto vuoi prelevare?");
			 double sommaPresa = sc.nextDouble();
			 double check = c.prelevare(sommaPresa);
			 if(check == -1) System.out.println("non puoi prelevare questa cifra");
			 else System.out.println(c.toString());
			 break;
		 case 2:
			 System.out.println("quanto vuoi versare?");
			 double sommaVersata = sc.nextDouble();
			 c.versamento(sommaVersata);
			System.out.println(c.toString());
			 break;
		 case 3:
			 System.out.println("Grazie e arrivederci");
			 break;

		default:
			System.out.println("scelta non valida");
			break;
		}
		
			
		} while (scelta !=3);
	
		
		
		

	}

}
