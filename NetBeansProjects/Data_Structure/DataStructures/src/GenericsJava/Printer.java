/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GenericsJava;


public class Printer <T> {  //<T> refers to whatever datatype we want to print such as integer,double etc;
    
    T thingToPrint;
    
    public Printer(T thingToPrint){
        this.thingToPrint = thingToPrint;
    }
    
    public void print(){
        System.out.println(thingToPrint);
    }
    
    
}
