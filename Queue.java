package PERTEMUAN10;

import java.util.LinkedList;

public class Queue<E> {
    private LinkedList<E> linkedList;

    public Queue() {
        linkedList = new LinkedList<>();
    }

    public void add(E e) {
        linkedList.add(e);
    }

    public E remove() {
        return linkedList.remove();
    }

    public void enqueue(E e) {
        add(e);
    }

    public E dequeue() {
        return remove();
    }

    public boolean isEmpty() {
        return linkedList.isEmpty();
    }

}
