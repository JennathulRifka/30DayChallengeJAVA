/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.linearsearch;

/**
 *
 * @author SINGER
 */
public class BinarySearch {
    
    public static void main(String[] args){
        int[] arr={10, 20, 30, 35, 40, 50, 60, 70};
        
        System.out.println(binarySearch(arr, 30));
        
    }
    
    private static int binarySearch (int[] arr, int target){
    
    int low=0;
    int high= arr.length -1;
    int midPos;
    int midNum;
    
        while(low<=high){
            
            midPos = (low+high)/2; //index
            midNum= arr[midPos];   //value
            
            if(target == midNum ){
                return midPos;
            }
            
            if(target<= midNum){
                high= midPos-1;
            }
            else{
                low=midPos+1;
            }
        }
        return -1;
    }
}
