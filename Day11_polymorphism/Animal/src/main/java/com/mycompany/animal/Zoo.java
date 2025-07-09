/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.animal;

/**
 *
 * @author SINGER
 */
public class Zoo {
    public static void main (String[] args){
        Animal myAnimal = new Animal();
        Cat myCat = new Cat();
        Dog myDog = new Dog();
        
        myAnimal.animalSound();
        myCat.animalSound();
        myDog.animalSound();
        
    }
    
}
