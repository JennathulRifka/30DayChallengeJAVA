/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ehandling;

import java.io.File;
//import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author SINGER
 */
public class EHandling {
public static void main(String[] args) {
        // Divide by zero example
        try {
            int a = 10;
            int b = 0; // Deliberately set to zero
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero!");
        }

        // File not found example
//        try {
//            File file = new File("MissingFile.txt"); // File likely doesn't exist
//            Scanner scanner = new Scanner(file);
//            while (scanner.hasNextLine()) {
//                System.out.println(scanner.nextLine());
//            }
//            scanner.close();
//        } catch (FileNotFoundException e) {
//            System.out.println("Error: File not found!");
//        }
    }
}
