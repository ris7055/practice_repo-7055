package Queue;

import java.util.Queue;
import java.util.LinkedList;

public class QueueFirst {

    
    public static void main(String[] args) {
        
        Queue<String> QueueFirst = new LinkedList<String>();
        
        QueueFirst.add("Hason");
        QueueFirst.add("jason");
        QueueFirst.add("saim");
        
        //QueueFirst.poll();//poll is to take the first element out from the line
        System.out.println(QueueFirst.poll());
        QueueFirst.peek();//peek confirms the first element
        System.out.println(QueueFirst);
        
        
    }
    
}
