/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.car;

/**
 *
 * @author SINGER
 */
public class Car {

  String make;
  String model;
  int year;
  String color;
  boolean isEngineOn;
  int speed;

  public Car(String make, String model, int year, String color){
      this.make = make;
      this.model = model;
      this.year = year;
      this.color = color;
      this.isEngineOn = false;
      this.speed = 0;
  }
  
  public void startEngine(){
      if(!isEngineOn){
          isEngineOn = true;
          System.out.println("Engine started");
      } else {
          System.out.println("Engine is already on");
      }
      
      
  }
  public void stopEngine(){
      if(isEngineOn){
           isEngineOn = false;
           speed = 0;
           System.out.println("Engine stopped");
      }else{
          System.out.println("Engine is already off");
      }
      
  }
  public void accelarate(int increment){
      if (isEngineOn){
          speed += increment;
          System.out.println("Speed: "+speed);
      }else{
          System.out.println("Start the Engine");
      }
      
      
  }
  public void brake(int decrement){
      if(speed >=decrement){
         speed -= decrement;
         System.out.println("Speed: "+speed);
      }else{
          speed = 0;
          System.out.println("Car Stopped");
      }
      
  }
  void displayInfo(){
      System.out.println("Car information");
      System.out.println("Make: "+ make);
      System.out.println("Model: " + model);
      System.out.println("Year: " + year);
      System.out.println("Color: " + color);
      System.out.println("Engine: " + isEngineOn);
      System.out.println("Speed: " + speed);
  }
  
  public static void main(String[] args) {
      
    Car myCar = new Car("Toyota", "Corolla", 2020, "Red");
    myCar.displayInfo();
    myCar.startEngine();
    myCar.accelarate(30);
    myCar.brake(10);
    myCar.stopEngine();
    
  }
}
