/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vehicle;

/**
 *
 * @author SINGER
 */
class Bike extends Vehicle{
    
    private String modelName ;
    private int engineCapacity;
    private boolean isSportBike;
    
    public Bike(String brand, String color, int year, int maxSpeed, String modelName, int engineCapacity, boolean isSportBike){
        super(brand, color, year, maxSpeed);
        this.modelName= modelName;
        this.engineCapacity = engineCapacity;
        this.isSportBike= isSportBike;
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        
        System.out.println("");
        System.out.println("Model: " + modelName);
        System.out.println("Engine: " + engineCapacity + "cc");
        System.out.println("Sports Bike: " + (isSportBike ? "Yes" : "No"));
    }

    public void wheelie() {
        System.out.println(modelName + " is popping a wheelie!️");
    }

    public static void main(String[] args) {
        Bike myBike = new Bike("Yamaha", "Blue", 2022, 180, "R15 V4", 155, false);
        myBike.start();
        myBike.displayInfo();
        myBike.wheelie();
        myBike.stop();
    }
}
