package no.hvl.dat100;

public class Oppgave_6 {

	public static void main(String[] args) {
		
		String belop = javax.swing.JOptionPane.showInputDialog("Beløp");
		int a = Integer.parseInt(belop);
		
		double b = a;
		
		if (b <= 164100) {
			System.out.println("Inntekt " + b + "kr");
			System.out.println("skatt " + 0 + "kr");
		} else { 
			
			if (164101 <= b && b <= 230950) {
				double c = b * 0.0093;
				double d = b - c;
				double e = b - d;
				System.out.println("inntekt " + b + "kr");
				System.out.println("skatt " + e + "kr");
			} else {
				
			if (230951 <= b && b <= 580650) {
				double c = b * 0.0241;
				double d = b - c;
				double e = b - d;
				System.out.println("inntekt " + b + "kr");
				System.out.println("skatt " + e + "kr");
			} else {
				
			if (580651 <= b && b <= 934050) {
				double c = b * 0.1152;
				double d = b - c;
				double e = b - d;
				System.out.println("inntekt " + b + "kr");
				System.out.println("skatt " + e + "kr");
			} else {
				
			if (9345051 <= b) {
				double c = b * 0.1452;
				double d = b - c;
				double e = b - d;
				System.out.println("inntekt " + b + "kr");
				System.out.println("skatt " + e + "kr");
			}
			}
			}
			}
			
			
		}

	}

}
