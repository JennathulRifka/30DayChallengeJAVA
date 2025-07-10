/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.shape;

/**
 *
 * @author SINGER
 */
public class ShapeTest {
    
    public static void main(String[] args){
        Shape s1 = new Circle("Red", 5);
        Shape s2=new Rectangle("Blue", 4, 6);
        Shape s3 = new Traingle("Green", 3, 7);

        s1.displayColor();
        System.out.println("Circle Area: " + s1.area());

        s2.displayColor();
        System.out.println("Rectangle Area: " + s2.area());

        s3.displayColor();
        System.out.println("Triangle Area: " + s3.area());
    }
}
