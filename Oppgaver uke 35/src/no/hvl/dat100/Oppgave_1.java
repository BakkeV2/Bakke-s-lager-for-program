package no.hvl.dat100;

public class Oppgave_1 {

	public static void main(String[] args) {

		String pris1 = javax.swing.JOptionPane.showInputDialog("Pris på første produkt");
		int a = Integer.parseInt(pris1);
		
		String pris2 = javax.swing.JOptionPane.showInputDialog("Pris på andre produkt");
		int b = Integer.parseInt(pris2);
		
		String betalt = javax.swing.JOptionPane.showInputDialog("Betaler med");
		int x = Integer.parseInt(betalt);
		
		int c = a + b;
		int d = 10;
		int m = x - c;
		int e = m / d;
		int f = m - e * d;
		
		String y = Integer.toString(e);
		String z = Integer.toString(f);		
		
		String tikroner = y + " Tikroninger og ";
		String enkroner = z + " Enkroninger";
		
		String pengertilbake = tikroner + enkroner;
		javax.swing.JOptionPane.showMessageDialog(null, "Penger tilbake " + pengertilbake);
		
		
		
	}

}
