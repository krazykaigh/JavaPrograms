package com.kaideas.interview;

import java.util.Scanner;

/**
 * Java program to determine Fibonacci numbers using both recursion
 * and Iteration.
 * Fibonacci number is sum of previous two Fibonacci numbers fn= fn-1+ fn-2
 */
public class Fibonaccerator {

    public static void main(String[] args) {

        //get number of iterations
        System.out.println("How many numbers in Fibonacci series should be displayed? ");

        Scanner scnr = new Scanner(System.in);
        int num = scnr.nextInt();

        System.out.println("Fibonacci series upto " + num +" numbers : ");

        //choose method of determining Fibonacci series Recursion or Iteration
        int calc;
        do {
            System.out.println("For RECURSION choose 1; for ITERATION choose 2: ");
            calc = scnr.nextInt();
        } while(calc < 0 || calc > 2);

        if (calc == 1)
            System.out.print(" Fibonacci series is being calculated by RECURSION");
        else
            System.out.print(" Fibonacci series is being calculated by ITERATION");

        //printing Fibonacci series upto number
        for(int i=1; i<=num; i++){
            if (calc == 1){
                System.out.print(fibo1(i) + " ");
            }
            else
                System.out.print(fibo2(i) + " ");
         }
    }

    /*
     * Determine Fibonacci number using RECURSION.
     */
    public static int fibo1(int fib1num){

        if(fib1num == 1 || fib1num == 2){
            return 1;
        }

        return fibo1(fib1num-1) + fibo1(fib1num -2);
    }

    /*
     * Determine Fibonacci number through ITERATION.
     */
    public static int fibo2(int number){
        if(number == 1 || number == 2){
            return 1;
        }
        int fibo1=1, fibo2=1, fiboActual=1;
        for(int i= 3; i<= number; i++){

            //FiboActual = sum of two previous Fibonacci numbers
            fiboActual = fibo1 + fibo2;
            fibo1 = fibo2;
            fibo2 = fiboActual;

        }
        return fiboActual; //Fibonacci number

    }

}
