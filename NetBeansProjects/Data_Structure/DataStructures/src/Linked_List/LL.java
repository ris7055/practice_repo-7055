
package Linked_List;
import java.util.LinkedList;

public class LL {
    Node head;
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
        }
    }
    //first operation: add first- last

    /**
     *
     * @param data
     */
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = (Node) head;
        head = newNode;
    }

    // add- last
    public void addLast(String data){
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }
//print list
    public void printList(){
        if (head == null){
            System.out.println("list is empty");
            return;
        }
        Node currNode = head;
        while(currNode != null){
            System.out.println(currNode.data +" -> ");
            currNode = currNode.next;
        }

   
    public static void main(String[] args) {
            LL list = new LL ();//same class object is to be created
        list.addFirst("a");
        list.addFirst("is");
        list.printList();
    }
}


