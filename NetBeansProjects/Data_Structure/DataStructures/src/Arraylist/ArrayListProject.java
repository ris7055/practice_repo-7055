/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Arraylist;
import java.util.ArrayList;
/**
 *
 * @author MD Raffaul Islam
 */
public class ArrayListProject {

    
    public static void main(String[] args) {
   //Array;    
       String[] fruits = new String[3];// [3] is the index
       fruits[0] = "Mango";
       fruits[1] = "Apple";
       fruits[2] = "Strawberry";
        System.out.println(fruits[1]); //an array cannot print the added amount of object unless it is inputed in index
   
     //Arraylist;
        ArrayList fruitlist = new ArrayList();//ArrayList<String> cities = new ArrayList<String>(); or; ArrayList<String> cities = new ArrayList<>();
        
        fruitlist.add("Mango");// .add command has many variations that can be useful
        fruitlist.add("Apple");
        fruitlist.add("Strawberry");
        fruitlist.add("Watermelon");//for example if extra object is added
        System.out.println(fruitlist); // an array list can print anything added to it later on or it can print more objects without any need of index
    }
    
}
