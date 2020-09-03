package no.hvl.dat100;

public class Oppgave_3 {

	public static void main(String[] args) {
		String verdi_a = javax.swing.JOptionPane.showInputDialog("Verdi du vil dele på");
		int a = Integer.parseInt(verdi_a);
		
		String verdi_b = javax.swing.JOptionPane.showInputDialog("Verdi du vil dele med");
		int b = Integer.parseInt(verdi_b);
		
		int c = 0;
				
		if (b == 0) {
			javax.swing.JOptionPane.showMessageDialog(null, "Kan ikke dele med 0"); 
		} else {
			if (b != 0) {
				c = a/b;
				javax.swing.JOptionPane.showMessageDialog(null, "Svaret er " + c);
			}
		}	
	
	}

}
