/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.playable;

/**
 *
 * @author SINGER
 */
public class Tester {
    public static void main(String[] args) {
        Game myGame = new Game("Adventure Quest");
        myGame.start();
        myGame.printStatus();
        myGame.pause();
        myGame.printStatus();
        myGame.stop();
        myGame.printStatus();
    }    
}
