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

public class Vet {
    private String name, qualification;

    public Vet(String name, String qualification) {
        this.name = name;
        this.qualification = qualification;
    }
    
    public void giveTreatment(ArrayList<Prescription> p) {
        for (Prescription p1 : p) {
            System.out.println(p1);
        }
    }

    @Override
    public String toString() {
        return "Vet{" + "name=" + name + ", qualification=" + qualification + '}';
    }

    public String getName() {
        return name;
    }

    public String getQualification() {
        return qualification;
    }
}
