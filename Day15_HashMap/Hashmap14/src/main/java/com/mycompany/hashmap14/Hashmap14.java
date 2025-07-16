/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.hashmap14;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author SINGER
 */
public class Hashmap14 {

    public static void main(String[] args) {
        
        int length;
        String name;
        int marks;
        
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> studentMarks = new HashMap<String, Integer>();
        
        
        System.out.println("Enter Number of students: ");
        length = scanner.nextInt();
        scanner.nextLine();
        
        for(int i=0; i<length; i++){
            System.out.println("Enter Name "+ (i+1) + ": ");
            name = scanner.nextLine();
            System.out.println("Enter Marks: ");
            marks = scanner.nextInt();
            scanner.nextLine();
            
            studentMarks.put(name, marks);
        }
        
        System.out.println(studentMarks);
        /*
        studentMarks.put("Adnan", 50);
        studentMarks.put("Kamal", 100);
        studentMarks.put("Dhanish", 80);
        studentMarks.put("Sandhesh", 30);
        studentMarks.put("Cristopher", 20);
        
        System.out.println(studentMarks);
        
        studentMarks.remove("Cristopher");
        System.out.println(studentMarks.size());
        
        studentMarks.clear();
        System.out.println(studentMarks);
*/
        
        
    }
}
