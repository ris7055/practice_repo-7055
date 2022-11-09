/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package scanner;

import java.util.Scanner;
public class perimeterRectangle {

    
  public static void main (String args[]){
          
          Scanner input = new Scanner(System.in);
          System.out.println("Enter a side of Rectangle: ");
          int num1 = input.nextInt();
           System.out.println("Enter b side of Rectangle: ");
           int num2 = input.nextInt();
           
           
           {    float a ,b, c, d, perimeter;  
                    a=c= num1;  
                    b=d= num2;  
                    perimeter  = 2*(a+b);  
            System.out.println("Perimeter of Rectangle is: "+ perimeter);
    }
}  
}