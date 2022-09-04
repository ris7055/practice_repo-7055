/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tutorial1;

/**
 *
 * @author Hi
 */
public abstract class Vehicle {  // An instance of vehicle cannot be created since it is abstract
    private double maxSpeed;
    protected double currentSpeed;
    
    public Vehicle(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    
    public abstract void accelerate();
    
    public void pedalToTheMetal() {
        while(currentSpeed != maxSpeed) {
            accelerate();
        }
    }
    
    public double getCurrentSpeed() {
        return currentSpeed;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }  
}
