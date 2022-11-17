package org.example;

import java.util.Scanner;

public class PrimeNumberNoConcurrency {
    public void getPrimes() {

        while(true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("\n Enter n to know the nth prime number: ");
            int n = sc.nextInt();
            if(n == 0) break;

            Runnable r = new Runnable() {
                @Override
                public void run() {
                    int number = PrimeNumberUtil.calculatePrime(n);
                    System.out.println("\n Result: \n Value of " + n + "th prime: " + number);
                }
            };

            Thread t = new Thread(r);
            t.start();

        }
    }

}
