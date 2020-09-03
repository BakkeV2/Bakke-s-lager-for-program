package no.hvl.dat100;

public class Oppgave_Bonus {

	public static void main(String[] args) {
        String tall = javax.swing.JOptionPane.showInputDialog("Tall som skal fakulteres");
        int a = Integer.parseInt(tall);
        
		System.out.println(calc(a));
    }

    public static long calc(long n) {
        if (n <= 1)
            return 1;
        else
            return n * calc(n - 1);
    }	
}
