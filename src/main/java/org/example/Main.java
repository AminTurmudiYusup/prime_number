package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Input the numbers!");
        Scanner input=new Scanner(System.in);
        int inputNumber=input.nextInt();
        for(int initialNumber=1; initialNumber<inputNumber; initialNumber++){
            if(isPrime(initialNumber))
            System.out.println(initialNumber);
        }
    }
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false; // Numbers less than or equal to 1 are not prime
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // If divisible by any number, it's not prime
            }
        }
        return true; // No divisors found, the number is prime
    }
}