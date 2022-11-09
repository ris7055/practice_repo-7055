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
public class randomNum10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int i,a=1,small=10;

 
  { 
    Random ran=new Random();
    for(i=1;i<11;i++)//enter the range here by using for loop
    {

    a=ran.nextInt(10);//gives you any number from 0-10
    System.out.println("The random value of number "+i + " is " + a);

    if(a<small)//if given number is < than previous, make this number small
    small=a;
    }

    System.out.println("Minimum number is :"+small);
    }
 }}
    
    
