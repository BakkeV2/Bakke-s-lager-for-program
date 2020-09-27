package hvl.no.dat100;

public class Oppgave_3 {
    //Oppgave 3.a)
    public static void skrivUtv1(int[][] matrise) {
        for (int[] rad : matrise)
            for (int x : rad) System.out.print(x + " ");
    }
    //Oppgave 3.b)
    public static String tilStreng(int[][] matrise) {
        String streng = "";
        for (int[] rad : matrise) {
            int i = 0;
            for (int x : rad) {
                if (i != matrise[0].length - 1) streng += x + " ";
                else {
                    streng += x + " \n";
                }
                i++;
            }

        }
        return streng;
    }
    //Oppgave 3.c)
    public static int[][] skaler(int tall, int[][] matrise) {
        int[][] matriseV2 = new int[matrise.length][matrise[0].length];
        for (int i = 0; i < matriseV2.length; i++)
            for (int j = 0; j < matriseV2[i].length; j++)
                matriseV2[i][j] = matrise[i][j] * tall;
        return matriseV2;
    }
    //Oppgave 3.d)
    public static boolean erLik(int[][] mat1, int[][] mat2) {
        boolean lik = false;
        for (int i = 0; i < mat1.length; i++)
            for (int j = 0; j <mat1[0].length; j++)
                if (mat1[i][j] == mat2[i][j]) lik = true;
                else {
                    lik = false; i = mat1.length-1; j = mat1[0].length-1;
                }
        return lik;
    }
}