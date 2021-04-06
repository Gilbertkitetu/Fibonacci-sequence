package com.company;
import java.util.Scanner;



public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Hello Java");


        //creating scanner object
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the First No. :");
        //read the value for the first number provided
        int first_number = scan.nextInt();

        System.out.print("Enter the Second NO. :");
        //read the value of the second number provided
        int second_number = scan.nextInt();

        //closing the scanner class
        scan.close();

        //calling methods

        //sum method
        calculateSum(first_number, second_number);

        //product method
        calculateProduct(first_number, second_number);

        //fibonacci sequence method
        //am taking the first number from the scanner as my n_th number
        System.out.println("nth Fibonacci number is " + fibonacci(first_number));
        //fibonacci(first_number);

    }

    //creating my methods yeeh!!
    public static void calculateSum(int a, int b){
        int sum = 0;
        sum = a + b;
        //log the answer
        System.out.println("The sum of "+ a + " and " + b +" is "+ sum);
    }
    public static void calculateProduct(int a, int b){
        int product = 0;
        product = a * b;
//log the answer
        System.out.println("The product of "+ a + " and " + b +" is "+ product);
    }

    public static int fibonacci(int n){
        if (n <= 1) {
            return n;
        }
        int previousFibonacci = 0, currentFibonacci = 1;
        for (int i =0; i < n - 1; i ++){
            int newFibonacci = previousFibonacci + currentFibonacci;
            previousFibonacci = currentFibonacci;
            currentFibonacci = newFibonacci;
        }

        return currentFibonacci;

    }

}
