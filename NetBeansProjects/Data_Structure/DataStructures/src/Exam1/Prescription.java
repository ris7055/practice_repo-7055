/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exam1;

/**
 *
 * @author asifc
 */
public class Prescription<T extends Pet> {
    private T t;
    private String medication;
    private int dosage;

    public Prescription(T t, String medication, int dosage) {
        this.t = t;
        this.medication = medication;
        this.dosage = dosage;
    }

    public String getMedication() {
        return medication;
    }

    public int getDosage() {
        return dosage;
    }
}
