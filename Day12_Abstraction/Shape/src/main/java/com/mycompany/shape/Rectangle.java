/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.shape;

/**
 *
 * @author SINGER
 */
public class Rectangle extends Shape{
    
    double length;
    double width;
    
    public Rectangle(String color, double length, double width){
        super(color);
        this.length=length;
        this.width=width;
        
    }
    
    @Override
    double area(){
        return length * width;
    }
}
