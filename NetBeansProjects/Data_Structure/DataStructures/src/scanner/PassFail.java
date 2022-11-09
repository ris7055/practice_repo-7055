/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package scanner;

import java.util.Scanner;


public class PassFail {

    
    public static void main(String[] args) {
    
  Scanner num = new Scanner(System.in);
   
  System.out.print("Input pass/fail mark: ");
  int var = num.nextInt();
  
  if (var >= 40){
      System.out.println("The mark entered by the user is a pass mark");
        }
  else if(var < 40){
      System.out.println("The mark entered by the user is a not pass(fail) mark");
  }  
    }
    
}
