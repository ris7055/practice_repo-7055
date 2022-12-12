/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ReturnStatement;

/**
 *
 * @author MD Raffaul Islam
 */
public class returnStatement {

    
    public static void main(String[] args) {
        printAmessage();
        int sum = add(5,4); //by assigning the return statement the variable "sum" can store the addition of integers
        System.out.println(sum);
    }
    
    public static void printAmessage() {//a random method for calling in the main method
        System.out.println("This is our first method");
        
    }
    
    public static int add(int a, int b){// a random method for calling in the main method
        
       return a + b;
        
    }
    
}
