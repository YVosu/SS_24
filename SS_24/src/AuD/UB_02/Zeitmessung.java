package AuD.UB_02;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Zeitmessung {

    private static int tuwasCounter = 0;
    private static double tuwas() {
        tuwasCounter++;
        System.out.println(tuwasCounter);
        return Math.random();
    }

    // Linear
    public static double func1(int n) {
        double summe = 0;

        for (int a = 0; a < n; a++) {
            summe += tuwas();
        }
        return summe;
    }

    // Quadratisch
    public static double func2(int n) {
        double summe = 0;

        for (int a = 0; a < n; a++) {
            for (int b = 0; b < n; b++) {
                summe += tuwas();
            }
        }
        return summe;
    }

    // log2(n)
    public static double func6(int n) {
        double summe = 0;

        while (n > 0) {
            summe += tuwas();
            n /= 2;
        }

        return summe;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Groesse n: ");
        int n = scanner.nextInt();

        Stopuhr meineUhr = new Stopuhr();
        meineUhr.start();
        Zeitmessung.func1(n);
        meineUhr.stop();

        System.out.println("Func1 (lineare Laufzeit):  " + meineUhr.getDuration()/1_000_000.0 + " msec");
        System.out.println("Anzahl der Aufrufe von tuwas(): " + tuwasCounter);

        tuwasCounter = 0;
        meineUhr.start();
        Zeitmessung.func2(n);
        meineUhr.stop();
        System.out.println("Func2 (quadratische Laufzeit): " +
                meineUhr.getDuration()/1000000.0 + " msec");
        System.out.println("Anzahl der Aufrufe von tuwas(): " + tuwasCounter);


        tuwasCounter = 0;
        meineUhr.start();
        Zeitmessung.func6(n);
        meineUhr.stop();
        System.out.println("Func6 (logarithmische Laufzeit): " +
                meineUhr.getDuration()/1000000.0 + " msec");
        System.out.println("Anzahl der Aufrufe von tuwas(): " + tuwasCounter);
    }
}

