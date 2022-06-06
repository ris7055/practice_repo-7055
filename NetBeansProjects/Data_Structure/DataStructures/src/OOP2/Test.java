/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package OOP2;

/**
 *
 * @author Hi
 */
public class Test {
    public static void main(String[] args) {
        
        Teacher teacher1 = new Teacher();//object declare
        
        teacher1.setInformation("MD Raffaul Islam","Male",1721372880);
        teacher1.displayInformation(); //method calling function
        
        Teacher teacher2 = new Teacher();
        
        teacher2.setInformation("Jason","Male",97097);
        teacher2.displayInformation();
        
        
    }
}
