/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.primenumber;
import java.util.Scanner;

/**
 *
 * @author SINGER
 */
public class PrimeNumber {

    public static void main(String[] args) {
        
        //intialize variables
        int value;
        boolean isPrime=true;
        
        //intialze user input
        Scanner scanner=new Scanner(System.in);
        
        //take user input
        System.out.println("Enter a number: ");
        value = scanner.nextInt();
        
        if (value <= 1){
            isPrime= false;
        } else {
            for (int i=2; i*i <= value; i++){
                if (value % 2 == 0){
                    isPrime = false;
                    break;
                }
                
            }
        }
        
        if (isPrime == true){
            System.out.println("Value " + value + " is a prime number");
        }else{
            System.out.println("Value " + value + " is not a prime number");
        }
    }
}
