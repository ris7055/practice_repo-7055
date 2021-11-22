# LAB Report 1
## Fundamentals of Programming(WIX1002)

> Write a program to check whether a triangle is valid or invalid. If the triangle is valid, 
check whether a triangle is Equilateral, Isosceles or Scalene

```
package Labreport01;


import java.util.Scanner;

/**
 *
 * @author MD Raffaul Islam
 */
public class LR01Q1 {

   
public static void main(String[] args) {
        
     Scanner input= new Scanner(System.in);
        int a, b, c;
        System.out.println("Enter length of each side of triangle: ");
        a= input.nextInt();
        b= input.nextInt();
        c= input.nextInt();
        while((a + b > c)&&(a + c > b)&&(b + c > a)){
             System.out.print("\nValid Triangle\n");
            //system will print Equilateral Triangle according to the condition
            if((a==b)&&(b==c)&&(c==a)){
                System.out.print("Equilateral Triangle");
                
            }
            //system will print Isosceles Triangle according to the condition
            else if((a==b)||(b==c)||(c==a)){
                System.out.print("Isosceles Triangle");break;
            }
            //system will print Scalene Triangle according to the condition
            else{
                System.out.print("Scalene Triangle");
                break;
                
            }
            
        System.out.println("\nEnter length of each side of triangle: "); 
        a= input.nextInt();
        b= input.nextInt();
        c= input.nextInt();
        }
        //If the result is invalid then program will terminate;
        if(!((a + b > c)&&(a + c > b)&&(b + c > a))){
            System.out.print("Invalid Triangle");
        }
}
}
```
