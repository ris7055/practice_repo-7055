package LabTest2;

import java.util.ArrayList;

public class MyStack<E> {
    private ArrayList<E> list = new ArrayList();
    
    public void push(E o){
        list.add(o);
    }
    public E pop(){
        if (isEmpty()) return null;
        E element = list.get(list.size() - 1);
        list.remove(list.size() - 1);
        return element;
    }
    public E peek(){
        if (isEmpty()) return null;
        return list.get(list.size() - 1);
    }
    public int getSize(){
        return list.size();
    }
    public boolean isEmpty(){
        return list.isEmpty();
    }
    public String toString(){
        return "stack: " + list.toString();
    }
    public boolean search(E o){
        return list.contains(o);
    }
    
    public ArrayList<E> elements(){
        return list;
    }
}
