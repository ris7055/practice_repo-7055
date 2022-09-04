
package overloading_constructor;


public class Test {

    
    public static void main(String[] args) {
        
        Teacher teacher1 = new Teacher();
        
        Teacher teacher2 = new Teacher("MD Raffaul Islam","male");
        teacher2.displayInformation();
        
        Teacher teacher3 = new Teacher("MD Raffaul Islam","Male",1721372880);
        teacher3.displayInformation();
        
        
  }
    
}
