package com.mycompany.playable;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author SINGER
 */
public class Game implements Playable  {
    String title;
    boolean isRunning;
    
    public Game(String title){
        this.title = title;
        this.isRunning = false;
    }
    
    @Override
    public void start(){
        isRunning = true;
        System.out.println(title + " has started.");
    }
    
    @Override
    public void pause(){
        if (isRunning) {
            isRunning = false;
            System.out.println(title + " is paused.");
        } else {
            System.out.println(title + " is not running.");
        }
    }
    
    @Override
    public void stop(){
        isRunning = false;
        System.out.println(title + " has stopped.");
    }
    
    public void printStatus(){
        String status = isRunning ? "Running" : "Stopped";
        System.out.println("Game status: " + status);
    }
            
}
