/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package returning_value;

import java.util.Random;


public class Max20return {

    
    
        public static int getRandomInt(int min, int max) {
    Random random = new Random();

    return random.nextInt((max - min) + 1) + min;
}

public static ArrayList<Integer> getRandomNonRepeatingIntegers(int size, int min,
        int max) {
    ArrayList<Integer> numbers = new ArrayList<Integer>();

    while (numbers.size() < size) {
        int random = getRandomInt(min, max);

        if (!numbers.contains(random)) {
            numbers.add(random);
        }
    }

    return numbers;
}

    private static class ArrayList<T> {

        public ArrayList() {
        }

        private boolean contains(int random) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private int size() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private void add(int random) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }
    }
    

