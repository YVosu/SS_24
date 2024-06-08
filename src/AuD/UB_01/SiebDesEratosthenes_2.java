package AuD.UB_01;


public class SiebDesEratosthenes_2 {
    // true bedeutet durchgestrichen
    private boolean[] zahlen;

    public SiebDesEratosthenes_2(int n) {
        zahlen = new boolean[n];
    }

    // Interne Methoden
    private void durchstreichen(final int zahl) {
        zahlen[zahl - 1] = true;
    }

    private boolean isDurchgestrichen(final int zahl) {
        return zahlen[zahl - 1];
    }

    private void durchstreichenVielfache(final int zahl) {
        for (int a = 2 * zahl; a <= zahlen.length; a += zahl)
            durchstreichen(a);
    }

    // Von außen sichtbare Primzahl-Berechnung
    public int[] berechnePrimzahlen() {
        durchstreichen(1);

        // Primzahlen durch Durchstreichen der Vielfachen ermitteln
        int a = 2;
        while (a * a <= zahlen.length) {
            if (!isDurchgestrichen(a))
                durchstreichenVielfache(a);

            a++;
        }

        // Primzahlen für Rückgabe aufbereiten
        int anzPrimzahlen = 0;

        for (int b = 1; b <= zahlen.length; b++)
            if (!isDurchgestrichen(b))
                anzPrimzahlen++;

        // Rückgabe-Array erzeugen und füllen
        int[] primzahlen = new int[anzPrimzahlen];
        int pos = 0;

        for (int b = 1; b <= zahlen.length; b++)
            if (!isDurchgestrichen(b))
                primzahlen[pos++] = b;

        return primzahlen;
    }
}

