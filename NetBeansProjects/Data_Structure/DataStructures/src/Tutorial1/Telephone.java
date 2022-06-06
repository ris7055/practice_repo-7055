/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tutorial1;

/**
 *
 * @author Hi
 */
public class Telephone {
    // Instance variables
    private String areaCode;
    private int number;
    private static int numberOfTelephoneObject;
    
    // Constructor with first two instance variables as parameters
    public Telephone(String areaCode, int number) {
        this.areaCode = areaCode;
        this.number = number;
    }
    
    // Method to concatenate areaCode and number
    public String makeFullNumber() {
        return areaCode + "-" + Integer.toString(number);
    }

    // Setters and getters

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }
    
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
