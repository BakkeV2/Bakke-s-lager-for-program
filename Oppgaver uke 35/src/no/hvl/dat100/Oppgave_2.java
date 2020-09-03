package no.hvl.dat100;

public class Oppgave_2 {

	public static void main(String[] args) {
		String diameter = javax.swing.JOptionPane.showInputDialog("Diameter til kulen");
		int d = Integer.parseInt(diameter);
		
		double r = d / 2;
		double y = Math.pow(r, 3);
		double z = 4.0 / 3.0;
		double v = z * Math.PI * y;
		
		String x = String.valueOf(v);
		
		String volum = x + " m^3";
		javax.swing.JOptionPane.showMessageDialog(null, volum);
		
		
	
		
	}

}
