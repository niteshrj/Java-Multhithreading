package org.example;

public class PrimeNumberUtil {
    public static int calculatePrime(int position) {
        int number = 1;
        int numberOfPrimesFound = 0;
        int i;

        while(numberOfPrimesFound < position) {
            number++;
            for(i = 2; i <= number && number % i != 0; i++) {
            }
            if(i == number) {
                numberOfPrimesFound++;
            }
        }
        return number;
    }
}
