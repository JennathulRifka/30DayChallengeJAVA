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

  //intialize variables
  String make;
  String model;
  int year;
  String color;
  boolean isEngineOn;
  int speed;

  //Full Sonstuctor
  public Car(String make, String model, int year, String color){
      this.make = make;
      this.model = model;
      this.year = year;
      this.color = color;
      this.isEngineOn = false;
      this.speed = 0;
  }
  //make, model Constuctor
  public Car(String make, String model){
      this(make, model, 2004, "Black");
  }
  
  //default Constructor
  public Car(){
      this("unknown", "unknown", 2004, "Black");
  }
  
  //methods
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
      
    Car car1 = new Car("Toyota", "Corolla", 2020, "Red");     // full constructor
    Car car2 = new Car("Honda", "Civic");                              // overloaded constructor
    Car car3 = new Car();                                                       // default constructor
    
    //call methods
    car1.displayInfo();
    //car2.displayInfo();
    //car3.displayInfo();
    
    car1.startEngine();
    car1.accelarate(30);
    car1.brake(10);
    car1.stopEngine();
    
  }
}
