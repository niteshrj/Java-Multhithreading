package org.example;

import java.util.Scanner;

public class PrimeNumberNoConcurrency {
    public void getPrimes() {
        int number;

        while(true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("\n Enter n to know the nth prime number: ");
            int n = sc.nextInt();
            if(n == 0) break;
            number = PrimeNumberUtil.calculatePrime(n);
            System.out.println("\n Value of " + n + "th prime: " + number);
        }
    }

}
