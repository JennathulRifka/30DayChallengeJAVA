/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.calculator;
import java.util.Scanner;

/**
 *
 * @author SINGER
 */
public class Calculator {

    public static void main(String[] args) {
        
        //intialize variables
        double value1, value2;
        char operator;
        
        
        //Read 2 user inputs and operator
        Scanner scanner = new Scanner (System.in);
        
        try{
            System.out.println("Enter 1st value: ");
            value1 = scanner.nextDouble();

            //check for status of the operator valid/invalid
            while (true) {
                System.out.println("Enter operator: ");
                operator = scanner.next().charAt(0);

                if (operator == '+' || operator == '-' || operator == '*' || operator == '/'){
                    break;
                }
                else {
                    System.out.println("Invalid operator, please try again");
                }
            }

            System.out.println("Enter 2nd value: ");
            value2 = scanner.nextDouble();

            /*
            Checking if the values are entered correctly
            System.out.println("Value 01: " + value1);
            System.out.println("Value 02: " + value2);
            */

            double result;

            switch (operator){
                case '+':
                    result = value1 + value2;
                    break;
                case '-':
                    result = value1 - value2;
                    break;
                case '/':
                    if (value2 == 0){
                        System.out.println("Error Cannot divide by zero");
                        return;
                    }
                    result = value1 / value2;
                    break;
                case '*':
                    result = value1 * value2;
                    break;
                default:
                    System.out.println("Error");
                    return;
            }
        
        System.out.println("Result: " + result);   
        //invalid numeric value
        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter valid numeric values.");
        //unexpected error
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
        
    }
}
