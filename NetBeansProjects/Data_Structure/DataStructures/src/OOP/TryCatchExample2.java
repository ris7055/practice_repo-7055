/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package OOP;

import java.util.Scanner;

/**
 *
 * @author MD Raffaul Islam
 */
public class TryCatchExample2 {

    public static void main(String[] args) {
      
        Scanner scan = new Scanner(System.in);
        System.out.println("What's your favourite number");
        
        try{
        int n = scan.nextInt();
        System.out.println(n);
        }catch(Exception e){
            System.out.println("Oops!please try again with a number!");
        }
        
        
        
        
        
        
    }
    
}
