/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package scanner;
import java.util.Random;

public class diceGame {

   public static void main( String args[] ) {
      Random rand = new Random(); //instance of random class
      int upperbound = 6;
      int int_random = rand.nextInt(6) + 1;
      int int_random2 = rand.nextInt(6) + 1;
       System.out.println("Dice thrown by first player: "+ int_random);
      
        System.out.println("Dice thrown by second player: "+ int_random2);
    }
    
}
