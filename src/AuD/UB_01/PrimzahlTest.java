package AuD.UB_01;


import java.util.Scanner;

public class PrimzahlTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Bitte Zahl eingeben: ");
        int n = sc.nextInt();
        SiebDesEratosthenes_2 sieb = new SiebDesEratosthenes_2(n);
        int[] primzahlen = sieb.berechnePrimzahlen();

        for (int a = 0; a < primzahlen.length; a++)
            System.out.println(primzahlen[a]);
    }
}

