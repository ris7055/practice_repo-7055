/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Constructors;

/**
 *
 * @author Hi
 */
public class Test {
    public static void main(String[] args) {
        
       Teacher teacher1 = new Teacher("MD Raffaul Islam","Male",1721372880);//object declare
       teacher1.displayInformation(); //method calling function 
        
        
        
       Teacher teacher2 = new Teacher("Jason","Male",97097);
        teacher2.displayInformation();
      
        Teacher teacher3 = new Teacher();
        teacher3.displayInformation();
        
        
    }
}
