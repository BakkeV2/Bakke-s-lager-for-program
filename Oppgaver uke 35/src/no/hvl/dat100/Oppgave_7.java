package no.hvl.dat100;

public class Oppgave_7 {

	public static void main(String[] args) {
		

		for (int i = 0; i <= 9; i++) {
		
		String poeng = javax.swing.JOptionPane.showInputDialog("Poeng på prøven");
		int a = Integer.parseInt(poeng);
		
		//Karakterer
		if ( 0 <= a && a <= 39 ) {
			System.out.println("Karakter F");
		} else {
			
			if ( 40 <= a && a <= 49) {
				System.out.println("Karakter E");
			} else {
				
				if (50 <= a && a <= 59) {
					System.out.println("Karakter D");
				} else {
					
					if (60 <= a && a <= 79) {
						System.out.println("Karakter C");
					} else {
						
						if (80 <= a && a <= 89) {
							System.out.println("Karakter B");
						} else {
							
							if (90 <= a && a <= 100) {
								System.out.println("Karakter A");
							} else {
								
								//Om de skriver utenfor "0-100" må de prøve igjen.
								if (a < 0 || a > 100) {
									String poeng2 = javax.swing.JOptionPane.showInputDialog("Skriv poeng på prøven på nytt (0-100)");
									int b = Integer.parseInt(poeng2);
									
									if ( 0 <= b && b <= 39 ) {
										System.out.println("Karakter F");
									} else {
										
										if ( 40 <= b && b <= 49) {
											System.out.println("Karakter E");
										} else {
											
											if (50 <= b && b <= 59) {
												System.out.println("Karakter D");
											} else {
												
												if (60 <= b && b <= 79) {
													System.out.println("Karakter C");
												} else {
													
													if (80 <= b && b <= 89) {
														System.out.println("Karakter B");
													} else {
														
														if (90 <= b && b <= 100) {
															System.out.println("Karakter A");
										
}}}}}}}}}}}}}}
}}
