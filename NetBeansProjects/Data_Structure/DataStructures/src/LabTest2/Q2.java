package LabTest2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Q2 {

    public static boolean isHTMLMatched(String html) {
        MyStack<String> buffer = new MyStack<>( );
        int j = html.indexOf('<'); // find first ’<’ character (if any)
        while (j != -1) {
            int k = html.indexOf('>', j+1); // find next ’>’ character
                if (k == -1)
                    return false; // invalid tag
            String tag = html.substring(j+1, k); // strip away < >
            if (!tag.startsWith("/")) // this is an opening tag
                buffer.push(tag);
            else { // this is a closing tag
                if (buffer.isEmpty( ))
                    return false; // no tag to match
                if (!tag.substring(1).equals(buffer.pop( )))
                    return false; // mismatched tag
                }
            j = html.indexOf('<', k+1); // find next ’<’ character (if any)
        }
        return buffer.isEmpty( ); // were all opening tags matched?
        }

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:/Users/User/Documents/test.xml");
        Scanner scan = new Scanner(file);
        MyStack<String> validName = new MyStack<>();
        MyStack<String> inValidName = new MyStack<>();
        while(scan.hasNext()){
            if(isHTMLMatched(scan.next())){
                validName.push(scan.next());
            }
            else{
                inValidName.push(scan.next());
            }
                
        }
        System.out.println(inValidName.pop());
    }
    
}
