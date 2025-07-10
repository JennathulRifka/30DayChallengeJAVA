/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.shape;

/**
 *
 * @author SINGER
 */
public class Traingle extends Shape {
    double base;
    double height;
    
    public Traingle(String color, double base, double height){
        super(color);
        this.base=base;
        this.height=height;
    }
    
    @Override
    double area(){
        return 0.5*base*height;
    }
}   

