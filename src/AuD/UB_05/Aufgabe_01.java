package AuD.UB_05;

public class Aufgabe_01 {
    public static void main(String[] args) {
        rev(-1);
    }
    public static void rev(int n) {
        System.out.println(n % 10);
        if(n > 9) {
            rev(n / 10);
        }
    }

    public static void revIter1(int n) {
        assert(n >= 0);
        System.out.println(n % 10);
        while(n > 9) {
            n /= 10;
            System.out.println(n % 10);
        }
    }
}
