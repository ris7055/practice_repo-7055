/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exam1;

import java.util.ArrayList;

/**
 *
 * @author asifc
 */
public class Clinic {
    private String name;
    private Vet v;

    public Vet getV() {
        return v;
    }

    public String getName() {
        return name;
    }

    public Clinic(String name, Vet v) {
        this.name = name;
        this.v = v;
    }
    
    public static void main(String[] args) {
        Vet v = new Vet("Abu Bakar", "DVM(India)");
        Clinic c = new Clinic("Happy Animal Clinic", v);
        Cat c1 = new Cat("Dimmy", "Siamese", "Diarrhea",5);
        Cat c2 = new Cat("Tabby", "British Shorthair", "Worms", 6);
        
        ArrayList<Prescription<Cat>> list = new ArrayList<>();
        
        Prescription p1 = new Prescription(c1, "Tylosin", 5);
        Prescription p2 = new Prescription(c2, "Pyrantel", 3);
        
        System.out.println("Clinic: " + c.getName());
        System.out.println("Vet on Duty: " + v.getName() + ", " + v.getQualification());
        System.out.println();
        
        System.out.println("Prescription Note");
        System.out.println("Breed: " + c2.getName());
        System.out.println("Weight(KG): " + c2.getWeight());
        System.out.println("Sickness: " + c2.getSickness());
        System.out.println("Medication: " + p1.getMedication());
        System.out.println("Dosage(ml): " + p1.getDosage());
        System.out.println();
        
        System.out.println("Prescription Note");
        System.out.println("Breed: " + c2.getName());
        System.out.println("Weight(KG): " + c1.getWeight());
        System.out.println("Sickness: " + c1.getSickness());
        System.out.println("Medication: " + p2.getMedication());
        System.out.println("Dosage(ml): " + p2.getDosage());
        System.out.println();
        
        // Since, c1.compareTo(c2) = -1, Tabby is heavier than Dimmy
        
        System.out.println("Weight analysis: Tabby is heavier than Dimmy");
    }
}
