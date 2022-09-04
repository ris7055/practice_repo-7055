/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Constructors;

/**
 *
 * @author Hi
 */
public class Teacher {

    String name,gender;
    int phone;

     Teacher() { 
         System.out.println("No value");//incase if no value is given in any object 
                                        //such as teacher3 in main class
    }
    
    Teacher(String n,String m,int p){
      name = n;
      gender = m;
      phone = p;
    }
    
    void displayInformation(){ //return type (void) , displayinformation is method
        System.out.println("Name :"+name);
        System.out.println("Gender :"+gender);
        System.out.println("Phone :"+phone);
        System.out.println("\n \n");
    }
    
}