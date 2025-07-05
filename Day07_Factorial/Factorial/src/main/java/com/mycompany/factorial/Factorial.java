/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.factorial;
import java.util.Scanner;

/**
 *
 * @author SINGER
 */
public class Factorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }

        System.out.println("Factorial (Iterative) of " + number + " is: " + result);
    }
    
//    public static int factorial(int n) {
//        if (n == 0 || n == 1)
//            return 1;
//        else
//            return n * factorial(n - 1);
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        int number = sc.nextInt();
//
//        int result = factorial(number);
//        System.out.println("Factorial (Recursive) of " + number + " is: " + result);
//    }
}
