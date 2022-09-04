/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package OOP;

/**
 *
 * @author MD Raffaul Islam
 */
public class TryCatch {     //basically try and catch are used to exceptions instead of showing the mistakes in console

    
    public static void main(String[] args) {
      
        try {
            
        int[] a = {4, 5, 1};
        System.out.println(a[3]);
        }
        catch(Exception e){ //prints the output as follows if the user inputs wrong code or shows error
            System.out.println("An exception happened");
        }
     }
        
      
 }
    

