/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tutorial1;

/**
 *
 * @author MD Raffaul Islam
 */
public class C {
    public static void main(String[] args) {  // Answer is a. AB
        Object[] o = {new A(), new B()};
        System.out.print(o[0]);
        System.out.print(o[1]);
    }
}

class A extends B {
    public String toString() {
        return "A";
    }
}

class B {
    public String toString() {
        return "B";
    }
}