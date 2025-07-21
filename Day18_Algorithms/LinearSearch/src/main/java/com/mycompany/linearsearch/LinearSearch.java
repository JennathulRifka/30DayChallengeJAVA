/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.linearsearch;

/**
 *
 * @author SINGER
 */
public class LinearSearch {

    public static void main(String[] args) {
    int[] arr = {10, 20, 30, 40, 50};
    int target = 50;
    boolean found =false;
    
    for (int i=0; i<arr.length; i++){
        if(arr[i]==target){
            System.out.println("target found at index: "+i);
            found=true;
            break;
        }
    }
    if (!found){
        System.out.println("Target Not found");
    }
    
    }
}
