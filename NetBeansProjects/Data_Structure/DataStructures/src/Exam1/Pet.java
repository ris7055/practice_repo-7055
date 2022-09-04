/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exam1;

/**
 *
 * @author asifc
 * @param <T>
 */
public class Pet implements Comparable<Pet> {
    private String breed, sickness;
    private double weight;
    
    @Override
    public int compareTo(Pet p) {
        if(this.weight > p.getWeight()) {
            return 1;
        }
        else if(this.weight < p.getWeight()) {
            return -1;
        }
        else {
            return 0;
        }
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getSickness() {
        return sickness;
    }

    public void setSickness(String sickness) {
        this.sickness = sickness;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
