/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package scanner;
import java.util.Random;

public class randomNumber50 {


    public static void main( String args[] ) {
      Random rand = new Random(); //instance of random class
      int upperbound = 100;
        //suppose we generate random values from 0-100
      int int_random = rand.nextInt(upperbound); 
      
      if (int_random >= 50){ //the condition for the random values to be greater or smaller
      System.out.println("Random number is greater than 50 which is : "+ int_random);
      }
      if (int_random <= 50)
            System.out.println("Random number is less than 50 which is :"+ int_random);
      
    }
}
