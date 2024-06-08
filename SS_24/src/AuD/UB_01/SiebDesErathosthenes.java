package AuD.UB_01;

import java.util.Scanner;

public class SiebDesErathosthenes
{
    public static void ausgebenPrimzahlen(int n)
    {
        // true bedeutet durchgestrichen
        boolean[] zahlen = new boolean[n];

        // 1 durchstreichen
        zahlen[0] = true;

        // Primzahlen berechnen
        int a = 2;
        while (a*a <= n)
        {
            if (!zahlen[a-1])
                // Vielfache markieren
                // Wir können damit bei a*a beginnen:
                // - 2*a wurde bereits als Vielfaches von 2 gestrichen
                // - 3*a wurde bereits als Vielfaches von 3 gestrichen
                // - …
                // - (a-1)*a wurde bereits als Vielfaches von a-1 gestr.
                // - a*a ist das erste zu streichende Vielfache
                for (int b = a*a; b <= n; b += a)
                    zahlen[b-1] = true;

            a++;
        }

        // Primzahlen ausgeben
        for (int b = 1; b <= n; b++)
            if (!zahlen[b-1])
                System.out.println(b);
    }

    public static void main(String[] args)
    {
        final Scanner sc = new Scanner(System.in);

        System.out.print("Bitte Zahl eingeben: ");
        final int n = sc.nextInt();

        ausgebenPrimzahlen(n);
        sc.close();
    }

}

