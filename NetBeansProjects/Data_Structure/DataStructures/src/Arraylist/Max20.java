/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Arraylist;
import java.util.ArrayList; 
import java.util.Collections; 
/**
 *
 * @author MD Raffaul Islam
 */
public class Max20 {

   
    public static void main(String[] args) {
 
    
        ArrayList<Integer> list = new ArrayList<Integer>(); 
        for (int i = 1; i <= 20; i++) { 
            list.add(new Integer(i)); 
        } 
        Collections.shuffle(list); 
        for (int i = 0; i < 10; i++) { 
            System.out.println(list.get(i)); 
        } 
    } 

}

    
    

