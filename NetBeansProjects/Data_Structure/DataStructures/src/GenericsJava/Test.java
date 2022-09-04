
package GenericsJava;


public class Test {

    
    public static void main(String[] args) {
        
        Printer<Integer> printer = new Printer<>(23);  //printing integer
        printer.print();
        
        Printer<Double>doublePrinter = new Printer<>(34.5); // printing double
        doublePrinter.print();
        
        Printer<String>stringPrinter = new Printer<>("Get Lost");
        stringPrinter.print();
        
               
        
    }
        
}
