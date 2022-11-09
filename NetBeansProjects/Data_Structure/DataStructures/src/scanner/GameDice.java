/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package scanner;

import java.util.Random;

/**
 *
 * @author MD Raffaul Islam
 */
public class GameDice {

    
    public static void main(String[] args) {
         Random rand = new Random(); //instance of random class
   
    
        for(int i = 0; i < 6 ; i++){
			 System.out.println("Dice thrown by first player: "+ rand.nextInt(6));
                         
    }
    
}
}
