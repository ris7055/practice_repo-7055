
package Linked_List;
import java.util.LinkedList;

/**
 *
 * @author MD Raffaul Islam
 */

public class Linky {
    
    public static void main(String[] args) {
     LinkedList linky = new LinkedList();
        
        linky.add("Rob");
        linky.add("Van");
        linky.add("Dan");
        
       
        System.out.println(linky);
        System.out.println(linky.getFirst());//prints the first element
        
        LinkedList<Integer> numkey = new LinkedList<>(); //not primitive data types but data types must be in full forms 
        
        numkey.add(1);// index starts from (0,1....)
        numkey.add(5);
        numkey.add(89);
        
       
        System.out.println( numkey);
        
   }
    
}
