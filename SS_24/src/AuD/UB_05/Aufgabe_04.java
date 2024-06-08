package AuD.UB_05;

public class Aufgabe_04 {
    public static void main(String[] args) {
        System.out.println(fibRekursiv(8, 4, 8));
    }

    public static long fibRekursiv(int grenze, long fib1, long fib2) {
        if(grenze <= 1) {
            return fib2;
        }
        return fibRekursiv(grenze - 1, fib2, fib1 + fib2);
    }
}
