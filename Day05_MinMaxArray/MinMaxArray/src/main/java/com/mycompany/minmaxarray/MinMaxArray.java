/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.minmaxarray;
import java.util.Scanner;

/**
 *
 * @author SINGER
 */
public class MinMaxArray {

    public static void main(String[] args) {
        
        //Declare variables
        int length=0, min , max;
        
        //create a scanner object for input
        Scanner scanner=new Scanner(System.in);
        
        //prompt user for number of inputs
        System.out.println("Enter Number of values to be Inserted: ");
        length = scanner.nextInt();
        
        //System.out.println("Length: " + length);
        
        //declare an array
        int[] number = new int[length];
        
        //prompt user for the inputs
        System.out.println("Enter Value: ");
        for (int i=0; i<length; i++){    
            number[i] = scanner.nextInt();
            //System.out.println("number[i] "+ number[i]);
        }
        
        
        //intilaize the variables
        min = number[0];
        max = number[0];
        
        //for loop to find min and max values
        for (int i=0; i<number.length; i++){
            if (number [i]> max){
                max = number[i];
            }
            if (number [i]< min){
                min = number[i];
            }
        }
           
           System.out.println("Max: " + max+ " | " + "Min: " + min );
    }
}


/*
        Finding Min and Max values in a Hardcoded arrray
            int[] number = {1,2,3,4,5};
            
            min = number[0];
            max = number[0];
            
            //for loop
           for (int i=0; i<number.length; i++){
               if (number [i]> max){
                   max = number[i];
               }
               if (number [i]< min){
                   min = number[i];
               }
           }
              for each loop
            for (int value: number){
                if (value> max){
                   max = number [value];
               }
               if (value< min){
                   min = number [value];
               }
            }
            System.out.println("Max: " + max+ " | " + "Min: " + min );
*/