/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.vehicle;

/**
 *
 * @author SINGER
 */
class Vehicle {
    protected String brand;
    protected String color;
    protected int year;
    protected int maxSpeed;
    
    public Vehicle(String brand, String color, int year, int maxSpeed){
        this.brand="Ducati";
        this.color="Black";
        this.year=year;
        this.maxSpeed=maxSpeed;
    }
    
    public void start(){
        System.out.println("Vehicle started");
    }
    
    public void stop(){
        System.out.println("Vehicle Stooped");
    }
    
    public void displayInfo(){
        
        System.out.println("Brand: "+ brand);
        System.out.println("Color: "+ color);
        System.out.println("Year: " + year);
        System.out.println("Max Speed: "+ maxSpeed);
        
    }
}

