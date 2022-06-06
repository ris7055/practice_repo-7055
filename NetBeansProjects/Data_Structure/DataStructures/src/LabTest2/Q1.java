/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LabTest2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MD Raffaul Islam
 */
public class Q1 {
    ArrayList<String> product = new ArrayList<>();
        MyQueue<String> products = new MyQueue<>();
        
        try {
            Scanner sc;
        try {
            sc = new Scanner(new FileInputStream("D:/University/WIA1002/Tests/labtest2.txt"));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Q1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
            while (sc.hasNextLine()) {
                String[] s = sc.nextLine().split(" ");
                for (String string : s) {
                    products.enqueue(string);
                }
            }
            
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        
        System.out.println(products);
}
