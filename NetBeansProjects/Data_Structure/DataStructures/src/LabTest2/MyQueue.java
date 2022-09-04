
package LabTest2;

import java.util.LinkedList;

public class MyQueue<E> {
    private LinkedList<E> list = new LinkedList();
    
    public MyQueue(E[] e){
        for(E element : e){
            enqueue(element);
        }
    }
    public MyQueue(){
        
    }
    public void enqueue(E e){
        list.add(e);
    }
    public E dequeue(){
        if (list.isEmpty()) return null;
        return list.removeFirst();
    }
    public E getElement(int i){
        if (i < 0 || i >= list.size()) return null;
        return list.get(i);
    }
    public E peek(){
        return list.getFirst();
    }
    public int getSize(){
        return list.size();
    }
    public boolean contains(E e){
        return list.contains(e);
    }
    public boolean isEmpty(){
        return list.isEmpty();
    }
    public String toString(){
        return list.toString();
    }
}
