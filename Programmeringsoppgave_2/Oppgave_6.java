package hvl.no.dat100;

public class Oppgave_6 {
    //Oppgave 6.a)
    public static void skrivUt(int[] tabell) {
        for (int j : tabell) System.out.println(j);
    }
    //Oppgave 6.b)
    public static String tilStreng(int[] tabell){
            String streng = "[";

            for (int i = 0; i < tabell.length; i++) {
                if (i != tabell.length-1) {
                    streng += (tabell[i] + ",");
                } else {
                    streng += (tabell[i]);
                }
            }
            streng += "]";
            return streng;
        }
    //Oppgave 6.c)
    public static int summer1 (int[] tabell){
        int summer = 0;
        for (int i = 0; i < tabell.length; i++) summer += tabell[i];
        return summer;
    }
    public static int summer2 (int[] tabell) {
        int summer = 0;
        int i = 0;
        while (i < tabell.length) {
            summer += tabell[i];
            i++;
        }
        return summer;
    }
    public static int summer3 (int[] tabell) {
        int summer = 0;
        for (int i : tabell) {
            summer += i;
        }
        return summer;
    }
    //Oppgave 6.d)
    public static boolean finnesTall (int[] tabell, int tall) {
        for (int j : tabell)  if (tall == j) return true;
        return false;
    }
    //Oppgave 6.e)
    public static int posisjonTall (int[] tabell, int tall) {
        int posisjonsTall = -1;
        for (int i = 0; i < tabell.length; i++)
            if (tall == tabell[i]) posisjonsTall = i;
        return posisjonsTall;
    }
    //Oppgave 6.f)
    public static int[] reverser(int[] tabell) {
        int[] temp = new int[tabell.length];
        int j = 0;
        for (int i = tabell.length-1; i >=0; i--, j++)
            temp[j] = tabell[i];
        return temp;
    }
    //Oppgave 6.g)
    public static boolean erSortert (int[] tabell) {
        boolean StigendeRekkefølge = false;
        if (tabell.length <= 1) return true;
        for (int i = 0; i < tabell.length-1; i++) {
            if (tabell[i] < tabell[i+1]) {
                StigendeRekkefølge = true;
            } else {
                i = tabell.length;
                StigendeRekkefølge = false;
            }
        }
        return StigendeRekkefølge;
    }
    //Oppgave 6.h)
    public static int[] settSammen(int[] tabell1,int[] tabell2) {
        int lengde = tabell1.length + tabell2.length;
        int[] nyTabell = new int[lengde];
        int pos = 0;

        for (int i : tabell1) {
            nyTabell[pos] = i;
            pos++;
        }
        for (int i : tabell2) {
            nyTabell[pos] = i;
            pos++;
        }
        return nyTabell;
    }
}
