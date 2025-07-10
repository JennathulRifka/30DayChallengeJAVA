/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.shape;

/**
 *
 * @author SINGER
 */
abstract class Shape {
    String color;
    
    public Shape(String color){
        this.color=color;
    }
    
    abstract double area();
    
    void displayColor(){
        System.out.println("Color "+ color);
    }
}
