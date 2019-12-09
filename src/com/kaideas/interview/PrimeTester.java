package com.kaideas.interview;
import java.util.Scanner;
/**
 * This program will determine if a number is Prime or Not. This program accepts a
 * number from command prompt and check if it is prime or not.
 */

public class PrimeTester {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int num;
        System.out.println("Enter number to check if prime value: ");
                    num = scnr.nextInt();
            System.out.printf("Using the first method, : It is %s that %d is a prime number \n\n",
                    primeCheckVer1(num), num);

            System.out.printf("Using Method primeCheckVer2: It is %s that %d is a prime number \n\n",
                    primeCheckVer2(num), num);

            System.out.printf("Using Method primeCheckVer3: %d is %s \n\n", num,
                    primeCheckVer3(num));
    }

    /*
     * Java method to check if an integer number is prime or not.
     * @return true if number is prime, else false
     */
    public static boolean primeCheckVer1(int number) {
        int sqrt = (int) Math.sqrt(number) + 1;
        for (int i = 2; i < sqrt; i++) {
            if (number % i == 0) {
                // number is perfectly divisible - no prime
                return false;
            }
        }
        return true;
    }

    /*
     * Second version of isPrimeNumber method, with improvement like not
     * checking for division by even number, if its not divisible by 2.
     */
    public static boolean primeCheckVer2(int number) {
        if (number == 2 || number == 3) {
            return true;
        }
        if (number % 2 == 0) {
            return false;
        }
        int sqrt = (int) Math.sqrt(number) + 1;
        for (int i = 3; i < sqrt; i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    /*
     * Third way to check if a number is prime or not.
     */
    public static String primeCheckVer3(int num) {
        if (num < 0) {
            return "not valid entry!";
        }
        if (num == 0 || num == 1) {
            return "not a prime number.";
        }
        if (num == 2 || num == 3) {
            return "prime number.";
        }
        if ((num * num - 1) % 24 == 0) {
            return "a prime number.";
        } else {
            return "not a prime number.";
        }
    }
}
