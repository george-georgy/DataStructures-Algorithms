package Recursion;

// Recursion is the process in which a function calls itself.
public class Recursion {

    // Factorial series using recursion
    public static int factorial(int num){
        if (num == 1)    //==> base case
            return 1;
        else
          return  num * factorial(num - 1); //==> recursive case
    }

    // Fibonacci series (0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ...) using recursion
    // fib function take index and returns the value at it index.
    public static long fibonacci(int num){
        if (num <= 1)    //==> base case
            return num;
        else
            return  fibonacci(num - 1) + fibonacci( num - 2); //==> recursive case

    }

    public static void main(String[] args) {

        int factorialNumber = 4;
        int fibonacciIndex = 9;


        System.out.println("Factorial of " + factorialNumber +" is " + Recursion.factorial(factorialNumber));
        System.out.println("Fibonacci number at index " + fibonacciIndex +" is " + Recursion.fibonacci(fibonacciIndex));

    }

}
