
package returning_value;


import java.util.Scanner;

public class Test {

    
    public static void main(String[] args) {
        System.out.print("Please input an integer :");
        Scanner input = new Scanner(System.in);
        
        int number = input.nextInt();
        
        returning_value_demo ob1 = new  returning_value_demo();
        //int result = ob1.square(number);
        System.out.println("square of input number is "+ob1.square(number));
        
        
        
    }
    
}
