/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP;

/**
 *
 * @author MD Raffaul Islam
 */
public class Test {
    public static void main(String[] args) {
        
        Teacher teacher1 = new Teacher();//object declare
        
        teacher1.name = "MD Raffaul Islam";
        teacher1.gender = "male";
        teacher1.phone = 172137220;
        teacher1.displayInformation(); //method calling function
        
        Teacher teacher2 = new Teacher();
        
        teacher2.name = "Jason";
        teacher2.gender = "male";
        teacher2.phone = 97809;
        teacher2.displayInformation();
    }
}
