/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.iofile;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author SINGER
 */
public class IOFile {

    public static void main(String[] args) {
        try{
            //File myobj = new File("File.txt");
            FileWriter myobj2= new FileWriter("File.txt");
            /*
            if (myobj.createNewFile()){
                System.out.println("File created: "+myobj.getName());
            }else {
                System.out.println("Flie Already Exsists");
            }
            */
            myobj2.write("Files in Java might be tricky, but it is fun enough!");
            myobj2.close();
            System.out.println("Sucessfully Wrote to this file");
            
        }
        catch (IOException e){
            System.out.println("An error Occured.");
            e.printStackTrace();
        }
        

        
        
    }
}
