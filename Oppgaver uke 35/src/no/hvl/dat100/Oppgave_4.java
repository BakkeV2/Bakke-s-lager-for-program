package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class Oppgave_4 {

public static void main(String[] args) {
		
		String brukernavn = showInputDialog("Brukernavn :");

		String passord = showInputDialog("Passord :");
		
		String a = "Bakke";
		String b = "123";
		
		if (brukernavn.equals(a) && passord.equals(b)) {
		System.out.println(brukernavn);
		System.out.println(passord);}
		else {showMessageDialog(null, "Brukernavn eller passord er ikke godkjent"); }
		
	}

}