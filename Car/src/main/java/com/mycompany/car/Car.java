/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.car;
import java.util.ArrayList;

/**
 *
 * @author SINGER
 */
public class Car {

    public static void main(String[] args) {
        
        ArrayList<String> car = new ArrayList<String>();
        car.add("volvo");
        car.add("BMW");
        car.add("Benz");
        car.add("Ford");
        
        //print the Arraylist Car
        System.out.println(car);
        
        //remove car[3] = 3 available
        car.remove(3);
        System.out.println(car);
        
        //add a car to the index 0
        car.add(0, "Mazda");
        System.out.println(car);
        
        //access a car by index
        System.out.println("Car at index 0: " + car.get(0));
        
        //reset the value of a car
        System.out.println("Car at Index 1 (Before): " +car.get(1));
        car.set(1, "Volvo Pro");
        System.out.println("Car at Index 1: " + car.get(1));
        
        
    }
}
