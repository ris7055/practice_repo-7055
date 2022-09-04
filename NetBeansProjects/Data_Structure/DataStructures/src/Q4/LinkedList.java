package Q4;

public class LinkedList<E> {
    private Node<E> head, tail;
    private int size=0;
    
    public LinkedList() { }
    
    public int getSize() {
        return size;
    }
    
    public void addLast(E e) {
        if (tail == null) head = tail = new Node<>(e);
        else {
            tail.next = new Node<>(e);
            tail = tail.next;
        }
        size++;
    }
    
    public E removeFirst() {
        if (size == 0) return null;
        else {
            Node<E> temp = head;
            head = head.next;
            size--;
            if (head == null) tail = null;
            return temp.element;
        }
    }
    
    public E removeLast() {
        if (size == 0) return null;
        else if (size == 1) {
            Node<E> temp = head;
            head = tail = null;
            size = 0;
            return temp.element;
        }
        else {
            Node<E> current = head;
            for (int i = 0; i < size - 2; i++)
                current = current.next;
            Node<E> temp = tail;
            tail = current;
            tail.next = null;
            size--;
            return temp.element;
        }
    }
    
    public E remove(int index) {
        if (index < 0 || index >= size) return null;
        else if (index == 0) return removeFirst();
        else if (index == size - 1) return removeLast();
        else {
            Node<E> previous = head;
            for (int i = 1; i < index; i++)
                previous = previous.next;
            Node<E> current = previous.next;
            previous.next = current.next;
            size--;
            return current.element;
        }
    }
    
    // Question 4(b)
    public E get(int index) {
        if (index < 0 || index >= size) return null; // No element outside the linked list
        else if (index == 0) return head.element; // get head element
        else if (index == size - 1) return tail.element; // get tail element
        else {
            Node<E> current = head;
            for (int i = 0; i < index; i++) { //stops at the index element
                current = current.next;
            }
            return current.element; //returns the index element
        }    
    }
    
    // Question 4(c)
    @Override
    public LinkedList<E> clone() {
        LinkedList<E> clone = new LinkedList<>();
        
        for (Node<E> x = head; x != null; x = x.next)
            clone.addLast(x.element);

        return clone;
    }
}