package AuD.UB_02;


public class VL_02 {
    public static void main(String[] args) {
//        int[] feld = {1, 2, 101, 3, 4, 5, 99};
//        System.out.println(maximum(feld));
//        System.out.println(feld.length);
        proz5(100);
    }

    public static void tuwas() {

    }

    static void proz1(int n) {
        for(int a = 0; a < n; a++) {
            System.out.println(a);
        }

        for(int b = 0; b < n; b++) {
            System.out.println(b);
        }
    }

    static void proz2(int n) {
        for(int a = 0; a < n; a++) {
            for(int b = 0; b < n; b++) {
                System.out.println(a);
            }
        }
    }
    static void proz3(int n) {
        for(int a = 0; a * a <= n; a++) {
            System.out.println(a);
        }
    }

    static void proz4(int n) {
        for(int a = 1; a <= 100; a++) {
            for(int b = 1; b < n * n; b++) {
                for(int c = 1; c < n; c++) {

                }
            }
        }
    }

    static void proz5(int n) {
        int i = 0;
        for(int a = 1; a <= n; a++) {
            for(int b = 1; b <= a; b++) {
                System.out.println(i);
                i++;
            }
        }
    }

    public static int maximum(int[] feld) {
        assert (feld != null);
        assert (feld.length > 0);

        int max = feld[0];
        for (int a = 1; a < feld.length; a++) {
            if (feld[a] > max) {
                max = feld[a];
            }
        }
        return max;
    }
}


