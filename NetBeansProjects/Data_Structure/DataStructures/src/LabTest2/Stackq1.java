/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LabTest2;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

/**
 *
 * @author MD Raffaul Islam
 */
public class Stackq1 {
    public static void main(String[] args) {
    try {
      File myObj = new File("C:\\UM FSKTM AI Courses of 2nd Semester\\labtest2.txt");
        try (Scanner myReader = new Scanner(myObj)) {
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            } }
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      
    }
  }
}

