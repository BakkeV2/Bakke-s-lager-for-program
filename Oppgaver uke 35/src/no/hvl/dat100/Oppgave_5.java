package no.hvl.dat100;

public class Oppgave_5b {
	
	public static void main(String[] args) {
		
		String foerste = javax.swing.JOptionPane.showInputDialog("Tall nr.1 ");
		int a = Integer.parseInt(foerste);
		
		String andre = javax.swing.JOptionPane.showInputDialog("Tall nr.2 ");
		int b = Integer.parseInt(andre);
		
		String tredje = javax.swing.JOptionPane.showInputDialog("Tall nr.3 ");
		int c = Integer.parseInt(tredje);
		
		if ( a < b && b < c) {
			String vises = "Tallene er stigende rekkefølge: " + a + b + c;
			javax.swing.JOptionPane.showMessageDialog(null,  vises);
		}
		if ( a < c && c < b) {
			String vises = "Tallene er stigende rekkefølge: " + a + c + b;
			javax.swing.JOptionPane.showMessageDialog(null,  vises);
		}	
		if ( b < a && a < c) {
			String vises = "Tallene er stigende rekkefølge: " + b + a + c;
			javax.swing.JOptionPane.showMessageDialog(null,  vises);
		}	
		if ( b < c && c < a) {
			String vises = "Tallene er stigende rekkefølge: " + b + c + a;
			javax.swing.JOptionPane.showMessageDialog(null,  vises);
		}
		if ( c < a && a < b) {
			String vises = "Tallene er stigende rekkefølge: " + c + a + b;
			javax.swing.JOptionPane.showMessageDialog(null,  vises);
		}
		if ( c < b && b < a) {
			String vises = "Tallene er stigende rekkefølge: " + c + b + a;
			javax.swing.JOptionPane.showMessageDialog(null,  vises);
		}
	}
}
