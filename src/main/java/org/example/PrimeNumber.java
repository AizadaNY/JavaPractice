package org.example;

public class PrimeNumber {

    public static boolean primeNumber(int n) {
        for (int i = 2; i < 10; i++) {
            if (n % i == 0 && n!=i) {
                System.out.println(n%i);
               return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        System.out.println(primeNumber(17));
    }
}
