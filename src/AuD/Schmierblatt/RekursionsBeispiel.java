package AuD.Schmierblatt;

public class RekursionsBeispiel {
    public static void main(String[] args) {
        int zahl = 5;
        int ergebnis = fakultaet(zahl);
        System.out.println("Die Fakultaet von " + zahl + " betraegt " + ergebnis);
    }

    public static int fakultaet(int n) {
        if(n == 0 || n == 1) {
            return 1;
        }

        return n * fakultaet(n - 1);
    }
}


