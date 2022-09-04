
package StackJava;

import java.util.Stack;
/**
 *
 * @author MD Raffaul Islam
 */
public class StackFun {
    
    public static void main(String[] args) {
        
        Stack <String> games = new Stack<>();
        
        games.add("Call of Duty");
        games.add("PUBG");
        games.add("Remnant");
        
        System.out.println(games.pop());// pop makes the elements one by by to print out
        System.out.println(games.pop());
        System.out.println(games.contains('p'));//returns true false statement
        System.out.println(games);
   }
                    
}               
                        