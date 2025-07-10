/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.shape;

/**
 *
 * @author SINGER
 */
public class Circle extends Shape {
    
    double radius;
    
    public Circle(String color, double radius){
        super(color);
        this.radius = radius;
    }
    
    @Override
    double area(){
        return Math.PI* radius * radius;
    }
}
