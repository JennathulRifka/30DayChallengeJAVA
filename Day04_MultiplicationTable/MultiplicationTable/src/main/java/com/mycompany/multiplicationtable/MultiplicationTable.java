/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.multiplicationtable;
import java.util.Scanner;

/**
 *
 * @author SINGER
 */
public class MultiplicationTable {
    
    public static void main(String[] args) {
        
        //intialize variables
        int value, multiple, result;
        
        //intialize user input
        Scanner scanner = new Scanner(System.in);
        
        //get user inputs
        System.out.print("Enter value: ");
        value = scanner.nextInt();
        
        System.out.print("No of multiples: ");
        multiple = scanner.nextInt();
        
        System.out.println("Multiplication table of " + value);
        
        //output multiplication table using for loop
        for (int i=0 ; i<=multiple; i++){
            result = value * i;
            System.out.println(value+ "*" + i + "="+ result);
        }
        
        //output multiplication table using for while loop
        /*
        int i=0;
        while (i<=multiple){
            result = value * i;
            System.out.println(value+ "*" + i + "="+ result);
            i++;
        }
        */
    }
}
